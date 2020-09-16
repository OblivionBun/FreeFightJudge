package com.example.freefightjudge.data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.example.freefightjudge.MainActivity;
import com.example.freefightjudge.SimpleDbTable;
import com.example.freefightjudge.data.dagger.DaggerApplication;
import com.example.freefightjudge.data.room.AppDatabase;
import com.example.freefightjudge.data.room.Executor;
import com.example.freefightjudge.data.room.Rank;
import com.example.freefightjudge.data.room.RankDao;
import com.example.freefightjudge.data.room.User;
import com.example.freefightjudge.data.room.UserDao;
import com.example.freefightjudge.data.room.UserWithRank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.internal.subscribers.StrictSubscriber;

public class DatabaseWrapper extends AppCompatActivity {
  @Inject
  public AppDatabase appDatabase;

  private List<UserWithRank> userList;

  private UserDao userDao;

  private RankDao rankDao;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ((DaggerApplication)getApplication())
        .getApplicationComponent()
        .inject(this);

    userDao = appDatabase.userDao();
    rankDao = appDatabase.rankDao();
  }

  public void addNewUser(String firstName, String lastName) {
    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String date = dateFormat.format(calendar.getTime());

    User user = new User();
    user.setFirstName(firstName);
    user.setLastName(lastName);
    user.setDateRegister(date);

    Executor.IoThread(() -> userDao.insert(user));
  }

  public String[][] getAllUsers() {
    String[][] data = null;

    Executor.IoThread(new Runnable() {
      @Override
      public void run() {
        userList = userDao.getAllUsersWithRank();
      }
    });
    for (int i = 0; i < userList.size(); i++) {
      data[i][SimpleDbTable.COLUMN_ID] = String.valueOf(userList.get(i).getId());
      data[i][SimpleDbTable.COLUMN_FIRST_NAME] = userList.get(i).getFirstName();
      data[i][SimpleDbTable.COLUMN_LAST_NAME] = userList.get(i).getLastName();
      data[i][SimpleDbTable.COLUMN_DATE_REGISTER] = userList.get(i).getDateRegister();
      data[i][SimpleDbTable.COLUMN_SCORE] = String.valueOf(userList.get(i).getScore());
      data[i][SimpleDbTable.COLUMN_RANK] = userList.get(i).getRankName();
    }

    return data;
  }
}