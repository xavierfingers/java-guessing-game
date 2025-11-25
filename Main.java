import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    System.out.println("I'm guessing a number");
    var guesses = Math.random() * 100000 * 10000000;
    var input = scanner.nextLine();
    switch(input) {
    case "quit":
      System.out.println("Quitting...");
       System.exit(0);
     break;
    case "show":
       System.out.println("The number was: " + guesses);
      break;
   }
 }
}

