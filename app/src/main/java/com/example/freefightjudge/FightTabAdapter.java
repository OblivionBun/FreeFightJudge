package com.example.freefightjudge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class FightTabAdapter extends FragmentStatePagerAdapter {
  final int PAGE_COUNT = 3;

  public FightTabAdapter(@NonNull FragmentManager fm) {
    super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
  }

  public FightTabAdapter(@NonNull FragmentManager fm, int behavior) {
    super(fm, behavior);
  }

  @NonNull
  @Override
  public Fragment getItem(int position) {
  return PageFragment.newInstance(position);
  }

  @Override
  public int getCount() {
    return PAGE_COUNT;
  }

  @Nullable
  @Override
  public CharSequence getPageTitle(int position) {
    return super.getPageTitle(position);
  }
}

