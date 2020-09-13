package com.example.freefightjudge.data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.example.freefightjudge.MainActivity;
import com.example.freefightjudge.data.dagger.DaggerApplication;
import com.example.freefightjudge.data.room.AppDatabase;
import com.example.freefightjudge.data.room.Executor;
import com.example.freefightjudge.data.room.User;
import com.example.freefightjudge.data.room.UserDao;

import javax.inject.Inject;

public class DatabaseWrapper extends AppCompatActivity {
  @Inject
  public AppDatabase appDatabase;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ((DaggerApplication)getApplication())
        .getApplicationComponent()
        .inject(this);

    final UserDao userDao = appDatabase.userDao();
    /*Executor.IoThread(() -> userDao.insert(new User()));*/
  }
}