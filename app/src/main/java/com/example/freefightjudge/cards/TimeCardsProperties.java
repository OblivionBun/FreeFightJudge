package com.example.freefightjudge.cards;

import com.example.freefightjudge.R;

public class TimeCardsProperties extends CardsProperties {
  TimeCardsProperties() {
    //ID of cards
    cardsIdAndWeight[0][0] = R.drawable.card_time_01;
    cardsIdAndWeight[1][0] = R.drawable.card_time_02;
    cardsIdAndWeight[2][0] = R.drawable.card_time_03;
    cardsIdAndWeight[3][0] = R.drawable.card_time_04;
    cardsIdAndWeight[4][0] = R.drawable.card_time_05;
    //weights of cards
    cardsIdAndWeight[0][1] = 3;
    cardsIdAndWeight[1][1] = 1;
    cardsIdAndWeight[2][1] = 3;
    cardsIdAndWeight[3][1] = 2;
    cardsIdAndWeight[4][1] = 1;
  }
}
