package exercices.design_patterns.decorator.restaurant;

public class Surowka extends Dodatek{
  public Surowka(Danie danie) {
    super(danie);
    this.koszt = 4.99;
  }
}
