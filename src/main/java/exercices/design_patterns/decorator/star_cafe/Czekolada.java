package exercices.design_patterns.decorator.star_cafe;

public class Czekolada extends exercices.design_patterns.decorator.star_cafe.SkladnikDekorator {
  public Czekolada(Napoj napoj) {
    this.napoj = napoj;
  }
  @Override
  public String getOpis() {
    return napoj.getOpis() + ", czekolada";
  }
  @Override
  public double koszt() {
    return napoj.koszt() + 1.10;
  }
}
