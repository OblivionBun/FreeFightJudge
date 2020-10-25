package com.example.freefightjudge.dagger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class DaggerApplication extends Application implements HasActivityInjector {
  private ApplicationComponent applicationComponent;
  
  @Inject
  DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

  @Inject
  public Context context;

  @Override
  public void onCreate() {
    super.onCreate();

    DaggerApplicationComponent
        .builder()
        .applicationModule(new ApplicationModule(context, this))
        .storageModule(new StorageModule(this))
        .build();
    applicationComponent.inject(this);
  }

  public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }
  
  @Override
  public AndroidInjector<Activity> activityInjector() {
    return dispatchingAndroidInjector;
  }
}
