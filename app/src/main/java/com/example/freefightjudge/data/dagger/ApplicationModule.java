package com.example.freefightjudge.data.dagger;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ApplicationModule {
  private final Context context;
  private final Application application;

  public ApplicationModule(Context context, Application application) {
    this.context = context;
    this.application = application;
  }

  @Singleton
  @ApplicationContext
  @Provides
  Context provideContext() {
    return context;
  }

  @Singleton
  @Provides
  Application provideApplication() {
    return application;
  }
}
