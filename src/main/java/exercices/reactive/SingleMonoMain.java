package exercices.reactive;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

public class SingleMonoMain {

  private static final long START_TIME = System.currentTimeMillis();
  private static long count = 0;
  private static final String URI_USD = "https://api.nbp.pl/api/exchangerates/rates/a/usd/2024-06-18/?format=json";

  public static void main(String[] args) {

    URI uri = URI.create(URI_USD);

    printTimeStampMessage("Just before creating a WebClient");
    WebClient webClient = WebClient.create();
    printTimeStampMessage("Just before creating a Mono");
    Mono<String> result = webClient
        .get()
        .uri(uri)
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(String.class);
    printTimeStampMessage("Just after creating a Mono");

    result
        .doFirst(() -> printTimeStampMessage("I'm just to process the Mono"))
        .doOnError(e-> printTimeStampMessage("Some error occurred"))
        .doOnNext(s -> printTimeStampMessage("This is from NBP:" + s))
        .doOnTerminate(() -> printTimeStampMessage("The count MM on termination is: " + count / 1000000))
        .subscribe();

    someLongRunningMethod();
  }

  private static void someLongRunningMethod() {
    printTimeStampMessage("Starting 'someLongRunningMethod()' to run");
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < 200 * 1000 * 1000; i++) {
      set.add(i % 500);
      count = i;
    }
    printTimeStampMessage("Completed 'someLongRunningMethod()' method");
  }

  private static void printTimeStampMessage(String message) {
    System.out.println(message + " in " + getTimeStamp() + " ms");
  }

  private static long getTimeStamp() {
    return System.currentTimeMillis() - START_TIME;
  }
}

