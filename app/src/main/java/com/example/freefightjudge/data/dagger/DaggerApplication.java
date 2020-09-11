package com.example.freefightjudge.data.dagger;

import android.app.Application;

public class DaggerApplication extends Application {
  private ApplicationComponent applicationComponent;

  @Override
  public void onCreate() {
    super.onCreate();

    /*applicationComponent = DaggerApplicationComponent
        .builder()
        .applicationModule(new ApplicationModule(context, this))
        .storageModule(new StorageModule(this))
        .build();
    applicationComponent.inject(this);*/
  }

  /*public ApplicationComponent getApplicationComponent() {
    return applicationComponent;
  }*/
}
