package exercices.design_patterns.factory.fabryka_abstrakcyjna.pizze;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.fabryka_skladnikow.FabrykaSkladnikowPizzy;

public class OwoceMorzaPizza extends Pizza{

  FabrykaSkladnikowPizzy fabrykaSkladnikow;

  public OwoceMorzaPizza(FabrykaSkladnikowPizzy fabrykaSkladnikow) {
    this.fabrykaSkladnikow = fabrykaSkladnikow;
  }

  @Override
  public void przygotowanie() {
    System.out.println("Przygotowanie pizzy: " + nazwa);
    ciasto = fabrykaSkladnikow.utworzCiasto();
    sos = fabrykaSkladnikow.utworzSos();
    ser = fabrykaSkladnikow.utworzSer();
    malze = fabrykaSkladnikow.utworzMalze();
  }
}
