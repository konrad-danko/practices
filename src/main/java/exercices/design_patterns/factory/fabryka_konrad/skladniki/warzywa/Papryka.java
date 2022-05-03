package exercices.design_patterns.factory.fabryka_konrad.skladniki.warzywa;

public class Papryka implements Warzywa {
  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }
}
