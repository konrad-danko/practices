package exercices.design_patterns.decorator.star_cafe;

public class Mleko extends SkladnikDekorator{

  public Mleko(Napoj napoj) {
    this.napoj = napoj;
  }

  @Override
  public String getOpis() {
    return napoj.getOpis() + ", mleko";
  }

  @Override
  public double koszt() {
    return napoj.koszt() + 0.45;
  }
}
