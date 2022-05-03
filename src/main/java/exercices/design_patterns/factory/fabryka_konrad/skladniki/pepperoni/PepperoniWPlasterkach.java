package exercices.design_patterns.factory.fabryka_konrad.skladniki.pepperoni;

public class PepperoniWPlasterkach implements Pepperoni {
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "\n";
  }
}
