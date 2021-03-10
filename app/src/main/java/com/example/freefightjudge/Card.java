package com.example.freefightjudge;

public class Card {
  private String name;
// TODO либо убраит нейм и дескрипшн, либо добавить мейнтекст и сабтекст
  private String description;

  private int image;

  public Card(String name, String description, int image) {
    this.name = name;
    this.description = description;
    this.image = image;
  }
  
  public Card(int image) {
    this.image = image;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getImage() {
    return image;
  }

  public void setImage(int image) {
    this.image = image;
  }
}
