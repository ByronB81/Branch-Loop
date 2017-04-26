import java.io.Console;

public class FizzBang {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Pick a number Daddy-0");
    String strNum = console.readLine();
    Integer num = Integer.parseInt(strNum);

    for (Integer i = 1; i < num; i++)
      if (i % 15 == 0) {
        System.out.println("F I Z Z B A N G muthafucka!!!");
      } else {
        System.out.println(i);
      }
  }
}
