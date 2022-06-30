package exercices.design_patterns.facade.zasada_ograniczonej_interakcji;

public class Samochod {
  // 4. Składnik klasy 'silnik'. Jego metody możemy wywoływać bez ograniczeń:
  private Silnik silnik;

  public void uruchomSamochod(Kluczyk kluczyk) {
    // 3. Tutaj tworzymy nowy obiekt 'drzwi'. Jego metody sa całkowicie legalne:
    Drzwi drzwi = new Drzwi();
    // 2. Możesz wywoływać metody na obiekcie 'kluczyk', przekazanym jako argument
    boolean uprawniony = kluczyk.obrotWStacyjce();
    if (uprawniony) {
      // 4. Możesz wywoływać metody na składniku 'silnik' (składniku klasy):
      this.silnik.uruchom();
      // 1. Możesz wywoływać lokalne metody wewnątrz obiektu:
      this.aktualizacjaWskaznikowKokpitu();
      // 3. Możesz wywoływać metody na obiekcie 'drzwi', który sam tworzysz:
      drzwi.zamknijZamek();
    }
  }

  // 1. Lokalna metoda obiektu:
  public void aktualizacjaWskaznikowKokpitu() {
    //aktualizacja informacji na desce rozdzielczej
  }
}
