package com.example.freefightjudge.data.dagger;

import android.content.Context;
import androidx.room.Room;
import com.example.freefightjudge.data.room.AppDatabase;
import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {

  @Provides
  public AppDatabase provideAppDatabase(Context context) {
    return Room.databaseBuilder(context, AppDatabase.class, "database").build();
  }
}
