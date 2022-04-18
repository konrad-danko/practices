package exercices.design_patterns.decorator.restaurant;

import exercices.design_patterns.decorator.restaurant.skladnik_dekorator.Kompot;
import exercices.design_patterns.decorator.restaurant.skladnik_dekorator.Surowka;
import exercices.design_patterns.decorator.restaurant.skladnik_dekorator.Ziemniaki;
import exercices.design_patterns.decorator.restaurant.skladnik_glowny.Schabowy;

public class TestRestaurant {
  public static void main(String[] args) {
    Danie danie = new Schabowy();
    danie = new Ziemniaki(danie);
    danie = new Surowka(danie);
    danie = new Kompot(danie);
    System.out.println(danie.getOpis());
    System.out.println(danie.getKoszt());
  }
}
