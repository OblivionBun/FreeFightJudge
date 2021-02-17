package com.example.freefightjudge;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FightFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FightFragment extends Fragment {
  private static final String ARG_ITEM_NUMBER = "arg_item_number";
  
  private int pageNumber;
  
  private TextView txtRemainScoreFirst;
  
  private TextView txtRemainScoreSecond;
  
  private TextView txtNameFirst;
  
  private TextView txtNameSecond;
  
  private TextView txtSummaryScore;
  
  private ImageButton imgbtnWarningFirst;
  
  private ImageButton imgbtnWarningSecond;
  
  private ImageButton imgbtnPlusOneFirst;
  
  private ImageButton imgbtnPlusTwoFirst;
  
  private ImageButton imgbtnPlusThreeFirst;
  
  private ImageButton imgbtnPlusOneSecond;
  
  private ImageButton imgbtnPlusTwoSecond;
  
  private ImageButton imgbtnPlusThreeSecond;
  
  private TextView txtPlusOneMainText;
  
  private TextView txtPlusOneSubText;
  
  private TextView txtPlusTwoMainText;
  
  private TextView txtPlusTwoSubText;
  
  private TextView txtPlusThreeMainText;
  
  private TextView txtPlusThreeSubText;
  
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
    View view = inflater.inflate(R.layout.fragment_fight, container, false);
  
    txtRemainScoreFirst = (TextView) view.findViewById(R.id.fight_txt_remain_score_first);
    txtRemainScoreSecond = (TextView) view.findViewById(R.id.fight_txt_remain_score_second);
  
    txtNameFirst = (TextView) view.findViewById(R.id.fight_txt_name_first);
    txtNameSecond = (TextView) view.findViewById(R.id.fight_txt_name_second);
  
    txtSummaryScore = (TextView) view.findViewById(R.id.fight_txt_summary_score);
  
    imgbtnWarningFirst = (ImageButton) view.findViewById(R.id.fight_imgbtn_warning_first);
    imgbtnWarningSecond = (ImageButton) view.findViewById(R.id.fight_imgbtn_warning_second);
  
    imgbtnPlusOneFirst = (ImageButton) view.findViewById(R.id.fight_imgbtn_button_plus_1_first);
    imgbtnPlusTwoFirst = (ImageButton) view.findViewById(R.id.fight_imgbtn_button_plus_2_first);
    imgbtnPlusThreeFirst = (ImageButton) view.findViewById(R.id.fight_imgbtn_button_plus_3_first);
    imgbtnPlusOneSecond = (ImageButton) view.findViewById(R.id.fight_imgbtn_button_plus_1_second);
    imgbtnPlusTwoSecond = (ImageButton) view.findViewById(R.id.fight_imgbtn_button_plus_2_second);
    imgbtnPlusThreeSecond = (ImageButton) view.findViewById(R.id.fight_imgbtn_button_plus_3_second);
  
    txtPlusOneMainText = (TextView) view.findViewById(R.id.fight_txt_name_button_1);
    txtPlusTwoMainText = (TextView) view.findViewById(R.id.fight_txt_name_button_2);
    txtPlusThreeMainText = (TextView) view.findViewById(R.id.fight_txt_name_button_3);
  
    txtPlusOneSubText = (TextView) view.findViewById(R.id.fight_txt_description_button_1);
    txtPlusTwoSubText = (TextView) view.findViewById(R.id.fight_txt_description_button_2);
    txtPlusThreeSubText = (TextView) view.findViewById(R.id.fight_txt_description_button_3);
    
    imgbtnPlusOneFirst.setOnClickListener(onClickListener);
    imgbtnPlusTwoFirst.setOnClickListener(onClickListener);
    imgbtnPlusThreeFirst.setOnClickListener(onClickListener);
    
    imgbtnPlusOneSecond.setOnClickListener(onClickListener);
    imgbtnPlusTwoSecond.setOnClickListener(onClickListener);
    imgbtnPlusThreeSecond.setOnClickListener(onClickListener);
    
    imgbtnWarningFirst.setOnClickListener(onClickListener);
    imgbtnWarningSecond.setOnClickListener(onClickListener);
    
    prepareScoreButtons();
    // TODO инициализировать базовое состояние страницы
    
    return view;
  }
  
  View.OnClickListener onClickListener = view -> {
    switch (view.getId()) {
      case R.id.fight_imgbtn_button_plus_1_first:
        changeScore(1, 1);
        break;
      case R.id.fight_imgbtn_button_plus_2_first:
        changeScore(1, 2);
        break;
      case R.id.fight_imgbtn_button_plus_3_first:
        changeScore(1, 3);
        break;
      case R.id.fight_imgbtn_button_plus_1_second:
        changeScore(2, 1);
        break;
      case R.id.fight_imgbtn_button_plus_2_second:
        changeScore(2, 2);
        break;
      case R.id.fight_imgbtn_button_plus_3_second:
        changeScore(2, 3);
        break;
      case R.id.fight_imgbtn_warning_first:
        break;
      case R.id.fight_imgbtn_warning_second:
        break;
        // TODO override кнопку "назад"
    }
  };
  
  
  
  private void changeScore(int fighter, int value) {
    if (fighter == 1) {
      txtRemainScoreFirst.setText(String.valueOf(
          Integer.parseInt(
              txtRemainScoreFirst
                  .getText()
                  .toString()) - value));
    } else {
      txtRemainScoreSecond.setText(String.valueOf(
          Integer.parseInt(
              txtRemainScoreSecond
                  .getText()
                  .toString()) - value));
    }
    
    isFightEnded();
  }
  
  private void isFightEnded() {
    if (Integer.parseInt(txtRemainScoreFirst.getText().toString()) <= 0 ||
        Integer.parseInt(txtRemainScoreSecond.getText().toString()) <= 0) {
      // TODO реализовать изменение рейтинга
      hideScoreButtons();
    }
  }
  
  private void hideScoreButtons() {
    imgbtnPlusOneFirst.setVisibility(View.INVISIBLE);
    imgbtnPlusOneSecond.setVisibility(View.INVISIBLE);
    imgbtnPlusTwoFirst.setVisibility(View.INVISIBLE);
    imgbtnPlusThreeFirst.setVisibility(View.INVISIBLE);
    imgbtnPlusTwoSecond.setVisibility(View.INVISIBLE);
    imgbtnPlusThreeSecond.setVisibility(View.INVISIBLE);
  
    txtPlusOneMainText.setVisibility(View.INVISIBLE);
    txtPlusOneSubText.setVisibility(View.INVISIBLE);
    txtPlusTwoMainText.setVisibility(View.INVISIBLE);
    txtPlusTwoSubText.setVisibility(View.INVISIBLE);
    txtPlusThreeMainText.setVisibility(View.INVISIBLE);
    txtPlusThreeSubText.setVisibility(View.INVISIBLE);
  }
  
  private void prepareScoreButtons() {
    hideScoreButtons();
    switch (CardFragment.getCards()[1/*fight card*/].getImage()) {
      case R.drawable.card_fight_01:
        imgbtnPlusOneFirst.setVisibility(View.VISIBLE);
        imgbtnPlusOneSecond.setVisibility(View.VISIBLE);
        
        txtPlusOneMainText.setVisibility(View.VISIBLE);
        txtPlusOneSubText.setVisibility(View.VISIBLE);
        break;
      case R.drawable.card_fight_02:
        imgbtnPlusOneFirst.setVisibility(View.VISIBLE);
        imgbtnPlusOneSecond.setVisibility(View.VISIBLE);
        imgbtnPlusThreeFirst.setVisibility(View.VISIBLE);
        imgbtnPlusThreeSecond.setVisibility(View.VISIBLE);
        
        txtPlusOneMainText.setVisibility(View.VISIBLE);
        txtPlusOneSubText.setVisibility(View.VISIBLE);
        txtPlusThreeMainText.setVisibility(View.VISIBLE);
        txtPlusThreeSubText.setVisibility(View.VISIBLE);
        break;
      case R.drawable.card_fight_03:
        imgbtnPlusOneFirst.setVisibility(View.VISIBLE);
        imgbtnPlusOneSecond.setVisibility(View.VISIBLE);
        imgbtnPlusTwoFirst.setVisibility(View.VISIBLE);
        imgbtnPlusThreeFirst.setVisibility(View.VISIBLE);
        imgbtnPlusTwoSecond.setVisibility(View.VISIBLE);
        imgbtnPlusThreeSecond.setVisibility(View.VISIBLE);
        
        txtPlusOneMainText.setVisibility(View.VISIBLE);
        txtPlusOneSubText.setVisibility(View.VISIBLE);
        txtPlusTwoMainText.setVisibility(View.VISIBLE);
        txtPlusTwoSubText.setVisibility(View.VISIBLE);
        txtPlusThreeMainText.setVisibility(View.VISIBLE);
        txtPlusThreeSubText.setVisibility(View.VISIBLE);
        break;
      case R.drawable.card_fight_04:
        imgbtnPlusOneFirst.setVisibility(View.VISIBLE);
        imgbtnPlusOneSecond.setVisibility(View.VISIBLE);
        
        txtPlusOneMainText.setVisibility(View.VISIBLE);
        txtPlusOneSubText.setVisibility(View.VISIBLE);
        break;
      case R.drawable.card_fight_05:
        //TODO реализовать обострение
        break;
    }
  }
}
