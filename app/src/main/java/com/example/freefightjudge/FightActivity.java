package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class FightActivity extends AppCompatActivity {
  private Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fight);

    toolbar = (Toolbar) findViewById(R.id.fight_tbar);
    toolbar.setTitle(R.string.txt_fight);
  }
}
