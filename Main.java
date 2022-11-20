import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String welcomeMsg = "Welcome to our Diner! Please select an entree:\n" + "1) steak\n" + "2) wings\n" + "3) salad\n"
        + "and any other number for nothing!";
    String drinkQuestion = "\nPlease select a drink:\n" + "1) iced tea\n" + "2) soda\n" + "3) lemonade\n"
        + "and any other number for nothing!";

    /* Greet guest and ask which entree they'd like */
    log(welcomeMsg);
    int entreeChoice = input.nextInt();

    switch (entreeChoice) {
      case 1:
        log("Here is your steak!");
        break;
      case 2:
        log("Here is your wings!");
        break;
      case 3:
        log("Here is your salad!");
        break;
      default:
        log("You want nothing?!");
        break;
    }

    /* Greet guest and ask which entree they'd like */
    log(drinkQuestion);
    int drinkSelection = input.nextInt();

    switch (drinkSelection) {
      case 1:
        log("Here is your iced tea!");
        break;
      case 2:
        log("Here is your soda!");
        break;
      case 3:
        log("Here is your lemonade!");
        break;
      case 4:
        log("You want nothing?!");
      default:
        break;
    }

    /* Always make sure to close Scanner */
    input.close();
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}