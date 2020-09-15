package com.example.freefightjudge.data.room;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
  public static void IoThread(Runnable runnable) {
    ExecutorService IO_EXECUTOR = Executors.newSingleThreadExecutor();
    IO_EXECUTOR.execute(runnable);
  }
}
