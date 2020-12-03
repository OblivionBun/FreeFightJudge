package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.example.freefightjudge.cards.AreaCardsProperties;
import com.example.freefightjudge.cards.CardsProperties;
import com.example.freefightjudge.cards.FightCardsProporties;
import com.example.freefightjudge.cards.ModCardsProperties;
import com.example.freefightjudge.cards.ScoreCardsProperties;
import com.example.freefightjudge.cards.TimeCardsProperties;

import java.util.Random;

public class DrawCardsActivity extends AppCompatActivity {
  public static final int COUNT_OF_CARDS = 6;
  
  private Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_draw_cards);

    toolbar = findViewById(R.id.draw_cards_tbar);
    toolbar.setTitle(R.string.app_name);
  }
  
  View.OnClickListener onClickListener = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      switch (view.getId()) {
        case R.id.draw_cards_btn_draw_cards:
        
      }
    }
  };
  
  private void drawCards() {
    Random random = new Random();
    CardsProperties[] cardsProperties = new CardsProperties[COUNT_OF_CARDS];
    for (int i = 0; i < COUNT_OF_CARDS-1-1/*except mad card*/; i++) {
      switch (i) {
        case 0: //score card
          cardsProperties[i] = new ScoreCardsProperties();
          cardsProperties[i].setRandom(random.nextInt());
          break;
        case 1: //fight card
          cardsProperties[i] = new FightCardsProporties();
          cardsProperties[i].setRandom(random.nextInt());
          break;
        case 2: //time card
          cardsProperties[i] = new TimeCardsProperties();
          cardsProperties[i].setRandom(random.nextInt());
          break;
        case 3: //area card
          cardsProperties[i] = new AreaCardsProperties();
          cardsProperties[i].setRandom(random.nextInt());
          break;
        case 4: //mod card
          cardsProperties[i] = new ModCardsProperties();
          cardsProperties[i].setRandom(random.nextInt());
          break;
      }
    }
  }
}
