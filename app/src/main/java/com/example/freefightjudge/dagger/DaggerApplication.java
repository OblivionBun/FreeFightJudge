package com.example.freefightjudge.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

public class DaggerApplication extends Application {
  private ApplicationComponent applicationComponent;

  @Inject
  public Context context;

  @Override
  public void onCreate() {
    super.onCreate();

    applicationComponent = DaggerApplicationComponent
        .builder()
        .applicationModule(new ApplicationModule(context, this))
        .storageModule(new StorageModule(this))
        .build();
    applicationComponent.inject(this);
  }

  public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }
}
