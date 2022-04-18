package exercices.design_patterns.observer;

import exercices.design_patterns.observer.obserwator.WarunkiBiezacePanel;
import exercices.design_patterns.observer.obserwowany.DanePogodowe;

public class Main {
  public static void main(String[] args) {

    DanePogodowe danePogodowe = new DanePogodowe();
    WarunkiBiezacePanel warunkiBiezacePanel = new WarunkiBiezacePanel(danePogodowe);

    //ustawienie nowych wartości powoduje ich wyświetlenie
    danePogodowe.ustawDane(25, 85, 985);
    danePogodowe.ustawDane(28, 85, 985);

    danePogodowe.usunObserwator(warunkiBiezacePanel);
    //z tego kodu nic się już nie wyświetli:
    danePogodowe.ustawDane(29, 85, 985);
  }
}
