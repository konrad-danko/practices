package exercices.design_patterns.factory.fabryka_konrad.skladniki.ciasto;

public class CienkieChrupkieCiasto implements Ciasto {
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "\n";
  }
}
