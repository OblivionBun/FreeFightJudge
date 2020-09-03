package com.example.freefightjudge.data.dagger;

import com.example.freefightjudge.MainActivity;
import dagger.Component;

@Component(modules = {StorageModule.class})
public interface AppComponent {
  void injectMainActivity(MainActivity mainActivity);
}
