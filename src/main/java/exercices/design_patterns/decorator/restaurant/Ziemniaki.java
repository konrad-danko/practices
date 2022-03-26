package exercices.design_patterns.decorator.restaurant;

public class Ziemniaki extends Dodatek{
  public Ziemniaki(Danie danie) {
    super(danie);
    this.koszt = 7.99;
  }
}
