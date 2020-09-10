package com.example.freefightjudge.data.dagger;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ApplicationModule {
  private final Application application;

  public ApplicationModule(Application application) {
    this.application = application;
  }

  @Singleton
  @Provides
  @ApplicationContext
  Context provideContext() {
    return application;
  }

  @Singleton
  @Provides
  Application provideApplication() {
    return application;
  }
}
