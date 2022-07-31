package exercices.design_patterns.composite;

public class Kelnerka {
  private final MenuSkladnik wszystkieMenu;

  public Kelnerka(MenuSkladnik wszystkieMenu) {
    this.wszystkieMenu = wszystkieMenu;
  }

  public void drukujMenu(){
    wszystkieMenu.drukuj();
  }
}
