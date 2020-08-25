package com.example.freefightjudge.data.room;

import androidx.room.*;

@Dao
public interface UserDao {
  @Query("SELECT * FROM User")
  String[][] getAll();

  @Query("SELECT * FROM User WHERE id = :id")
  User getById(int id);

  @Insert
  void insert(User user);

  @Update
  void update(User user);

  @Delete
  void delete(User user);
}
