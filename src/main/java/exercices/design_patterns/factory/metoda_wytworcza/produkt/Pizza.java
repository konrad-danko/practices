package exercices.design_patterns.factory.metoda_wytworcza.produkt;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
  String nazwa;
  String ciasto;
  String sos;
  List<String> dodatki = new ArrayList<>();

  public void przygotowanie(){
    System.out.println("Przygotowanie pizzy: " + nazwa);
    System.out.println("Wyrabianie ciasta: " + ciasto);
    System.out.println("Dodawanie sosu: " + sos);
    System.out.println("Dodatki:");
    for (String dodatek: dodatki) {
      System.out.println("   " + dodatek);
    }
  }

  public void pieczenie(){
    System.out.println("Pieczenie: 25 minut w temperaturze 180 st.C");
  }

  public void krojenie(){
    System.out.println("Krojenie pizzy na 8 kawałków");
  }

  public void pakowanie(){
    System.out.println("Pakowanie pizzy do firmowego pudełka sieci 'Super Pizzeria'");
  }

  public String pobierzNazwa(){
    return nazwa;
  }
}
