package com.example.freefightjudge.cards;

import java.util.Random;

public abstract class CardsProperties {
  protected int[][] cardsIdAndWeight = new int[5][2];
  
  int getRandomCard() {
    Random random = new Random();
    int randomNumber = random.nextInt(10) + 1;
    
    if (randomNumber < cardsIdAndWeight[0][1]) {
      return cardsIdAndWeight[0][0];
    } else if (randomNumber < cardsIdAndWeight[0][1] + cardsIdAndWeight[1][1]) {
      return cardsIdAndWeight[1][0];
    } else if (randomNumber < cardsIdAndWeight[0][1] + cardsIdAndWeight[1][1] +
        cardsIdAndWeight[2][1]) {
      return cardsIdAndWeight[2][0];
    } else if (randomNumber < cardsIdAndWeight[0][1] + cardsIdAndWeight[1][1] +
        cardsIdAndWeight[2][1] + cardsIdAndWeight[3][1]) {
      return cardsIdAndWeight[3][0];
    } else if (randomNumber < cardsIdAndWeight[0][1] + cardsIdAndWeight[1][1] +
        cardsIdAndWeight[2][1] + cardsIdAndWeight[3][1] + cardsIdAndWeight[4][1]) {
      return cardsIdAndWeight[4][0];
    }
    
     return 0; //return Id of card
  }
}
