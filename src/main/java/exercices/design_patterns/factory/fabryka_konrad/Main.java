package exercices.design_patterns.factory.fabryka_konrad;

import exercices.design_patterns.factory.fabryka_konrad.pizzerie.AmerykanskaPizzeria;
import exercices.design_patterns.factory.fabryka_konrad.pizzerie.WloskaPizzeria;

public class Main {
  public static void main(String[] args) {

    new WloskaPizzeria().zamowPizze("serowa");
    System.out.println("\n ******* \n");

    new WloskaPizzeria().zamowPizze("wegetarianska");
    System.out.println("\n ******* \n");

    new WloskaPizzeria().zamowPizze("owoce morza");
    System.out.println("\n ******* \n");

    new AmerykanskaPizzeria().zamowPizze("serowa");
    System.out.println("\n ******* \n");

    new AmerykanskaPizzeria().zamowPizze("wegetarianska");
    System.out.println("\n ******* \n");

    new AmerykanskaPizzeria().zamowPizze("owoce morza");
    System.out.println("\n ******* \n");
  }
}
