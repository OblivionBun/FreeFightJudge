package com.example.freefightjudge;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;


public class FightTabAdapter extends FragmentStateAdapter {
  
  private final int PAGE_COUNT = 2;
  
  public final static int[] tabTitles = new int[] {R.string.tab_name_cards, R.string.tab_name_fight};
  
  public FightTabAdapter(@NonNull FragmentActivity fragmentActivity) {
    super(fragmentActivity);
  }
  
  @NonNull
  @Override
  public Fragment createFragment(int position) {
    switch (position) {
      case 0:
        return new CardFragment();
      case 1:
        return new FightFragment();
      default:
        return null;
    }
  }
  
  @Override
  public int getItemCount() {
    return PAGE_COUNT;
  }
}
