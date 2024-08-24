package exercices.reactive;

import org.apache.commons.lang3.tuple.Pair;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReactiveMain {
  private static final long START_TIME = System.currentTimeMillis();
  private static final int fluxSize = 12;

  private static final List<Pair<Integer, String>> pairList = new ArrayList<>();
  private static final Set<Integer> keySet = new HashSet<>();
  private static int count = 0;

  private String getqqq() {
    synchronized (this){
      if(true){
        System.out.println("");
      }
    }

    return "";
  }

  public static void main(String[] args) {

/*    Flux.range(1, 100)
        .parallel(2)
        .subscribe(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));*/

/*    Flux.range(1, 100)
        .parallel(8)
        .runOn(Schedulers.parallel())
        .subscribe(i -> System.out.println(Thread.currentThread().getName() + " -> " + i));*/

    System.out.println("Launching the 'main()' method" + getTimeFromStart());
    Flux<Pair<Integer, String>> flux = createFlux(fluxSize);
    System.out.println("Processing the 'main()' method" + getTimeFromStart());
    flux
        .doOnSubscribe(p -> System.out.println("Just subscribing to the Flux"))
        //.map(p -> createPair(fluxSize + p.getKey()))
        .doOnNext(pair -> consumePair(pair))
        .doOnComplete(() -> System.out.println("The Flux is now completed"))
        .doOnTerminate(() -> System.out.println("The Flux is now terminated"))
        .subscribe();
    System.out.println("Completed the 'main()' method" + getTimeFromStart());
    System.out.println("The list size is: " + pairList.size());
    System.out.println("The set size is: " + keySet.size());
    System.out.println("The count is: " + count);

  }

  private static Flux<Pair<Integer, String>> createFlux(int size) {
    System.out.println("Just starting to create a new Flux of " + fluxSize + " elements");
    Flux<Pair<Integer, String>> flux = Flux.range(1, size)
        .map(i -> createPair(i));
    System.out.println("Just completed to create a new Flux of " + fluxSize + " elements");
    return flux;
  }

  private static Pair<Integer, String> createPair(int key) {
    System.out.println("  Creating a message no:" + key + getTimeFromStart());
    if (key == 5) {
      someLongRunningMethod(1);
    }
    return Pair.of(key, "Message no:" + key);
  }

  private static void consumePair(Pair<Integer, String> pair) {
    if (pair.getKey() == fluxSize - 5) {
      someLongRunningMethod(2);
    }
    pairList.add(pair);
    keySet.add(pair.getKey());
    count++;
    System.out.println("  Consuming pair: " + pair.getValue() + getTimeFromStart());
  }

  private static void someLongRunningMethod(int sequence) {
    System.out.println(sequence + "-Starting 'someLongRunningMethod()' to run" + getTimeFromStart());
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < 100 * 1000 * 1000; i++) {
      set.add(i % 300);
    }
    System.out.println(sequence + "-Completed 'someLongRunningMethod()' method" + getTimeFromStart());
  }

  private static String getTimeFromStart() {
    return " in " + (System.currentTimeMillis() - START_TIME) + "ms";
  }


}

