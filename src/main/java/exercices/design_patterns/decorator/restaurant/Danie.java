package exercices.design_patterns.decorator.restaurant;

public abstract class Danie {
  
  protected String opis;
  protected double koszt;

  public abstract String getOpis();

  public abstract double getKoszt();
}
