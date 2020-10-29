package com.example.freefightjudge.dagger2;

import com.example.freefightjudge.PreFightActivity;
import com.example.freefightjudge.data.DatabaseWrapper;
import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface DatabaseModule {
  @Singleton
  AppDatabase appDatabase();
  
  @ContributesAndroidInjector(modules = {DatabaseWrapperModule.class})
  DatabaseWrapper dataBaseWrapperInjector();
}
