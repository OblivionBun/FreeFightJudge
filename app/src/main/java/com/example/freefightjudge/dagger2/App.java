package com.example.freefightjudge.dagger2;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.room.Room;

import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Inject;

import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.HasAndroidInjector;

public class App extends Service implements HasAndroidInjector {
  public AppComponent appComponent;
  
  @Inject
  DispatchingAndroidInjector<Object> dispatchingAndroidInjector;
  
  @Override
  public void onCreate() {
    super.onCreate();
    System.out.println("Сработал онКреате в Апп");
    appComponent = DaggerAppComponent
        .builder()
        .context(getApplicationContext())
        .databaseModule(new DatabaseModule())
        .build();
        
    appComponent.inject(this);
    System.out.println(appComponent);
  }
  
  @Nullable
  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }
  
  public AppComponent getAppComponent() {
    System.out.println(appComponent + " on appComp in getAppComp");
    AppComponent component = DaggerAppComponent
        .builder()
        .context(getApplicationContext())
        .databaseModule(new DatabaseModule())
        .build();
    System.out.println(component + " on component in getAppComp");
    return component;
  }
  
  @Override
  public AndroidInjector<Object> androidInjector() {
    return dispatchingAndroidInjector;
  }
  
  
}
