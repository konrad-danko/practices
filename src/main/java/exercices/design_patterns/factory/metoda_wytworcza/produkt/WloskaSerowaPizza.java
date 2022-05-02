package exercices.design_patterns.factory.metoda_wytworcza.produkt;

public class WloskaSerowaPizza extends Pizza{

  public WloskaSerowaPizza() {
    nazwa = "Włoska pizza serowa z sosem marinara";
    ciasto = "Cienkie, kruche ciasto";
    sos = "Sos marinara";
    dodatki.add("Tarty ser reggiano");
  }
}
