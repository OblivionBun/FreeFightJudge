package com.example.freefightjudge.cards;

import com.example.freefightjudge.R;
import com.example.freefightjudge.Utility;
import com.example.freefightjudge.cards.CardsProperties;

import java.util.Random;

public class ScoreCardsProperties extends CardsProperties {
  public ScoreCardsProperties() {
    //ID of cards
    cardsIdAndWeight[0][0] = R.drawable.card_score_01;
    cardsIdAndWeight[1][0] = R.drawable.card_score_02;
    cardsIdAndWeight[2][0] = R.drawable.card_score_03;
    cardsIdAndWeight[3][0] = R.drawable.card_score_04;
    cardsIdAndWeight[4][0] = R.drawable.card_score_05;
    //weights of cards
    cardsIdAndWeight[0][1] = 1;
    cardsIdAndWeight[1][1] = 3;
    cardsIdAndWeight[2][1] = 3;
    cardsIdAndWeight[3][1] = 2;
    cardsIdAndWeight[4][1] = 1;
  }
}













