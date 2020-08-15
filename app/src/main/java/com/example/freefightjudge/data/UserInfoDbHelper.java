package com.example.freefightjudge.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserInfoDbHelper extends SQLiteOpenHelper {
  private UserInfoDbHelper userInfoDbHelper;

  private Cursor cursor;

  private Context context;

  private SQLiteDatabase sqLiteDatabase;

  public static final String LOG_TAG = UserInfoDbHelper.class.getSimpleName();

  private static final String DATABASE_NAME = "user_info.db";

  private static final int DATABASE_VERSION = 1;

  public UserInfoDbHelper(Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
    this.context = context;
  }

  @Override
  public void onCreate(SQLiteDatabase sqLiteDatabase) {
    String SQL_CREATE_USERINFO_TABLE = "CREATE TABLE " + UsersContract.UserInfo.TABLE_NAME
        + " (" + UsersContract.UserInfo._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
        + UsersContract.UserInfo.COLUMN_FIRSTNAME + " TEXT NOT NULL, "
        + UsersContract.UserInfo.COLUMN_LASTNAME + " TEXT NOT NULL, "
        + UsersContract.UserInfo.COLUMN_DATEREGISTER + " TEXT NOT NULL, "
        + UsersContract.UserInfo.COLUMN_RANK + " INTEGER NOT NULL DEFAULT 1, "
        + UsersContract.UserInfo.COLUMN_SCORE + " INTEGER NOT NULL DEFAULT 0);";

    sqLiteDatabase.execSQL(SQL_CREATE_USERINFO_TABLE);
  }

  @Override
  public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {}

  public void addNewUser(String firstName, String lastName) {
    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String date = dateFormat.format(calendar.getTime());

    String insert = "INSERT INTO " +
        UsersContract.UserInfo.TABLE_NAME + " (" +
        UsersContract.UserInfo.COLUMN_FIRSTNAME + ", " +
        UsersContract.UserInfo.COLUMN_LASTNAME + ", " +
        UsersContract.UserInfo.COLUMN_DATEREGISTER + ") VALUES ('" +
        firstName + "', '" + lastName + "', '" + date + "')";

    userInfoDbHelper = new UserInfoDbHelper(context);
    sqLiteDatabase = userInfoDbHelper.getWritableDatabase();
    sqLiteDatabase.execSQL(insert);
  }

  public String[][] getAllUsersData(Context context) {
    String[][] data = null;

    userInfoDbHelper = new UserInfoDbHelper(context);

    try {
      sqLiteDatabase = userInfoDbHelper.getReadableDatabase();

      cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + UsersContract.UserInfo.TABLE_NAME, null);

      if (cursor.moveToFirst()) {
        data = new String[cursor.getColumnCount()][cursor.getCount()];
      }

      int i = 0;
      
      do {
        data[cursor.getColumnIndex(UsersContract.UserInfo._ID)][i] =
            cursor.getString(cursor.getColumnIndex(UsersContract.UserInfo._ID));

        data[cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_FIRSTNAME)][i] =
            cursor.getString(cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_FIRSTNAME));

        data[cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_LASTNAME)][i] =
            cursor.getString(cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_LASTNAME));

        data[cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_DATEREGISTER)][i] =
            cursor.getString(cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_DATEREGISTER));

        data[cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_SCORE)][i] =
            cursor.getString(cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_SCORE));

        data[cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_RANK)][i] =
            cursor.getString(cursor.getColumnIndex(UsersContract.UserInfo.COLUMN_RANK));

        i++;
      } while (cursor.moveToNext());

      cursor.close();

    } catch (Exception e) {
      Toast toast = new Toast(context);
      toast.setText("Произошла ошибка в базе данных!"
          + "Возможно Вы не добавили ни одного пользователя.");
      toast.show();
    }

    return data;
  }
}

