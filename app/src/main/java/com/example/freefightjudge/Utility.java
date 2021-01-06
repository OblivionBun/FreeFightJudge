package com.example.freefightjudge;

import com.example.freefightjudge.cards.AreaCardsProperties;
import com.example.freefightjudge.cards.CardsProperties;
import com.example.freefightjudge.cards.FightCardsProperties;
import com.example.freefightjudge.cards.ModCardsProperties;
import com.example.freefightjudge.cards.ScoreCardsProperties;
import com.example.freefightjudge.cards.TimeCardsProperties;

import java.util.ArrayList;
import java.util.Random;

public class Utility {
  // CARD BLOCK
  public static String getTitleCard(int id) {
    switch (id) {
      case R.drawable.card_score_01:
        return "1 Очко";
      case R.drawable.card_score_02:
        return "3 Очка";
      case R.drawable.card_score_03:
        return "5 Очков";
      case R.drawable.card_score_04:
        return "7 Очков";
      case R.drawable.card_score_05:
        return "10 Очков";
      case R.drawable.card_fight_01:
        return "Простота";
      case R.drawable.card_fight_02:
        return "Голова и корпус";
      case R.drawable.card_fight_03:
        return "Стоп-эффект";
      case R.drawable.card_fight_04:
        return "Ранения";
      case R.drawable.card_fight_05:
        return "Обострение";
      case R.drawable.card_time_01:
        return "Простой развод";
      case R.drawable.card_time_02:
        return "Чёткий развод";
      case R.drawable.card_time_03:
        return "Без развода";
      case R.drawable.card_time_04:
        return "1 минута";
      case R.drawable.card_time_05:
        return "30 секунд";
      case R.drawable.card_area_01:
        return "Чистое поле";
      case R.drawable.card_area_02:
        return "Площадь";
      case R.drawable.card_area_03:
        return "Комната";
      case R.drawable.card_area_04:
        return "Яма";
      case R.drawable.card_area_05:
        return "Доска над ямой";
      case R.drawable.card_mod_01:
        return "Базовые правила";
      case R.drawable.card_mod_02:
        return "Превентивная атака";
      case R.drawable.card_mod_03:
        return "Остров";
      case R.drawable.card_mod_04:
        return "Ни шагу назад";
      case R.drawable.card_mod_05:
        return "Разворот";
      case R.drawable.card_mad_01:
        return "Сломаны острия";
      case R.drawable.card_mad_02:
        return "Тупые клинки";
      case R.drawable.card_mad_03:
        return "Пол-лица";
      case R.drawable.card_mad_04:
        return "Наручники";
      case R.drawable.card_mad_05:
        return "Кандалы";
      case R.drawable.card_mad_06:
        return "Обстрел";
      case R.drawable.card_mad_07:
        return "Золотой гол";
      case R.drawable.card_mad_08:
        return "Сигнал к атаке";
      case R.drawable.card_mad_09:
        return "Это спарта!";
      case R.drawable.card_mad_10:
        return "Свалка";
    }
    
    return "Не нашёл :(";
  }
  
