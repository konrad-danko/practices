package exercices.flights;

import org.junit.Test;
import java.time.LocalDate;

public class FlightScannerTestMocks {
  @Test
  public void shouldFindLowestPrice() {
    String departureAirport = "departure";
    String destinationAirport = "arrival";
    LocalDate day = LocalDate.of(2018, 9, 22);
    AirlineMock mock1 = new AirlineMock();
    AirlineMock mock2 = new AirlineMock();
    AirlineMock mock3 = new AirlineMock();
    AirlineMock mock4 = new AirlineMock();

    FlightScanner flightScanner = new FlightScanner(mock1, mock2, mock3, mock4);
    flightScanner.findCheapestFlight(departureAirport, destinationAirport, day);
    flightScanner.findCheapestFlight("q", "w", LocalDate.of(2018, 1, 22));

    mock1.verifyCalled(departureAirport, destinationAirport, day);
    mock2.verifyCalled(departureAirport, destinationAirport, day);
    mock3.verifyCalled(departureAirport, destinationAirport, day);
    mock4.verifyCalled("q", "w", LocalDate.of(2018, 1, 22));
  }
}
