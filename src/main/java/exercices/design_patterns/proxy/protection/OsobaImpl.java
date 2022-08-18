package exercices.design_patterns.proxy.protection;

public class OsobaImpl implements Osoba{

  private String nazwa;
  private String plec;
  private String zainteresowania;
  private int ranking;
  private int rankingLiczba = 0;


  @Override
  public String pobierzImie() {
    return nazwa;
  }

  @Override
  public String pobierzPlec() {
    return plec;
  }

  @Override
  public String pobierzZainteresowania() {
    return zainteresowania;
  }

  @Override
  public int pobierzRankingPasji() {
    if (rankingLiczba == 0) return 0;
    return (ranking/rankingLiczba);
  }

  @Override
  public void ustawImie(String nazwa) {
    this.nazwa = nazwa;
  }

  @Override
  public void ustawPlec(String plec) {
    this.plec = plec;
  }

  @Override
  public void ustawZainteresowania(String zainteresowania) {
    this.zainteresowania = zainteresowania;
  }

  @Override
  public void ustawRankingPasji(int ranking) {
    this.ranking = this.ranking + ranking;
    rankingLiczba++;
  }
}
