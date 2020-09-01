package com.example.freefightjudge.data.room;

import androidx.room.ColumnInfo;
import androidx.room.Relation;

public class UserWithRank {
  private int id;

  @ColumnInfo(name = "first_name")
  private String firstName;

  @ColumnInfo(name = "last_name")
  private String lastName;

  @ColumnInfo(name = "date_register")
  private String dateRegister;

  @ColumnInfo(defaultValue = "0")
  private int score;

  @Relation(parentColumn = "id", entityColumn = "rank_id")
  private Rank rank;

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

  public Rank getRank() {
    return rank;
  }

  public void setRank(Rank rank) {
    this.rank = rank;
  }
}
