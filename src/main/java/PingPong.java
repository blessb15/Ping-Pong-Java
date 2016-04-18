import java.util.ArrayList;
import java.io.Console;

public class PingPong{
  Console myConsole = System.console();

  public static void main(String[] args){
    }

    public static ArrayList<Object> PingPongMethod(Integer number){
      ArrayList<Object> numArray = new ArrayList<Object>();
      for (Integer index = 1; number >= index; index++ ){
        if (index % 15 == 0){
          numArray.add("PingPong");
        } else if (index % 5 == 0){
          numArray.add("Pong");
        } else if (index % 3 == 0){
            numArray.add("Ping");
        } else {
          numArray.add(index);
        }
        System.out.println(numArray);
      }
      return numArray;
    }
  }
