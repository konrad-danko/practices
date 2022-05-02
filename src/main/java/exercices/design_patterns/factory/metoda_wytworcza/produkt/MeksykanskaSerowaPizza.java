package exercices.design_patterns.factory.metoda_wytworcza.produkt;

public class MeksykanskaSerowaPizza extends Pizza{

  public MeksykanskaSerowaPizza() {
    nazwa = "Meksykańska pizza serowa";
    ciasto = "Cienkie, miękkie ciasto";
    sos = "Sos z pomidorów malinowych";
    dodatki.add("Plastry sera edamskiego");
    dodatki.add("Kukurydza");
  }

  @Override
  public void krojenie(){
    System.out.println("Krojenie pizzy na trapezowe kawałki");
  }
}
