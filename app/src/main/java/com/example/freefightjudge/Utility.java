package com.example.freefightjudge;

import com.example.freefightjudge.cards.AreaCardsProperties;
import com.example.freefightjudge.cards.CardsProperties;
import com.example.freefightjudge.cards.FightCardsProperties;
import com.example.freefightjudge.cards.ModCardsProperties;
import com.example.freefightjudge.cards.ScoreCardsProperties;
import com.example.freefightjudge.cards.TimeCardsProperties;

import java.util.Random;

public class Utility {
  //----------------------------------------
  // CARDS BLOCK
  public static int refreshCards() {
    Random random = new Random();
    int randomNumber;
  
    CardsProperties[] cardsProperties = new CardsProperties[5];
    for (int i = 0; i < cardsProperties.length; i++) {
      switch (i) {
        case 0:
          ScoreCardsProperties scoreCardsProperties = new ScoreCardsProperties();
          cardsProperties[i] = scoreCardsProperties;
          randomNumber = random.nextInt();
          break;
        case 1:
          FightCardsProperties fightCardsProperties = new FightCardsProperties();
          cardsProperties[i] = fightCardsProperties;
          break;
        case 2:
          TimeCardsProperties timeCardsProperties = new TimeCardsProperties();
          cardsProperties[i] = timeCardsProperties;
          break;
        case 3:
          AreaCardsProperties areaCardsProperties = new AreaCardsProperties();
          cardsProperties[i] = areaCardsProperties;
          break;
        case 4:
          ModCardsProperties modCardsProperties = new ModCardsProperties();
          cardsProperties[i] = modCardsProperties;
          break;
      }
    }
    
    
  }
  //----------------------------------------
  // MATH BLOCK
  public static int calculateArraySum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }
    return sum;
  }
}
