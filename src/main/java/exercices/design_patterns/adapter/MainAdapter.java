package exercices.design_patterns.adapter;

import exercices.design_patterns.adapter.adaptery.IndykAdapter;
import exercices.design_patterns.adapter.indyki.DzikiIndyk;
import exercices.design_patterns.adapter.indyki.Indyk;
import exercices.design_patterns.adapter.kaczki.Kaczka;
import exercices.design_patterns.adapter.kaczki.KaczkaKrzyzowka;

public class MainAdapter {
  public static void main(String[] args) {
    Kaczka kaczka = new KaczkaKrzyzowka();
    Indyk indyk = new DzikiIndyk();
    Kaczka indykAdapter = new IndykAdapter(indyk);

    System.out.println("\nIndyk robi tak: ");
    indyk.gulgocz();
    indyk.lecJakIndyk();

    System.out.println("\nKaczka robi tak:");
    testujKaczke(kaczka);

    System.out.println("\nIndykAdapter robi tak:");
    testujKaczke(indykAdapter);
  }

  private static void testujKaczke(Kaczka kaczka){
    kaczka.kwacz();
    kaczka.lecJakKaczka();
  }
}
