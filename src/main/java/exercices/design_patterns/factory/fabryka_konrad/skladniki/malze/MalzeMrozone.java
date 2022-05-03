package exercices.design_patterns.factory.fabryka_konrad.skladniki.malze;

public class MalzeMrozone implements Malze {
  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "\n";
  }
}
