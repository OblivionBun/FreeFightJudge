package com.example.freefightjudge.cards;

import com.example.freefightjudge.R;
import com.example.freefightjudge.Utility;
import com.example.freefightjudge.cards.CardsProperties;

import java.util.Random;

public class ScoreCardsProperties implements CardsProperties {
  private int number;
  
  private int imageId;
  
  // ADD NEW CARDS HERE
  public static final int WEIGHT_SCORE_CARD_ONE = 1;
  public static final int WEIGHT_SCORE_CARD_THREE = 3;
  public static final int WEIGHT_SCORE_CARD_FIVE = 3;
  public static final int WEIGHT_SCORE_CARD_SEVEN = 2;
  public static final int WEIGHT_SCORE_CARD_TEN = 1;
  
  public static final int SUMMARY_WEIGHT = 
      WEIGHT_SCORE_CARD_ONE + WEIGHT_SCORE_CARD_THREE +
      WEIGHT_SCORE_CARD_FIVE + WEIGHT_SCORE_CARD_SEVEN +
      WEIGHT_SCORE_CARD_TEN;        
  
  @Override
  public int getRandomCard() {
    return Utility.refreshCards();
  }
  
  @Override
  public int getImageId() {
    return imageId;
  }
  
  @Override
  public void setImageId(int imageId) {
    this.imageId = imageId;
  }
  
  @Override
  public int getSummaryWeight() {
    return SUMMARY_WEIGHT;
  }
  
  @Override
  public int[] getWeights() {
    int[] arrayOfWeight = new int[5];
    arrayOfWeight[0] = WEIGHT_SCORE_CARD_ONE;
    arrayOfWeight[1] = WEIGHT_SCORE_CARD_THREE;
    arrayOfWeight[2] = WEIGHT_SCORE_CARD_FIVE;
    arrayOfWeight[3] = WEIGHT_SCORE_CARD_SEVEN;
    arrayOfWeight[4] = WEIGHT_SCORE_CARD_TEN;
    return arrayOfWeight;
  }
}













