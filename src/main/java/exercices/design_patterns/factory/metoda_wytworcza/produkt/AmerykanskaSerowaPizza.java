package exercices.design_patterns.factory.metoda_wytworcza.produkt;

public class AmerykanskaSerowaPizza extends Pizza{

  public AmerykanskaSerowaPizza() {
    nazwa = "Amerykańska pizza serowa";
    ciasto = "Wyjątkowo grube, chrupkie ciasto";
    sos = "Sos z pomidorów śliwkowych";
    dodatki.add("Grubo tarty ser mozzarella");
  }

  @Override
  public void krojenie(){
    System.out.println("Krojenie pizzy na kwadratowe kawałki");
  }
}
