package exercices.reactive;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfMonoMain {

  private static final long START_TIME = System.currentTimeMillis();
  private static long count = 0;
  private static final String URI_USD = "https://api.nbp.pl/api/exchangerates/rates/a/usd/2024-06-18/?format=json";


  public static void main(String[] args) {

    Stream<Mono<String>> monoStringStream = createMonoStringStream(100);
    processMonoStringStream(monoStringStream);
    someLongRunningMethod();
  }

  private static void processMonoStringStream(Stream<Mono<String>> stream){
    printTimeStampMessage("Just before processing a Stream of Monos");
    stream
        .forEach(mono-> processSingleMono(mono));
    printTimeStampMessage("Just completed processing a Stream of Monos");
  }

  private static void processSingleMono(Mono<String> mono){
    mono
        .doOnError(e-> printTimeStampMessage("Some error occurred"))
        .doOnNext(s -> printTimeStampMessage("   Processing a mono:" + s))
        .subscribe();
  }

  private static Stream<Mono<String>> createMonoStringStream(int size){
    printTimeStampMessage("Just before creating a Stream of Monos");
    Stream<Mono<String>> result = IntStream.range(1, size)
        .mapToObj(i -> i%3 ==0 ? getResponseFromAPI(i) : createSimpleMono(i));
    printTimeStampMessage("Just after creating a Stream of Monos");
    return result;
  }

  private static Mono<String> createSimpleMono(int index){
    printTimeStampMessage("  " + index + ": Just before creating a simple Mono");
    Mono<String> result = Mono.just(index + ": Some simple Mono content");
    printTimeStampMessage("  " + index + ": Just after creating a simple Mono");
    return result;
  }

  private static Mono<String> getResponseFromAPI(int index){
    URI uri = URI.create(URI_USD);
    printTimeStampMessage("  " + index + ": Just before creating a WebClient");
    WebClient webClient = WebClient.create();
    printTimeStampMessage("  " + index + ": Just before creating an API Mono");
    Mono<String> result = webClient
        .get()
        .uri(uri)
        .accept(MediaType.APPLICATION_JSON)
        .retrieve()
        .bodyToMono(String.class)
        .map(s-> index + ": " + s);
    printTimeStampMessage("  " + index + ": Just after creating an API Mono");
    return result;
    //return Mono.just(result.block());
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
