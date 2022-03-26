package exercices.design_patterns.decorator.restaurant;

public class Kompot extends Dodatek{
  public Kompot(Danie danie){
    super(danie);
    this.koszt = 2.99;
  }
}
