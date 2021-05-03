package com.example.freefightjudge.dagger2;

import android.content.Context;

import androidx.room.Room;

import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DatabaseModule {
  @Inject
/*  @Named("db_context")*/
  public Context context;
  
  /*public DatabaseModule(Context context) {
    this.context = context;
  }*/
  
  @Provides
  @Singleton
  AppDatabase provideAppDatabase() {
    System.out.println("provide DB");
    return Room.databaseBuilder(context, AppDatabase.class,
        AppDatabase.DB_NAME).fallbackToDestructiveMigration().build();
  }
  
  /*@Provides
  @Singleton
  public String providedbName() {
    return AppDatabase.DB_NAME;
  }*/
  
/*  @ContributesAndroidInjector(modules = {DatabaseWrapperModule.class})
  abstract DatabaseWrapper dataBaseWrapperInjector();*/
}
