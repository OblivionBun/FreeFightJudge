package com.example.freefightjudge.dagger2;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Inject;

import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.HasAndroidInjector;

public class App extends Application implements HasAndroidInjector {
  public AppComponent appComponent;
  
  @Inject
  DispatchingAndroidInjector<Object> dispatchingAndroidInjector;
  
  @Override
  public void onCreate() {
    super.onCreate();
    System.out.println("Сработал онКреате в Апп");
    appComponent = DaggerAppComponent
        .builder()
        .context(this)
        .databaseModule(new DatabaseModule())
        .build();
        
    appComponent.inject(this);
    System.out.println(appComponent);
  }
  
  public AppComponent getAppComponent() {
    System.out.println(appComponent + " on getAppComp");
    return DaggerAppComponent
        .builder()
        .context(this)
        .databaseModule(new DatabaseModule())
        .build();
  }
  
  @Override
  public AndroidInjector<Object> androidInjector() {
    return dispatchingAndroidInjector;
  }
  
  
}
