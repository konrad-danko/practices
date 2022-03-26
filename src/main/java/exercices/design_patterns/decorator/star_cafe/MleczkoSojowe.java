package exercices.design_patterns.decorator.star_cafe;

public class MleczkoSojowe  extends exercices.design_patterns.decorator.star_cafe.SkladnikDekorator {

  public MleczkoSojowe(Napoj napoj) {
    this.napoj = napoj;
  }

  @Override
  public String getOpis() {
    return napoj.getOpis() + ", mleczko sojowe";
  }

  @Override
  public double koszt() {
    return napoj.koszt() + 0.55;
  }
}
