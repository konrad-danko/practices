package exercices.design_patterns.observer.obserwowany;

import exercices.design_patterns.observer.obserwator.Obserwator;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DanePogodowe implements Podmiot{

  private final List<Obserwator> listaObserwatorow;
  private double temperatura;
  private double wilgotnosc;
  private double cisnienie;

  public DanePogodowe(){
    this.listaObserwatorow = new ArrayList<>();
  }

  @Override
  public void zarejestrujObserwator(Obserwator obserwator) {
    this.listaObserwatorow.add(obserwator);
  }

  @Override
  public void usunObserwator(Obserwator obserwator) {
    this.listaObserwatorow.remove(obserwator);
  }

  @Override
  public void powiadomObserwatory() {
    this.listaObserwatorow.forEach(o-> o.aktualizacja(this));
  }

  public void ustawTemperature(double temperatura){
    this.temperatura = temperatura;
    powiadomObserwatory();
  }

  public void ustawWilgotnosc(double wilgotnosc){
    this.wilgotnosc = wilgotnosc;
    powiadomObserwatory();
  }

  public void ustawCisnienie(double cisnienie){
    this.cisnienie = cisnienie;
    powiadomObserwatory();
  }
}
