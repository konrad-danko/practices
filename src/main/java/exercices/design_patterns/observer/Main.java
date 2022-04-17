package exercices.design_patterns.observer;

import exercices.design_patterns.observer.obserwator.WarunkiBiezacePanel;
import exercices.design_patterns.observer.obserwowany.DanePogodowe;

public class Main {
  public static void main(String[] args) {

    DanePogodowe danePogodowe = new DanePogodowe();
    WarunkiBiezacePanel warunkiBiezacePanel = new WarunkiBiezacePanel();
    danePogodowe.zarejestrujObserwator(warunkiBiezacePanel);

    //każde ustawienie nowej wartości powoduje
    //wyświetlenie wszystkich bieżących wartości:
    danePogodowe.ustawTemperature(25);
    danePogodowe.ustawWilgotnosc(85);
    danePogodowe.ustawCisnienie(985);
    danePogodowe.ustawTemperature(28);

    danePogodowe.usunObserwator(warunkiBiezacePanel);
    //z tego kodu nic się już nie wyświetli:
    danePogodowe.ustawWilgotnosc(80);
    danePogodowe.ustawCisnienie(989);
  }
}
