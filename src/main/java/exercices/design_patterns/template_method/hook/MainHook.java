package exercices.design_patterns.template_method.hook;

public class MainHook {
  public static void main(String[] args) {
    System.out.println("\n Przygotowanie herbaty z haczykiem\n");
    GoracyNapojZHaczykiem herbataZHaczykiem = new HerbataZHaczykiem();
    herbataZHaczykiem.recepturaParzenia();

    System.out.println("\n\n Przygotowanie kawy z haczykiem\n");
    GoracyNapojZHaczykiem kawaZHaczykiem = new KawaZHaczykiem();
    kawaZHaczykiem.recepturaParzenia();
  }
}
