package com.example.freefightjudge.dagger2;

import android.app.Activity;
import android.content.Context;

import com.example.freefightjudge.data.DatabaseWrapper;
import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {DatabaseModule.class, AndroidInjectionModule.class})
public interface AppComponent {
  @Component.Builder
  interface Builder {
    
    @BindsInstance
    Builder context(Context context);
    
    @BindsInstance
    Builder databaseContext(@Named("databaseContext") Context context);
    
    Builder databaseModule(DatabaseModule databaseModule);
    
   /*@BindsInstance
   Builder databaseModule(DatabaseModule databaseModule);*/
   
    AppComponent build();
  }
  
  void inject(App app);
  void inject(DatabaseWrapper databaseWrapper);
}
