package exercices.design_patterns.decorator.star_cafe;

public class StarCafeSpecial extends exercices.design_patterns.decorator.star_cafe.Napoj {

  public StarCafeSpecial(){
    this.opis = "Specjalność firmy - kawa Star Cafe Special";
  }

  @Override
  public double koszt() {
    return 4.99;
  }
}
