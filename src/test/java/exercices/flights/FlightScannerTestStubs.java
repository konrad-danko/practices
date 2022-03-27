package exercices.flights;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightScannerTestStubs {

  private Airline stub1 = (departureAirport, destinationAirport, flightDate) -> Collections.singletonList(
      new Flight("AB1234", new BigDecimal(100), "WRO", "BCN")
  );

  private Airline stub2 = (departureAirport, destinationAirport, flightDate) -> Collections.singletonList(
      new Flight("AB2345", new BigDecimal(200), "WRO", "BCN")
  );

  private Airline stub3 = (departureAirport, destinationAirport, flightDate) -> { throw new FlightException("BOOM!"); };

  private Airline stub4 = (q, w, e)-> {
    List<Flight> flightList = new ArrayList<>();
    flightList.add(new Flight("AB4567", new BigDecimal(9), "asd", "hgfd"));
    flightList.add(new Flight("AB9999", new BigDecimal(8), "asd", "hgfd"));
    return flightList;
  };

  @Test
  public void shouldFindLowestPrice() {
    FlightScanner flightScanner = new FlightScanner(stub1, stub2, stub3, stub4);
    Assert.assertThat(flightScanner.findCheapestFlight("not", "important", null)
        .getFlightNumber(), is("AB9999"));
    Assert.assertEquals("AB9999", flightScanner.
        findCheapestFlight(null, null, null)
        .getFlightNumber()
    );
  }
}