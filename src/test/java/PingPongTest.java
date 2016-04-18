import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest{
  // test
  @Test
  public void isUserNumber_DivisibleByThreeFiveOrFifteen_Array() {
  PingPong pingpong = new PingPong();
  ArrayList<Object> expected = new ArrayList<Object>();
  expected.add(1);
  expected.add(2);
  assertEquals(expected, pingpong.PingPongMethod(2));
  }
}
