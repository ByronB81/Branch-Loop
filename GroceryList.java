public class GroceryList {
  public static void main(String[] args) {
    String[] myGroceryList = {"ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yogurt"};
    String[] heroTeam = {"The Flash", "Superman", "Wonder Woman"};

    for (String groceryItem : myGroceryList) {
      System.out.println(groceryItem);
    }

    for (String hero : heroTeam) {
      System.out.println(hero);
    }
  }
}
