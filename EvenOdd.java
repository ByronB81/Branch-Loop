import java.io.Console;

public class EvenOdd {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter a number");
    String strNum = console.readLine();
    Integer num = Integer.parseInt(strNum);

    for (Integer index = 1; index <= num; index++)
      if (index == num) {
        System.out.println("Blamo!!!");
      } else if (index % 2 == 0){
        System.out.println("...even..");
      } else {
        System.out.println("+++ODD+++");
      }

      System.out.println("You getting better, son!");
  }
}
