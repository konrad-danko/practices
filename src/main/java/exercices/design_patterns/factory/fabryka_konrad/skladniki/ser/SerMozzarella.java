package exercices.design_patterns.factory.fabryka_konrad.skladniki.ser;

public class SerMozzarella implements Ser {
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "\n";
  }
}
