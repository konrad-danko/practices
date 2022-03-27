package exercices.flights;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

public class FlightScannerTestMockito {
  @Test
  public void shouldFindLowestPrice() throws FlightException {
    String departureAirport = "departure";
    String destinationAirport = "arrival";
    LocalDate day = LocalDate.of(2018, 9, 22);
    Airline mock1 = Mockito.mock(Airline.class);
    Airline mock2 = Mockito.mock(Airline.class);
    Airline mock3 = Mockito.mock(Airline.class);

    FlightScanner flightScanner = new FlightScanner(mock1, mock2, mock3);
    flightScanner.findCheapestFlight(departureAirport, destinationAirport, day);
    flightScanner.findCheapestFlight("dep", "des", LocalDate.now());

    Mockito.verify(mock1).findFlight(departureAirport, destinationAirport, day);
    Mockito.verify(mock2).findFlight(departureAirport, destinationAirport, day);
    Mockito.verify(mock3).findFlight("dep", "des", LocalDate.now());
  }
}
