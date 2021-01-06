package com.example.freefightjudge.data;

import android.provider.BaseColumns;

public final class UsersContract {
  
  public static final class UserInfo implements BaseColumns {
    public final static String TABLE_NAME = "user_info";
    
    public final static String _ID = BaseColumns._ID;
    
    public final static String COLUMN_FIRSTNAME = "first_name";
    
    public final static String COLUMN_LASTNAME = "last_name";
    
    public final static String COLUMN_DATEREGISTER = "date_register";
    
    public final static String COLUMN_SCORE = "score";
    
    public final static String COLUMN_RANK = "rank";
  }
  
}
