package exercices.design_patterns.factory.fabryka_abstrakcyjna;

import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizzerie.AmerykanskaPizzeria;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizzerie.Pizzeria;
import exercices.design_patterns.factory.fabryka_abstrakcyjna.pizzerie.WloskaPizzeria;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Pizzeria> pizzerias = new ArrayList<>();
    pizzerias.add(new WloskaPizzeria());
    pizzerias.add(new AmerykanskaPizzeria());

    for(Pizzeria p: pizzerias){
      p.zamowPizze("serowa");
      System.out.println("\n ***** \n");
      p.zamowPizze("owoce morza");
      System.out.println("\n ***** \n");
    }
  }
}
