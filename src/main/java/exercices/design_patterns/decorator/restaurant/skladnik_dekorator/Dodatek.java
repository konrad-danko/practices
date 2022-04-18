package exercices.design_patterns.decorator.restaurant.skladnik_dekorator;

import exercices.design_patterns.decorator.restaurant.Danie;

public class Dodatek extends Danie {
  
  public Danie danie; //tu jest kwintesencja wzorca Dekorator

  public Dodatek(Danie danie) {
    this.danie = danie;
    this.opis = this.getClass().getSimpleName();
  }

  public String getOpis() {
    return danie.getOpis() + "\n" + this.opis;
  }

  public double getKoszt() {
    return danie.getKoszt() + this.koszt;
  }
}
