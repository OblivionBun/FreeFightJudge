package com.example.freefightjudge.dagger2;

import android.app.Application;

import dagger.android.AndroidInjector;
import dagger.android.HasAndroidInjector;

public class App extends Application implements HasAndroidInjector {
  @Override
  public AndroidInjector<Object> androidInjector() {
    return null;
  }
}
