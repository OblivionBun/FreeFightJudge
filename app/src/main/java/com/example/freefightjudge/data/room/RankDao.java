package com.example.freefightjudge.data.room;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RankDao {
  @Query("SELECT * FROM Rank")
  List<Rank> getAll();
}
