package com.example.freefightjudge.data.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ConcurrentModificationException;

@Database(entities = {User.class, Rank.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
  public abstract UserDao userDao();
/*
  public static void addNewUser(String firstName, String lastName, Context context) {


    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");

    User user = new User();

    user.setFirstName(firstName);
    user.setLastName(lastName);
    user.setDateRegister(dateFormat.format(calendar.getTime()));

  }

  public static String[][] getAll() {
    String[][] data = null;

    UserWithRank userWithRank;
    


    return data;
  }
*/
}
