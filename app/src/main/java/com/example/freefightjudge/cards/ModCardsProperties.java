package com.example.freefightjudge.cards;

public class ModCardsProperties implements CardsProperties {
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
