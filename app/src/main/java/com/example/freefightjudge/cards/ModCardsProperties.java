package com.example.freefightjudge.cards;

import com.example.freefightjudge.R;

public class ModCardsProperties extends CardsProperties {
  public ModCardsProperties() {
    //ID of cards
    cardsIdAndWeight[0][0] = R.drawable.card_mod_01;
    cardsIdAndWeight[1][0] = R.drawable.card_mod_02;
    cardsIdAndWeight[2][0] = R.drawable.card_mod_03;
    cardsIdAndWeight[3][0] = R.drawable.card_mod_04;
    cardsIdAndWeight[4][0] = R.drawable.card_mod_05;
    //weights of cards
    cardsIdAndWeight[0][1] = 4;
    cardsIdAndWeight[1][1] = 2;
    cardsIdAndWeight[2][1] = 2;
    cardsIdAndWeight[3][1] = 1;
    cardsIdAndWeight[4][1] = 1;
  }
}
