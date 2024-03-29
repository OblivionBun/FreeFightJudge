package com.example.freefightjudge.data.room;

import androidx.room.*;

import java.util.List;

@Dao
public interface UserDao {
  @Transaction
  @Query("SELECT * FROM user, rank")
  List<UserWithRank> getAllUsersWithRank();

  @Query("SELECT * FROM user WHERE id = :id")
  User getById(int id);

  @Insert
  void insert(User user);

  @Update
  void update(User user);

  @Delete
  void delete(User user);
}
