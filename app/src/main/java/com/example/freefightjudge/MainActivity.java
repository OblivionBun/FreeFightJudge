package com.example.freefightjudge;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.freefightjudge.data.UserInfoDbHelper;
import com.example.freefightjudge.data.room.AppDatabase;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  private ImageButton imgbtnAvatar;

  private ImageButton imgbtnTotemon;

  private LinearLayout btnLoutProfile;

  private LinearLayout btnLoutFriends;

  private LinearLayout btnLoutMeeting;

  private LinearLayout btnLoutFight;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    imgbtnAvatar = (ImageButton) findViewById(R.id.main_menu_imgbtn_avatar);
    imgbtnTotemon = (ImageButton) findViewById(R.id.main_menu_imgbtn_totemon);

    btnLoutProfile = (LinearLayout) findViewById(R.id.main_menu_btnlout_profile);
    btnLoutFriends = (LinearLayout) findViewById(R.id.main_menu_btnlout_friends);
    btnLoutMeeting = (LinearLayout) findViewById(R.id.main_menu_btnlout_meeting);
    btnLoutFight = (LinearLayout) findViewById(R.id.main_menu_btnlout_fight);

    btnLoutProfile.setOnClickListener(onClickListener);
    btnLoutFriends.setOnClickListener(onClickListener);
    btnLoutMeeting.setOnClickListener(onClickListener);
    btnLoutFight.setOnClickListener(onClickListener);

  }

  View.OnClickListener onClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      Toast toast;
      Intent intent;
      switch (view.getId()) {
        case R.id.main_menu_btnlout_profile:
          toast = Toast.makeText(getApplicationContext(),
              "В будущем вместо этого сообщения откроется профиль",
              Toast.LENGTH_SHORT);
          toast.show();
          break;
        case R.id.main_menu_btnlout_friends:
          intent = new Intent(MainActivity.this, SimpleDbTable.class);
          startActivity(intent);
          break;
        case R.id.main_menu_btnlout_meeting:
          toast = Toast.makeText(getApplicationContext(),
              "В будущем вместо этого сообщения откроется экран слётов",
              Toast.LENGTH_SHORT);
          toast.show();
          break;
        case R.id.main_menu_btnlout_fight:
          intent = new Intent(MainActivity.this, PreFightActivity.class);
          startActivity(intent);
          break;
      }
    }
  };
}

