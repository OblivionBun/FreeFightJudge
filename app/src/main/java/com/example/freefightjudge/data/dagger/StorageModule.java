package com.example.freefightjudge.data.dagger;

import android.content.Context;
import androidx.room.Room;
import com.example.freefightjudge.data.room.AppDatabase;
import com.example.freefightjudge.data.room.UserDao;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;

@Module
public class StorageModule {
  private final Context context;

  private final String dbName = "database";

  public StorageModule(Context context) {
    this.context = context;
  }

  @Singleton
  @Provides
  public AppDatabase provideAppDatabase(Context context) {
    return Room.databaseBuilder(context, AppDatabase.class, "database")
        .fallbackToDestructiveMigrationOnDowngrade()
        .build();
  }

  @Provides
  String provideDatabaseName() {
    return dbName;
  }

  @Singleton
  @Provides
  UserDao provideUserDao(AppDatabase database) {
    return database.userDao();
  }
}
