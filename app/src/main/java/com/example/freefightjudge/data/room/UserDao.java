package com.example.freefightjudge.data.room;

import androidx.room.*;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface UserDao {
  @Query("SELECT * FROM user, rank")
  List<UserWithRank> getAllUsersWithRank();

  @Query("SELECT * FROM User WHERE id = :id")
  User getById(int id);

  @Insert
  void insert(User user);

  @Update
  void update(User user);

  @Delete
  void delete(User user);
}
