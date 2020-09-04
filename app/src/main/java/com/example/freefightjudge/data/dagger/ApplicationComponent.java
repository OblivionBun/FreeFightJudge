package com.example.freefightjudge.data.dagger;

import android.app.Application;
import android.content.Context;
import androidx.room.ColumnInfo;
import androidx.room.Database;
import com.example.freefightjudge.MainActivity;
import dagger.Component;

import javax.inject.Singleton;
import java.sql.DatabaseMetaData;

@Singleton
@Component(modules = {
    ApplicationModule.class,
    StorageModule.class
})
public interface ApplicationComponent {
  void inject (MainActivity mainActivity);

  @ApplicationContext
  Context getContext();

  Application getApplication();

  @DatabaseInfo
  String getDatabaseName();
}
