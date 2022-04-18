package exercices.design_patterns.decorator.restaurant.skladnik_dekorator;

import exercices.design_patterns.decorator.restaurant.Danie;

public class Ziemniaki extends Dodatek {
  
  public Ziemniaki(Danie danie) {
    super(danie);
    this.koszt = 7.99;
  }
}
