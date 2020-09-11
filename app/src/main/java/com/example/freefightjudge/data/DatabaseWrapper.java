package com.example.freefightjudge.data;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;

import com.example.freefightjudge.MainActivity;
import com.example.freefightjudge.data.dagger.DaggerApplication;
import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Inject;

public class DatabaseWrapper extends AppCompatActivity {
  @Inject
  AppDatabase appDatabase;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ((DaggerApplication)getApplication())
        .getApplicationComponent()
        .inject(this);
  }
}