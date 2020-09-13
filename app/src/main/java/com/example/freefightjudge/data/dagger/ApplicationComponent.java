package com.example.freefightjudge.data.dagger;

import android.app.Application;
import android.content.Context;
import androidx.room.ColumnInfo;
import androidx.room.Database;
import com.example.freefightjudge.MainActivity;
import com.example.freefightjudge.data.DatabaseWrapper;

import dagger.Component;
import dagger.Provides;

import javax.inject.Singleton;
import java.sql.DatabaseMetaData;

@Singleton
@Component(modules = {
    ApplicationModule.class,
    StorageModule.class
})
public interface ApplicationComponent {
  void inject (DaggerApplication daggerApplication);
  void inject (DatabaseWrapper databaseWrapper);

  Context getContext();

  Application getApplication();

  String getDatabaseName();
}
