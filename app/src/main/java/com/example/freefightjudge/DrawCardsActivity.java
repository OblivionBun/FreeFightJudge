package com.example.freefightjudge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

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
    for (int i = 0; i < COUNT_OF_CARDS-1/*except mad card*/; i++) {
      switch (i) {
        case 0: //score card
          break;
        case 1: //fight card
          break;
        case 2: //time card
          break;
        case 3: //area card
          break;
        case 4: //mod card
          break;
      }
    }
  }
}
