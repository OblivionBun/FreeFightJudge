package com.example.freefightjudge.data.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RankDao {
  @Query("SELECT * FROM Rank")
  List<Rank> getAll();
  
  @Query("INSERT INTO Rank (rank_id, rank_name) VALUES (:id, :string)")
  void insert(int id, String string);
}
