package exercices.design_patterns.observer.obserwator;

import exercices.design_patterns.observer.obserwowany.DanePogodowe;

public class WarunkiBiezacePanel implements Obserwator, PanelInformacyjny{

  private double temperatura;
  private double wilgotnosc;
  private double cisnienie;

  @Override
  public void aktualizacja(DanePogodowe dane) {
    this.temperatura = dane.getTemperatura();
    this.wilgotnosc = dane.getWilgotnosc();
    this.cisnienie = dane.getCisnienie();
    wyswietl();
  }

  @Override
  public void wyswietl() {
    System.out.println("\nWyświetlam bieżące wartości pomiarowe:");
    System.out.println("Temperatura: " + this.temperatura + " st C");
    System.out.println("Wilgotnosc: " + this.wilgotnosc + " %");
    System.out.println("Cisnienie: " + this.cisnienie + " hPa");
  }
}
