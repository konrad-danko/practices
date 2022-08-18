package exercices.design_patterns.proxy.protection;

public interface Osoba {

  String pobierzImie();
  String pobierzPlec();
  String pobierzZainteresowania();
  int pobierzRankingPasji();

  void ustawImie(String nazwa);
  void ustawPlec(String plec);
  void ustawZainteresowania(String zainteresowania);
  void ustawRankingPasji(int ranking);
}
