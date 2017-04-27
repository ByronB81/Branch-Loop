import java.io.Console;

public class Counter {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Hey you... with the funny nose... Pick a number!");
    String strNum = console.readLine();
    Integer num = Integer.parseInt(strNum);
    System.out.println("You picked " + num);

    for (Integer i = 0; i < num; i++){
      System.out.print("This number is ");
      if (i % 2 == 0) {
        System.out.println("EVEN");
      } else {
        System.out.println("ODD");
      }
    }

    System.out.println("Nifty, eh?!?");
  }
}
