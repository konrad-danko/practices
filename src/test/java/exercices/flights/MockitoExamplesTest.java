package exercices.flights;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.hamcrest.MatcherAssert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.Is.is;

@ExtendWith(MockitoExtension.class)
public class MockitoExamplesTest {

  @Mock
  Airline airlineMock;

  @Test
  public void shouldCreateMockInstance() {
    MatcherAssert.assertThat(airlineMock, is(notNullValue()));
  }

  @Test
  public void verifyExamples1() throws FlightException {
    //na mocku 'airlineMock' wywołujemy metodę 'findFlight' z danymi parametrami
    airlineMock
        .findFlight("exactValue1", "exactValue2", LocalDate.now());

    //weryfikujemy czy na 'airlineMock' faktycznie została wywołana
    //metoda 'findFlight' z tymi samymi parametrami co powyżej
    Mockito.verify(airlineMock)
        .findFlight("exactValue1", "exactValue2", LocalDate.now());
  }

  @Test
  public void verifyExamples2() throws FlightException {
    //na mocku 'airlineMock' trzykrotnie wywołujemy metodę 'findFlight' z różnymi parametrami
    airlineMock.findFlight("exactValue1", "exactValue11", LocalDate.now());
    airlineMock.findFlight("exactValue2", "exactValue22", LocalDate.now());
    airlineMock.findFlight("exactValue3", "exactValue33", LocalDate.now());

    //weryfikujemy czy na 'airlineMock' co najwyżej trzykrotnie
    //została wywołana metoda 'findFlight' z jakimikolwiek parametrami
    Mockito.verify(airlineMock, Mockito.atMost(3))
        .findFlight(Mockito.anyString(), Mockito.any(), Mockito.any(LocalDate.class));
  }

  @Test
  public void verifyExamples3() throws FlightException {
    //na mocku 'airlineMock' wywołujemy metodę 'findFlight' z danymi parametrami
    airlineMock.findFlight("exactValue1", "exactValue2", LocalDate.now());

    //Tym razem sprawdzamy, czy metoda findFlight została wywołana co najmniej raz
    //z parametrami, które pasują do powyższych wymagań:
    Mockito.verify(airlineMock, Mockito.atLeastOnce())
        .findFlight(Mockito.contains("Val"), Mockito.startsWith("ex"), Mockito.eq(LocalDate.now()));
  }

  @Test
  public void whenExamples1() throws FlightException {
    //Mockito domyślnie tworzy stub-y dla wszystkich metod
    List<Flight> flight = airlineMock
        .findFlight("a", "b", LocalDate.now());

    //Domyślnie zwracają one “wartości zerowe” (pusta kolekcja, 0, null)
    MatcherAssert.assertThat(flight, is(notNullValue()));
    MatcherAssert.assertThat(flight.size(), is(0));
  }

  @Test
  public void whenExamples2() throws FlightException {
    //Gdy wywołujemy metodę 'findFlight' z danymi parametrami
    //to rzuć wyjątek 'FlightException'
    Mockito.when(airlineMock.findFlight("a", "b", LocalDate.now()))
        .thenThrow(new FlightException("some message"));

    //sprawdzamy czy zostanie rzucony wyjątek 'FlightException' w wyniku
    //wywołania metody 'findFlight' z takimi samymi parametrami jak powyżej
    Assertions.assertThrows(FlightException.class,
        () -> airlineMock.findFlight("a", "b", LocalDate.now()));
  }

  @Test
  public void whenExamples3() throws FlightException {
    //Gdy wywołujemy metodę 'findFlight' z danymi parametrami
    //to zwróć jednoelementową listę, zawierająca 'flight'
    Flight flight = new Flight("ABC123", BigDecimal.TEN, "dep", "arr");
    Mockito.when(airlineMock.findFlight("a", "b", LocalDate.now()))
        .thenReturn(Collections.singletonList(flight));

    //Zamiast powyższego można też tak, ale raczej lepiej jest jak powyżej
    /*Mockito.doReturn(Collections.singletonList(flight))
        .when(airlineMock)
        .findFlight("a", "b", LocalDate.now());*/

    //Wywołujemy metodę 'findFlight' z takimi samymi parametrami jak powyżej
    List<Flight> flights = airlineMock.findFlight("a", "b", LocalDate.now());
    //sprawdzamy czy zawartość utworzonej listy 'flights' jest taka jak oczekujemy
    MatcherAssert.assertThat(flights.size(), is(1));
    MatcherAssert.assertThat(flights.get(0), is(flight));
    MatcherAssert.assertThat(flights.get(0).getFlightNumber(), is("ABC123"));
    MatcherAssert.assertThat(flights.get(0).getDepartureAirport(), is("dep"));
    MatcherAssert.assertThat(flights.get(0).getDestinationAirport(), is("arr"));
  }
}
