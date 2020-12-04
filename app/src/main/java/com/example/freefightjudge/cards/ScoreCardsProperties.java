package com.example.freefightjudge.cards;

import com.example.freefightjudge.cards.CardsProperties;

public class ScoreCardsProperties implements CardsProperties {
  private int number;
  
  private int imageId;
  
  @Override
  public int getRandom() {
    return number;
  }
  
  @Override
  public void setRandom(int number) {
    this.number = number;
  }
  
  @Override
  public int getImageId() {
    return imageId;
  }
  
  @Override
  public void setImageId(int imageId) {
    this.imageId = imageId;
  }
}
