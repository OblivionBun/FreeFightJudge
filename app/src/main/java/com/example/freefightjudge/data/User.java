package com.example.freefightjudge.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

  @PrimaryKey
  public int id;
  public String firstName;
  // TODO: Продолжить изучать Room и переехать на него
}