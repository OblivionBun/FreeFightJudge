package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.example.freefightjudge.cards.AreaCardsProperties;
import com.example.freefightjudge.cards.CardsProperties;
import com.example.freefightjudge.cards.FightCardsProperties;
import com.example.freefightjudge.cards.ModCardsProperties;
import com.example.freefightjudge.cards.ScoreCardsProperties;
import com.example.freefightjudge.cards.TimeCardsProperties;

public class DrawCardsActivity extends AppCompatActivity {
  public static final int COUNT_OF_CARDS = 6;
  
  private static int[] idRandomCard = new int[COUNT_OF_CARDS];
  
  private static Card[] cards = new Card[COUNT_OF_CARDS];
  
  public static int[] getIdRandomCard() {
    return idRandomCard;
  }
  
  public static Card[] getCards() {
    return cards;
  }
  
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

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_draw_cards);

    toolbar = findViewById(R.id.draw_cards_tbar);
    toolbar.setTitle(R.string.app_name);
    
    //Изображения карт
    imageViewScoreCard = (ImageView) findViewById(R.id.draw_cards_img_score_card);
    imageViewFightCard = (ImageView) findViewById(R.id.draw_cards_img_fight_card);
    imageViewTimeCard = (ImageView) findViewById(R.id.draw_cards_img_time_card);
    imageViewAreaCard = (ImageView) findViewById(R.id.draw_cards_img_area_card);
    imageViewModCard = (ImageView) findViewById(R.id.draw_cards_img_mod_card);
    imageViewMadCard = (ImageView) findViewById(R.id.draw_cards_img_mad_card);
  
    //Названия карт
    textViewNameScoreCard = (TextView) findViewById(R.id.draw_cards_txt_name_score_card);
    textViewNameFightCard = (TextView) findViewById(R.id.draw_cards_txt_name_fight_card);
    textViewNameTimeCard = (TextView) findViewById(R.id.draw_cards_txt_name_time_card);
    textViewNameAreaCard = (TextView) findViewById(R.id.draw_cards_txt_name_area_card);
    textViewNameModCard = (TextView) findViewById(R.id.draw_cards_txt_name_mod_card);
    //textViewNameMadCard = (TextView) findViewById(R.id.draw_cards_txt_name_mad_card);
    
    //Описание карт
    textViewDescriptionScoreCard = (TextView) findViewById(R.id.draw_cards_txt_description_score_card);
    textViewDescriptionFightCard = (TextView) findViewById(R.id.draw_cards_txt_description_fight_card);
    textViewDescriptionTimeCard = (TextView) findViewById(R.id.draw_cards_txt_description_time_card);
    textViewDescriptionAreaCard = (TextView) findViewById(R.id.draw_cards_txt_description_area_card);
    textViewDescriptionModCard = (TextView) findViewById(R.id.draw_cards_txt_description_mod_card);
    textViewDescriptionMadCard = (TextView) findViewById(R.id.draw_cards_txt_description_mad_card);
  
    buttonDrawCards = (Button) findViewById(R.id.draw_cards_btn_draw_cards);
    buttonDrawCards.setOnClickListener(onClickListener);
  }
  
  View.OnClickListener onClickListener = view -> {
    switch (view.getId()) {
      case R.id.draw_cards_btn_draw_cards:
      drawCards();
      // TODO дизейблить кнопку на релизе
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
          cards[i] = new Card(idRandomCard[i]);
          textViewNameScoreCard.setText(Utility.getTitleCard(idRandomCard[i]));
          textViewDescriptionScoreCard.setText(Utility.getDescriptionCard(idRandomCard[i]));
          break;
        case 1: //fight card
          cardsProperties[i] = new FightCardsProperties();
          idRandomCard[i] = cardsProperties[i].getRandomCard();
          imageViewFightCard.setImageResource(idRandomCard[i]);
          cards[i] = new Card(idRandomCard[i]);
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
