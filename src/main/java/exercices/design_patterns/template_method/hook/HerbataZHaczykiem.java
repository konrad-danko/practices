package exercices.design_patterns.template_method.hook;

import java.util.Random;

public class HerbataZHaczykiem extends GoracyNapojZHaczykiem{
  @Override
  protected void zaparzanie() {
    System.out.println("Zaparzamy herbatę z haczykiem");
  }

  @Override
  protected void domieszanieDodatkow() {
    System.out.println("Dodajemy cukier i cytrynę do kawy z haczykiem");
  }

  @Override
  protected boolean czyKlientZyczyDodatki(){
    Random random = new Random();
    boolean randomBoolean = random.nextBoolean();
    if (randomBoolean) {
      System.out.println("Wylosowano, że będą dodatki");
      return true;
    }
    System.out.println("Wylosowano, że niestety nie będzie dodatków");
    return false;
  }
}
