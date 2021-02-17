package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ViewPagerActivity extends AppCompatActivity {
  private static ViewPager2 viewPager2;
  
  private TabLayout tabLayout;
  
  public static ViewPager2 getViewPager2() {
    return viewPager2;
  }
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_pager);
    
    viewPager2 = (ViewPager2) findViewById(R.id.view_pager_vp2_box);
    tabLayout = (TabLayout) findViewById(R.id.view_pager_tablout);
    
    FightTabAdapter fightTabAdapter = new FightTabAdapter(this);
    viewPager2.setAdapter(fightTabAdapter);
    
    new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
      tab.setText(FightTabAdapter.tabTitles[position]);
      viewPager2.setCurrentItem(tab.getPosition(), true);
    }).attach();
  }
  
  @Override
  public void onBackPressed() {
    if (viewPager2.getCurrentItem() == 0) {
      super.onBackPressed();
    } else {
      viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1);
    }
  }
}