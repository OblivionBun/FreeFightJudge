package com.example.freefightjudge.dagger;

import android.app.Application;
import android.content.Context;

import com.example.freefightjudge.data.DatabaseWrapper;

import dagger.Component;

import javax.inject.Singleton;

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
