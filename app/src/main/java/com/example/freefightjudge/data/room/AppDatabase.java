package com.example.freefightjudge.data.room;

import android.content.Context;
import androidx.room.Database;
import androidx.room.RoomDatabase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.RandomAccess;

@Database(entities = {User.class, Rank.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
  public static final String DB_NAME = "database";
  
  public abstract UserDao userDao();
  
  public abstract RankDao rankDao();
}
