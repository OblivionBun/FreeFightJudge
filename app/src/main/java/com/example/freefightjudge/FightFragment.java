package com.example.freefightjudge;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FightFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FightFragment extends Fragment {
  private static final String ARG_ITEM_NUMBER = "arg_item_number";
  
  private int pageNumber;
  
  public FightFragment() {
    // Required empty public constructor
  }
  
  /**
   * Use this factory method to create a new instance of
   * this fragment using the provided parameters.
   *
   * @param pageNumber Parameter 1.
   * @return A new instance of fragment BlankFragment.
   */
  public static FightFragment newInstance(int pageNumber) {
    FightFragment fragment = new FightFragment();
    Bundle args = new Bundle();
    args.putInt(ARG_ITEM_NUMBER, pageNumber);
    fragment.setArguments(args);
    return fragment;
  }
  
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      pageNumber = getArguments().getInt(ARG_ITEM_NUMBER);
    }
  }
  
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_fight, container, false);
  }
}