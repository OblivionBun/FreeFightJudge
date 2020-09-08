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

  @ColumnInfo(name = "rank_id", defaultValue = "1")
  private int rankId;

  public User() {}

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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

  public int getRankId() {
    return rankId;
  }

  public void setRankId(int rank) {
    this.rankId = rank;
  }

// TODO: Продолжить изучать Room и переехать на него
}