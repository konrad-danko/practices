package exercices.design_patterns.command.urzadzenia;

public class DrzwiGarazowe {

  public void doGory() {
    System.out.println("Otwieram bramę garażową");
  }

  public void naDol() {
    System.out.println("Zamykam bramę garażową");
  }

  public void stop() {
    System.out.println("STOP! zatrzymaj bramę garażową");
  }

  public void wlaczSwiatlo() {
    System.out.println("Włączam światło w garażu - ON");
  }

  public void wylaczSwiatlo() {
    System.out.println("Wyłączam światło w garażu - OFF");
  }
}
