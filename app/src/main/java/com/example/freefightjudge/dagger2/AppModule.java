package com.example.freefightjudge.dagger2;

import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Singleton;

import dagger.Module;

@Module
public interface AppModule {
  @Singleton
  AppDatabase appDatabase();
  
  
}
