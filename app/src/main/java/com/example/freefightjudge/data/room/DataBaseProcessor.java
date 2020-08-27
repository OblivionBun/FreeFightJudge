package com.example.freefightjudge.data.room;

import android.content.Context;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ConcurrentModificationException;

public class DataBaseProcessor {

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

    


    return data;
  }

}
