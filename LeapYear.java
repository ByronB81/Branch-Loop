import java.io.Console;

public class LeapYear {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("what year were you born in?");
    String birthString = console.readLine();
    Integer birth = Integer.parseInt(birthString);

    System.out.println("You were alive for the following leap years:");

    for (Integer year = birth; year < 2017; year++)
      if (year % 4 == 0) {
        System.out.println(year);
      }
  }
}
