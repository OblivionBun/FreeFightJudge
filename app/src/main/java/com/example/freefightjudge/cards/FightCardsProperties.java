package com.example.freefightjudge.cards;

import com.example.freefightjudge.R;

import java.util.HashMap;

public class FightCardsProperties implements CardsProperties {
  private HashMap<Integer, Integer> cardsId = new HashMap<>();
  
  private int weightSum;
  
  private int random;
  
  private int imageId;
  
  FightCardsProperties(){
    cardsId.put(R.drawable.card_fight_01, 3);
    cardsId.put(R.drawable.card_fight_02, 3);
    cardsId.put(R.drawable.card_fight_03, 2);
    cardsId.put(R.drawable.card_fight_04, 1);
    cardsId.put(R.drawable.card_fight_05, 1);
  
    weightSum = 0;
    for (int i = 0; i < cardsId.size() - 1; i++) {
      cardsId
    }
  }
  
  @Override
  public int getRandomCard() {
    
    
    return 0; //TODO должен возвращать айди карты
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
  public int[] getWeights() {
    return new int[0];
  }
}
