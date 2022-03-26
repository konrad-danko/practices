package exercices.six_task;

import org.junit.Test;
import static org.junit.Assert.*;

public class SixExerciseTest {

  @Test
  public void testMethod () {

    //given
    String[] myArray = new String[]{"bob", "alice", "paul", "ellie"};
    String expected = "BOB ALICE PAUL ELLIE";

    //when
    String actual = SixExercise.getUpperCaseOfArrayElements(myArray);

    //then
    //assertEquals(expected, actual, "Wrong test");
    assertEquals("Wrong test", expected, actual);
  }
}