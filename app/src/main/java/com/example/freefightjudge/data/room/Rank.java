package com.example.freefightjudge.data.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = User.class, parentColumns = "rank", childColumns = "id"))
public class Rank {
  @PrimaryKey
  private int id;

  @ColumnInfo(name = "rank_name")
  private String rankName;
}
