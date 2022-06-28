package exercices.design_patterns.adapter.kaczki;

public class KaczkaKrzyzowka implements Kaczka{
  @Override
  public void kwacz() {
    System.out.println("Kwa, kwa!");
  }

  @Override
  public void lecJakKaczka() {
    System.out.println("Ja latam wysoko jak kaczka!");
  }
}
