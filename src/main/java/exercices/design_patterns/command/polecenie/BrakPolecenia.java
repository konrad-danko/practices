package exercices.design_patterns.command.polecenie;

public class BrakPolecenia implements Polecenie{

  @Override
  public void wykonaj() {
    System.out.println("Nie ma czego wykonać");
  }

  @Override
  public void wycofaj() {
    System.out.println("Nie ma czego wycofać");
  }
}
