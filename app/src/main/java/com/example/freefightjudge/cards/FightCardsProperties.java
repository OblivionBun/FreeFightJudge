package com.example.freefightjudge.cards;

import android.content.Intent;

import com.example.freefightjudge.R;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class FightCardsProperties extends CardsProperties {
  // Заполнение конструктора конкретными значениями ID и весов карт для корректной роботы
  FightCardsProperties() {
    //ID of cards
    cardsIdAndWeight[0][0] = R.drawable.card_fight_01;
    cardsIdAndWeight[1][0] = R.drawable.card_fight_02;
    cardsIdAndWeight[2][0] = R.drawable.card_fight_03;
    cardsIdAndWeight[3][0] = R.drawable.card_fight_04;
    cardsIdAndWeight[4][0] = R.drawable.card_fight_05;
    //weights of cards
    cardsIdAndWeight[0][1] = 3;
    cardsIdAndWeight[1][1] = 3;
    cardsIdAndWeight[2][1] = 2;
    cardsIdAndWeight[3][1] = 1;
    cardsIdAndWeight[4][1] = 1;
  }
}
