package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class FightActivity extends AppCompatActivity {
  /*private Toolbar toolbar;
  
  private TabLayout tabLayout;

  private ViewPager viewPager;
  
  private FightTabAdapter fightTabAdapter;

  private PageFragment pageFragment;*/
  
  private TextView txtRemainScoreFirst;
  
  private TextView txtRemainScoreSecond;
  
  private TextView txtNameFirst;
  
  private TextView txtNameSecond;
  
  private TextView txtSummaryScore;
  
  private ImageView imgbtnWarningFirst;
  
  private ImageView imgbtnWarningSecond;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fight);

    /*toolbar = (Toolbar) findViewById(R.id.fight_tbar);
    toolbar.setTitle(R.string.txt_fight);
  
    tabLayout = findViewById(R.id.fight_tablout);
    viewPager = findViewById(R.id.fight_vpager);
    viewPager.setAdapter(new FightTabAdapter(getSupportFragmentManager()));
    tabLayout.setupWithViewPager(viewPager);*/
  }
}

