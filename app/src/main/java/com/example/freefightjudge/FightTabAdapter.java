package com.example.freefightjudge;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FightTabAdapter extends FragmentStatePagerAdapter {
  public FightTabAdapter(@NonNull FragmentManager fm) {
    super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
  }

  public FightTabAdapter(@NonNull FragmentManager fm, int behavior) {
    super(fm, behavior);
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
    switch (position) {
      default:
        return null;
    }
  }

  @Override
  public int getCount() {
    return 0;
  }
}

