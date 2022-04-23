package exercices.design_patterns.factory.prosta_fabryka;

public class Main {
  public static void main(String[] args) {

    Pizzeria pizzeria = new Pizzeria(new ProstaFabrykaPizzy());
    pizzeria.zamowPizze("serowa");
    pizzeria.zamowPizze("wegetarianska");
    pizzeria.zamowPizze("owocemorza");
    pizzeria.zamowPizze("pepperoni");
    pizzeria.zamowPizze("pepperoni");
  }
}