  public static String getDescriptionCard(int id) {
    switch (id) {
      case R.drawable.card_score_01:
        return "Для победы нужно набрать одно очко по правилам раунда.";
      case R.drawable.card_score_02:
        return "Для победы нужно набрать три очка по правилам раунда.";
      case R.drawable.card_score_03:
        return "Для победы нужно набрать пять очков по правилам раунда.";
      case R.drawable.card_score_04:
        return "Для победы нужно набрать семь очков по правилам раунда.";
      case R.drawable.card_score_05:
        return "Для победы нужно набрать десять очков по правилам раунда.";
      case R.drawable.card_fight_01:
        return "Любая чёткая атака: 1 очко.";
      case R.drawable.card_fight_02:
        return "Чёткие атаки в голову и корпус: 3 очка. Чёткие атаки в конечности: 1 очко.";
      case R.drawable.card_fight_03:
        return "Укол или щелчок: 1 очко. Обычный удар или порез: 2 очка. Фатальный удар или " +
            "порез, а также укол в голову или сердце: 3 очка.";
      case R.drawable.card_fight_04:
        return "Атака в конечность выводит её из строя: рука прячется за спину, нога сгибаентся " +
            "в колене. Атака в корпус или голову, а также вывод из строя двух рук: 1 очко. " +
            "Получения очка - всегда развод с \"регенерацией\"";
      case R.drawable.card_fight_05:
        return "Первая чёткая атака в раунде: 1 очко. Вторая чёткая атака в раунде: 2 очка." +
            "И так далее!";
      case R.drawable.card_time_01:
        return "Развод после каждого очка, время не ограничено.";
      case R.drawable.card_time_02:
        return "Развод после атаки в голову или корпус, время не ограничено.";
      case R.drawable.card_time_03:
        return "Без развода, время не ограничено.";
      case R.drawable.card_time_04:
        return "Без развода. Если за минуту победа не одержана, то присуждается взаимное " +
            "поражение.";
      case R.drawable.card_time_05:
        return "Без развода. Если за 30 секунд победа не одержана, то присуждается взаимное " +
            "поражение.";
      case R.drawable.card_area_01:
        return "Нет ограничений площадки (по возможностям полигона). Зрители обязаны отходит от " +
            "бойцов не менее, чем на 3 метра.";
      case R.drawable.card_area_02:
        return "Круг диаметром 7 метров. Выход за границу приводит к паузе и возврату бойцов.";
      case R.drawable.card_area_03:
        return "Квадрат со стороный 4 метра. Выход за границу приводит к паузе и возврату бойцов.";
      case R.drawable.card_area_04:
        return "Круг диаметром 3 метра. Бойцы начинают с ногой на границе площадки. " +
            "Выход за границу приводит к паузе и возврату бойцов";
      case R.drawable.card_area_05:
        return "Площадка до 14м х 0,2м, либо подходящая доска или бревно. " +
            "Выход за границу наказывается на 1 очко";
      case R.drawable.card_mod_01:
        return "Никаких особых правил, всё по остальным картам";
      case R.drawable.card_mod_02:
        return "Афтерблоу после результативной атаки в голову или вооружённую руку игнорируется.";
      case R.drawable.card_mod_03:
        return "Выход хотя бы одной ногой за пределы площадки и падение приравнивается к " +
            "пропуску чёткой атаки в голову по правилам раунда.";
      case R.drawable.card_mod_04:
        return "Шаг назад наказывается на 1 очко.";
      case R.drawable.card_mod_05:
        return "Бойцы начинают ббой в положении \"спина к спине\" и возвращаются в него на " +
            "каждый развод.";
      case R.drawable.card_mad_01:
        return "Уколы не приносят очки, результативны только удары и порезы.";
      case R.drawable.card_mad_02:
        return "Удары и порезы не приносят очки, результативны только уколы.";
      case R.drawable.card_mad_03:
        return "Половина маски по вертикали заклеивается скотчем.";
      case R.drawable.card_mad_04:
        return "Руки бойцов связаны короткой верёвкой.";
      case R.drawable.card_mad_05:
        return "Но ногу каждого из бойцов крепится затрудняющий передвижение груз.";
      case R.drawable.card_mad_06:
        return "Зрители метают в бойцов предметы. Это не снимает очки, но отвлекает.";
      case R.drawable.card_mad_07:
        return "Для победы в раунде достаточно набрать 1 очко. Проигравший получает минус к рейтингу.";
      case R.drawable.card_mad_08:
        return "Один ассистент по сигналу другого атакует бойцов по очереди.";
      case R.drawable.card_mad_09:
        return "Боец, оказавшийся за пределами площдки, проигрывает раунд. Проигравший получает минус к рейтингу.";
      case R.drawable.card_mad_10:
        return "Площадка заполнена посторонними предметами. Их можно кидать, но это не приносит очки. Альтернатива: лес.";
    }
    
    return "Не нашёл :(";
  }
  // MATH BLOCK
  public static int calculateArraySum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }
    return sum;
  }
  
  public static int calculateArraySum(ArrayList<Integer> array) {
    int sum = 0;
    for (int i = 0; i < array.size(); i++) {
      sum = sum + array.get(i);
    }
    return sum;
  }
}
