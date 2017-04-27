import java.io.Console;

public class DishDance {
  public static void main(String[] args){
    String[] dishes = {"pizza","french fries", "hamburger","gyro","waffles","cookies","beef jerky","ramen","tofu","cheese", "crackers"};
    Console console = System.console();
    System.out.println("How many dishes would you like for dinner?");
    String strNum = console.readLine();
    Integer num = Integer.parseInt(strNum);
    System.out.println(num + " dishes?! My, my, someone is hungry. Coming right up!");
     for (Integer i = 0; i < num; i++) {
       System.out.println("let's try some " + dishes[i]);
     }
     System.out.println("Okay that's all " + num + " dishes. I hope you're full!");
  }
}
