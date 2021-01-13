package com.example.freefightjudge;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FightTabAdapter extends FragmentStateAdapter {
  final int PAGE_COUNT = 3;
  
  public FightTabAdapter(@NonNull FragmentActivity fragmentActivity) {
    super(fragmentActivity);
  }
  
  @NonNull
  @Override
  public Fragment createFragment(int position) {
    /*switch (position) {
      case 0:
      
    }
    return null;*/
    return new FightFragment();
  }
  
  @Override
  public int getItemCount() {
    return PAGE_COUNT;
  }
}

