package com.example.freefightjudge.dagger2;

import android.content.Context;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {DatabaseModule.class})
public interface AppComponent {
  @Component.Builder
  interface Builder {
    @BindsInstance
    Builder context(Context context);
    AppComponent build();
  }
  void inject(App app);
}
