package exercices.design_patterns.strategy.interfejsy.latanie;

public class NieLatam implements LatanieInterfejs {
  @Override
  public void lec() {
    System.out.println("Ja niestety nie latam!");
  }
}
