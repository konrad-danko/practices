package exercices.design_patterns.proxy.protection;

public class MainProtection {
  public static void main(String[] args) {

    Osoba janek = new OsobaImpl();
    janek.ustawImie("Jan Kowalski");
    janek.ustawPlec("M");
    janek.ustawZainteresowania("Sport, Muzyka");
    janek.ustawRankingPasji(8);

    Osoba posrednikWlasciciela = InvocationHandlerWlasciciel
        .pobierzPosrednikWlasciciela(janek);
    System.out.println("Imię to: " + posrednikWlasciciela.pobierzImie());
    posrednikWlasciciela.ustawZainteresowania("Kręgle, go");
    System.out.println("Pośrednik właściciela ustawił zainteresowania");
    try {
      posrednikWlasciciela.ustawRankingPasji(5);
    } catch (Exception e) {
      System.out.println("Nie można zmieniać oceny przez pośrednika właściciela.");
    }
    System.out.println("Wartość rankingu to: " + posrednikWlasciciela.pobierzRankingPasji());

    System.out.println("***************");

    Osoba posrednikNieWlasciciela = InvocationHandlerNieWlasciciel
        .pobierzPosrednikNieWlasciciela(janek);
    System.out.println("Imię to: " + posrednikNieWlasciciela.pobierzImie());
    try {
      posrednikNieWlasciciela.ustawZainteresowania("Kręgle, go");
    } catch (Exception e) {
      System.out.println("Nie można zmieniać zainteresowań przez pośrednika niewłaściciela");
    }
    posrednikNieWlasciciela.ustawRankingPasji(3);
    System.out.println("Pośrednik obcy zmienił wartość rankingu");
    System.out.println("Wartość rankingu to: " + posrednikNieWlasciciela.pobierzRankingPasji());


  }
}
