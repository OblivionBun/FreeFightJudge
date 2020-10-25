package com.example.freefightjudge;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.freefightjudge.data.DatabaseWrapper;
import com.example.freefightjudge.data.UserInfoDbHelper;
import com.example.freefightjudge.data.room.AppDatabase;
import com.example.freefightjudge.data.room.Executor;
import com.example.freefightjudge.data.room.User;
import com.example.freefightjudge.data.room.UserDao;

public class PreFightActivity extends AppCompatActivity {

  private EditText edtTxtNewUserFirstName;

  private EditText edtTxtNewUserLastName;

  private Spinner spnrUserFirst;

  private Spinner spnrUserSecond;

  private Button btnAddNewUser;

  private Button btnEnterUsers;

  DatabaseWrapper databaseWrapper;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pre_fight);

    edtTxtNewUserFirstName = (EditText) findViewById(R.id.pre_fight_edt_txt_new_user_first_name);
    edtTxtNewUserLastName = (EditText) findViewById(R.id.pre_fight_edt_txt_new_user_last_name);

    spnrUserFirst = (Spinner) findViewById(R.id.pre_fight_spnr_user_first);
    spnrUserSecond = (Spinner) findViewById(R.id.pre_fight_spnr_user_second);

    btnAddNewUser = (Button) findViewById(R.id.pre_fight_btn_add_new_user);
    btnEnterUsers = (Button) findViewById(R.id.pre_fight_btn_enter_users);

    btnAddNewUser.setOnClickListener(onClickListener);
    // TODO: Перенести эту функцию в SimpleDbTable

    btnEnterUsers.setOnClickListener(onClickListener);

    databaseWrapper = new DatabaseWrapper();
  }

  View.OnClickListener onClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      switch (view.getId()) {
        case R.id.pre_fight_btn_add_new_user:
          System.out.println("кейс");
          databaseWrapper.addNewUser(edtTxtNewUserFirstName.getText().toString(),
              edtTxtNewUserLastName.getText().toString());
          break;
        case R.id.pre_fight_btn_enter_users:
          Intent intent = new Intent(PreFightActivity.this, FightActivity.class);
          startActivity(intent);
          break;
      }
    }
  };
}
