package exercices.design_patterns.decorator.restaurant.skladnik_dekorator;

import exercices.design_patterns.decorator.restaurant.Danie;

public class Kompot extends Dodatek {
  
  public Kompot(Danie danie){
    super(danie);
    this.koszt = 2.99;
  }
}
