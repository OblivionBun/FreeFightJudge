package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class ViewPagerActivity extends AppCompatActivity {
  private ViewPager2 fragmentPage;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_pager);
    
    fragmentPage = findViewById(R.id.view_pager_vp2_box);
    
    FightTabAdapter fightTabAdapter = new FightTabAdapter(this);
    fragmentPage.setAdapter(fightTabAdapter);
  }
  
  
}