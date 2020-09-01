package com.example.freefightjudge.data.room;

import androidx.room.*;

@Entity
public class User {

  @PrimaryKey(autoGenerate = true)
  private int id;

  @ColumnInfo(name = "first_name")
  private String firstName;

  @ColumnInfo(name = "last_name")
  private String lastName;

  @ColumnInfo(name = "date_register")
  private String dateRegister;

  @ColumnInfo(defaultValue = "0")
  private int score;

  @ColumnInfo(defaultValue = "1", name = "rank")
  private int rank;

  public int getId() {
    return id;
  }

  public User(int id) {
    this.id = id;
  }

  public User() {}

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getDateRegister() {
    return dateRegister;
  }

  public void setDateRegister(String dateRegister) {
    this.dateRegister = dateRegister;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getRank() {
    return rank;
  }

  public void setRank(int rank) {
    this.rank = rank;
  }

// TODO: Продолжить изучать Room и переехать на него
}