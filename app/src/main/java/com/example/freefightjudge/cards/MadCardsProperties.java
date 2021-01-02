package com.example.freefightjudge.cards;

import com.example.freefightjudge.R;

import java.util.Random;

public class MadCardsProperties extends CardsProperties {
  MadCardsProperties() {
    //ID of cards
    cardsIdAndWeight[0][0] = R.drawable.card_mad_01;
    cardsIdAndWeight[1][0] = R.drawable.card_mad_02;
    cardsIdAndWeight[2][0] = R.drawable.card_mad_03;
    cardsIdAndWeight[3][0] = R.drawable.card_mad_04;
    cardsIdAndWeight[4][0] = R.drawable.card_mad_05;
    cardsIdAndWeight[5][0] = R.drawable.card_mad_06;
    cardsIdAndWeight[6][0] = R.drawable.card_mad_07;
    cardsIdAndWeight[7][0] = R.drawable.card_mad_08;
    cardsIdAndWeight[8][0] = R.drawable.card_mad_09;
    cardsIdAndWeight[9][0] = R.drawable.card_mad_10;
  }
  
  @Override
  int getRandomCard() {
    Random random = new Random();
    int randomNumber = random.nextInt(10) + 1;
    
    switch (randomNumber) {
      case 0:
        return R.drawable.card_mad_01;
      case 1:
        return R.drawable.card_mad_02;
      case 2:
        return R.drawable.card_mad_03;
      case 3:
        return R.drawable.card_mad_04;
      case 4:
        return R.drawable.card_mad_06;
      case 5:
        return R.drawable.card_mad_06;
      case 6:
        return R.drawable.card_mad_07;
      case 7:
        return R.drawable.card_mad_08;
      case 8:
        return R.drawable.card_mad_09;
      case 9:
        return R.drawable.card_mad_10;
      default:
        return 0;
    }
  }
}
