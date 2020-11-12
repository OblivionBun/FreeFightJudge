package com.example.freefightjudge.dagger2;

import android.app.Activity;
import android.app.Application;

import androidx.room.Room;

import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Inject;

import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.HasAndroidInjector;

public class App extends Application implements HasAndroidInjector {
  protected AppComponent appComponent;
  
  @Inject
  DispatchingAndroidInjector<Object> dispatchingAndroidInjector;
  
  @Override
  public void onCreate() {
    super.onCreate();
    
    appComponent = DaggerAppComponent
        .builder()
        .context(this)
        /*.databaseContext(getApplicationContext())*/
        .databaseModule(new DatabaseModule())
        .build();
        
    appComponent.inject(this);
  }
  
  public AppComponent getAppComponent() {
    return appComponent;
  }
  
  @Override
  public AndroidInjector<Object> androidInjector() {
    return dispatchingAndroidInjector;
  }
  
  
}
