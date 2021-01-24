package com.example.freefightjudge;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ViewPagerActivity extends AppCompatActivity {
  private ViewPager2 fragmentPage;
  
  private TabLayout tabLayout;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_pager);
    
    fragmentPage = (ViewPager2) findViewById(R.id.view_pager_vp2_box);
    tabLayout = (TabLayout) findViewById(R.id.view_pager_tablout);
    
    FightTabAdapter fightTabAdapter = new FightTabAdapter(this);
    fragmentPage.setAdapter(fightTabAdapter);
    
    new TabLayoutMediator(tabLayout, fragmentPage, (tab, position) -> {
      tab.setText(FightTabAdapter.tabTitles[position]);
      fragmentPage.setCurrentItem(tab.getPosition(), true);
    }).attach();
  }
}