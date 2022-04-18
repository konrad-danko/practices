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
    this.listaObserwatorow.forEach(Obserwator::aktualizacja);
  }

  public void ustawDane(double temperatura, double wilgotnosc, double cisnienie){
    this.temperatura = temperatura;
    this.wilgotnosc = wilgotnosc;
    this.cisnienie = cisnienie;
    powiadomObserwatory();
  }
}
