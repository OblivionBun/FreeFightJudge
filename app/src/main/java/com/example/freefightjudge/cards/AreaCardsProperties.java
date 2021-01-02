package com.example.freefightjudge.cards;

import com.example.freefightjudge.R;

public class AreaCardsProperties extends CardsProperties {
  AreaCardsProperties() {
    //ID of cards
    cardsIdAndWeight[0][0] = R.drawable.card_area_01;
    cardsIdAndWeight[1][0] = R.drawable.card_area_02;
    cardsIdAndWeight[2][0] = R.drawable.card_area_03;
    cardsIdAndWeight[3][0] = R.drawable.card_area_04;
    cardsIdAndWeight[4][0] = R.drawable.card_area_05;
    //weights of cards
    cardsIdAndWeight[0][1] = 3;
    cardsIdAndWeight[1][1] = 2;
    cardsIdAndWeight[2][1] = 4;
    cardsIdAndWeight[3][1] = 2;
    cardsIdAndWeight[4][1] = 1;
  }
}
