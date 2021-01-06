package com.example.freefightjudge.cards;

import com.example.freefightjudge.Utility;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;

public abstract class CardsProperties {
  protected LinkedHashMap<Integer, Integer> mapOfCardsAndIds = new LinkedHashMap<>();
  
  public int getRandomCard() {
    ArrayList<Integer> weights = new ArrayList<>(mapOfCardsAndIds.values());
    
    int sum = Utility.calculateArraySum(weights);
    
    ArrayList<Integer> ids = new ArrayList<>(mapOfCardsAndIds.keySet());
    
    int[] resultArrayOfCards = new int[sum];
    
    for (int i = 0, k = 0, t = 0, elem = ids.get(t), weight = weights.get(t); i < sum; i++) {
      if (weight == k) {
        t++;
        elem = ids.get(t);
        weight = weights.get(t);
        k = 0;
      }
      resultArrayOfCards[i] = elem;
      k++;
    }
    
    
    Random random = new Random();
    return resultArrayOfCards[random.nextInt(sum)]; //return Id of card
  }
  
  
}