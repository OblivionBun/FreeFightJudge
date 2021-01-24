package com.example.freefightjudge;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.freefightjudge.cards.AreaCardsProperties;
import com.example.freefightjudge.cards.CardsProperties;
import com.example.freefightjudge.cards.FightCardsProperties;
import com.example.freefightjudge.cards.ModCardsProperties;
import com.example.freefightjudge.cards.ScoreCardsProperties;
import com.example.freefightjudge.cards.TimeCardsProperties;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CardFragment extends Fragment {
  private static final String ARG_ITEM_NUMBER = "param1";
  
  private int pageNumber;
  
  public static final int COUNT_OF_CARDS = 6;
  
  public static int[] idRandomCard = new int[COUNT_OF_CARDS];
  
  private Toolbar toolbar;
  
  private ImageView imageViewScoreCard;
  
  private ImageView imageViewFightCard;
  
  private ImageView imageViewTimeCard;
  
  private ImageView imageViewAreaCard;
  
  private ImageView imageViewModCard;
  
  private ImageView imageViewMadCard;
  
  private TextView textViewNameScoreCard;
  
  private TextView textViewNameFightCard;
  
  private TextView textViewNameTimeCard;
  
  private TextView textViewNameAreaCard;
  
  private TextView textViewNameModCard;
  
  //private TextView textViewNameMadCard;
  
  private TextView textViewDescriptionScoreCard;
  
  private TextView textViewDescriptionFightCard;
  
  private TextView textViewDescriptionTimeCard;
  
  private TextView textViewDescriptionAreaCard;
  
  private TextView textViewDescriptionModCard;
  
  private TextView textViewDescriptionMadCard;
  
  private Button buttonDrawCards;
  
  public CardFragment() {
    // Required empty public constructor
  }
  
  /**
   * Use this factory method to create a new instance of
   * this fragment using the provided parameters.
   *
   * @param pageNumber Parameter 1.
   * @return A new instance of fragment CardFragment.
   */
  public static CardFragment newInstance(int pageNumber) {
    CardFragment fragment = new CardFragment();
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
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_card, container, false);
  
    //Изображения карт
    imageViewScoreCard = (ImageView) view.findViewById(R.id.draw_cards_img_score_card);
    imageViewFightCard = (ImageView) view.findViewById(R.id.draw_cards_img_fight_card);
    imageViewTimeCard = (ImageView) view.findViewById(R.id.draw_cards_img_time_card);
    imageViewAreaCard = (ImageView) view.findViewById(R.id.draw_cards_img_area_card);
    imageViewModCard = (ImageView) view.findViewById(R.id.draw_cards_img_mod_card);
    imageViewMadCard = (ImageView) view.findViewById(R.id.draw_cards_img_mad_card);
  
    //Названия карт
    textViewNameScoreCard = (TextView) view.findViewById(R.id.draw_cards_txt_name_score_card);
    textViewNameFightCard = (TextView) view.findViewById(R.id.draw_cards_txt_name_fight_card);
    textViewNameTimeCard = (TextView) view.findViewById(R.id.draw_cards_txt_name_time_card);
    textViewNameAreaCard = (TextView) view.findViewById(R.id.draw_cards_txt_name_area_card);
    textViewNameModCard = (TextView) view.findViewById(R.id.draw_cards_txt_name_mod_card);
    //textViewNameMadCard = (TextView) findViewById(R.id.draw_cards_txt_name_mad_card);
  
    //Описание карт
    textViewDescriptionScoreCard = (TextView) view.findViewById(R.id.draw_cards_txt_description_score_card);
    textViewDescriptionFightCard = (TextView) view.findViewById(R.id.draw_cards_txt_description_fight_card);
    textViewDescriptionTimeCard = (TextView) view.findViewById(R.id.draw_cards_txt_description_time_card);
    textViewDescriptionAreaCard = (TextView) view.findViewById(R.id.draw_cards_txt_description_area_card);
    textViewDescriptionModCard = (TextView) view.findViewById(R.id.draw_cards_txt_description_mod_card);
    textViewDescriptionMadCard = (TextView) view.findViewById(R.id.draw_cards_txt_description_mad_card);
  
    buttonDrawCards = (Button) view.findViewById(R.id.draw_cards_btn_draw_cards);
    buttonDrawCards.setOnClickListener(onClickListener);
    return view;
  }
  
  View.OnClickListener onClickListener = view -> {
    switch (view.getId()) {
      case R.id.draw_cards_btn_draw_cards:
        drawCards();
        break;
    }
  };
  
  private void drawCards() {
    CardsProperties[] cardsProperties = new CardsProperties[COUNT_OF_CARDS];
    for (int i = 0; i < COUNT_OF_CARDS-1/*except mad card*/; i++) {
      
      switch (i) {
        case 0: //score card
          cardsProperties[i] = new ScoreCardsProperties();
          idRandomCard[i] = cardsProperties[i].getRandomCard();
          imageViewScoreCard.setImageResource(idRandomCard[i]);
          textViewNameScoreCard.setText(Utility.getTitleCard(idRandomCard[i]));
          textViewDescriptionScoreCard.setText(Utility.getDescriptionCard(idRandomCard[i]));
          break;
        case 1: //fight card
          cardsProperties[i] = new FightCardsProperties();
          idRandomCard[i] = cardsProperties[i].getRandomCard();
          imageViewFightCard.setImageResource(idRandomCard[i]);
          textViewNameFightCard.setText(Utility.getTitleCard(idRandomCard[i]));
          textViewDescriptionFightCard.setText(Utility.getDescriptionCard(idRandomCard[i]));
          break;
        case 2: //time card
          cardsProperties[i] = new TimeCardsProperties();
          idRandomCard[i] = cardsProperties[i].getRandomCard();
          imageViewTimeCard.setImageResource(idRandomCard[i]);
          textViewNameTimeCard.setText(Utility.getTitleCard(idRandomCard[i]));
          textViewDescriptionTimeCard.setText(Utility.getDescriptionCard(idRandomCard[i]));
          break;
        case 3: //area card
          cardsProperties[i] = new AreaCardsProperties();
          idRandomCard[i] = cardsProperties[i].getRandomCard();
          imageViewAreaCard.setImageResource(idRandomCard[i]);
          textViewNameAreaCard.setText(Utility.getTitleCard(idRandomCard[i]));
          textViewDescriptionAreaCard.setText(Utility.getDescriptionCard(idRandomCard[i]));
          break;
        case 4: //mod card
          cardsProperties[i] = new ModCardsProperties();
          idRandomCard[i] = cardsProperties[i].getRandomCard();
          imageViewModCard.setImageResource(idRandomCard[i]);
          textViewNameModCard.setText(Utility.getTitleCard(idRandomCard[i]));
          textViewDescriptionModCard.setText(Utility.getDescriptionCard(idRandomCard[i]));
          break;
      }
    }
  }
}