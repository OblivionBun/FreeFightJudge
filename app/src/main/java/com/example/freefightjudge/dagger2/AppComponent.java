package com.example.freefightjudge.dagger2;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {DatabaseModule.class})
public interface AppComponent extends AndroidInjector<Object> {
  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder context(Context context);
    AppComponent build();
  }
  
  void inject(App app);
}
