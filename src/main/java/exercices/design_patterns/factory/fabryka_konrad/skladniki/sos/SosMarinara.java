package exercices.design_patterns.factory.fabryka_konrad.skladniki.sos;

public class SosMarinara implements Sos {
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "\n";
  }
}
