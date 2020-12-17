package com.example.freefightjudge.cards;

public class FightCardsProperties implements CardsProperties {
  private int random;
  
  private int imageId;
  
  @Override
  public int getRandom() {
    return random;
  }
  
  @Override
  public void setRandom(int number) {
    this.random = random;
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
