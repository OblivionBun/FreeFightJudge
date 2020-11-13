package com.example.freefightjudge.dagger2;

import android.app.Application;
import android.content.Context;

import com.example.freefightjudge.data.DatabaseWrapper;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {DatabaseModule.class, AndroidInjectionModule.class})
public interface AppComponent {
  @Component.Builder
  interface Builder {
    
    @BindsInstance
    Builder context(Context context);
    
    Builder databaseModule(DatabaseModule databaseModule);
    
    @BindsInstance
    Builder dbContext(@Named("db_context") Context context);
    
    AppComponent build();
  }
  
  void inject(App app);
  void inject(DatabaseWrapper databaseWrapper);
}
