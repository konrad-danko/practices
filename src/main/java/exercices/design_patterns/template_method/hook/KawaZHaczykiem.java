package exercices.design_patterns.template_method.hook;

import java.util.Random;

public class KawaZHaczykiem extends GoracyNapojZHaczykiem{
  @Override
  protected void zaparzanie() {
    System.out.println("Zaparzamy kawę z haczykiem");
  }

  @Override
  protected void domieszanieDodatkow() {
    System.out.println("Dodajemy cukier i mleko do kawy z haczykiem");
  }

  @Override
  protected boolean czyKlientZyczyDodatki(){
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    if (randomNumber < 50) {
      System.out.println("Wylosowano liczbę: " + randomNumber + ", tak więc nie będzie dodatków");
      return false;
    }
    System.out.println("Wylosowano liczbę: " + randomNumber + ", tak więc dajemy dodatki");
    return true;
  }
}
