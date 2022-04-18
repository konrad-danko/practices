package exercices.design_patterns.decorator.restaurant.skladnik_dekorator;

import exercices.design_patterns.decorator.restaurant.Danie;

public class Surowka extends Dodatek {
  
  public Surowka(Danie danie) {
    super(danie);
    this.koszt = 4.99;
  }
}
