package exercices.design_patterns.decorator.restaurant.skladnik_glowny;

import exercices.design_patterns.decorator.restaurant.Danie;

public class DanieGlowne extends Danie {

  public DanieGlowne(){
    this.opis = this.getClass().getSimpleName();
  }

  public String getOpis() {
    return this.opis;
  }

  public double getKoszt() {
    return this.koszt;
  }
}
