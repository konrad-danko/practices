package exercices.flights;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.*;

public final class AirlineMock implements Airline {

  @AllArgsConstructor
  @EqualsAndHashCode
  private static final class MethodInvocation {
    String departureAirport;
    String arrivalAirport;
    LocalDate flightDate;
  }

  private final Set<MethodInvocation> invocations = new HashSet<>();

  void verifyCalled(String departureAirport, String destinationAirport, LocalDate flightDate) {
    boolean wasCalled = invocations.contains(new MethodInvocation(departureAirport, destinationAirport, flightDate));
    if (!wasCalled) {
      throw new AssertionError("One of the expected invocations wasn't called!");
    }
  }

  @Override
  public List<Flight> findFlight(String departureAirport, String destinationAirport, LocalDate flightDate) {
    invocations.add(new MethodInvocation(departureAirport, destinationAirport, flightDate));
    return Collections.emptyList();
  }
}
