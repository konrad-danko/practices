package exercices.flights;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Flight {
  private String flightNumber;
  private BigDecimal price;
  private String departureAirport;
  private String destinationAirport;
}
