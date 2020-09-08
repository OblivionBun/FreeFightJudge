package com.example.freefightjudge.data.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity/*(foreignKeys = @ForeignKey(entity = User.class, parentColumns = "rank", childColumns = "id"))*/
public class Rank {
  @PrimaryKey
  @ColumnInfo(name = "rank_id")
  private int rankId;

  @ColumnInfo(name = "rank_name")
  private String rankName;

  public void setRankId(int rankId) {
    this.rankId = rankId;
  }

  public int getRankId() {
    return rankId;
  }

  public String getRankName() {
    return rankName;
  }

  public void setRankName(String rankName) {
    this.rankName = rankName;
  }
}