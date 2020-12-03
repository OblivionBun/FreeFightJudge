package com.example.freefightjudge;

public class ScoreCardsProperties implements CardsProperties{
  private int number;
  
  @Override
  public int getRandom() {
    return 0;
  }
  
  @Override
  public void setRandom(int number) {
    this.number = number;
  }
}
