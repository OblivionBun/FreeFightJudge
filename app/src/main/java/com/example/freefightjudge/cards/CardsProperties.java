package com.example.freefightjudge.cards;

public interface CardsProperties {
  int getRandomCard();
  int getImageId();
  void setImageId(int imageId);
  int[] getWeights();
}
