package exercices.design_patterns.observer.obserwator;

import exercices.design_patterns.observer.obserwowany.DanePogodowe;

public class WarunkiBiezacePanel implements Obserwator, PanelInformacyjny{

  private double temperatura;
  private double wilgotnosc;
  private double cisnienie;
  private DanePogodowe danePogodowe;

  public WarunkiBiezacePanel(DanePogodowe danePogodowe) {
    this.danePogodowe = danePogodowe;
    this.danePogodowe.zarejestrujObserwator(this);
  }

  @Override
  public void aktualizacja() {
    this.temperatura = this.danePogodowe.getTemperatura();
    this.wilgotnosc = this.danePogodowe.getWilgotnosc();
    this.cisnienie = this.danePogodowe.getCisnienie();
    wyswietl();
  }

  @Override
  public void wyswietl() {
    System.out.println("\nWyświetlam bieżące wartości pomiarowe:");
    System.out.println("Temperatura: " + this.temperatura + " st C");
    System.out.println("Wilgotność: " + this.wilgotnosc + " %");
    System.out.println("Ciśnienie: " + this.cisnienie + " hPa");
  }
}
