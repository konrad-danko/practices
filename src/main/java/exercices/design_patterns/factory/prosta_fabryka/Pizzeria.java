package exercices.design_patterns.factory.prosta_fabryka;

import exercices.design_patterns.factory.prosta_fabryka.pizze.Pizza;

public class Pizzeria {
  private ProstaFabrykaPizzy fabrykaPizzy;

  public Pizzeria(ProstaFabrykaPizzy fabrykaPizzy) {
    this.fabrykaPizzy = fabrykaPizzy;
  }

  public Pizza zamowPizze(String rodzaj){
    Pizza pizza = fabrykaPizzy.utworzPizze(rodzaj);
    pizza.przygotowanie();
    pizza.pieczenie();
    pizza.krojenie();
    pizza.pakowanie();
    System.out.println("");
    return pizza;
  }
}
