import java.util.InputMismatchException;
import java.util.Scanner;

public class PizzaMenuLoop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        try {
            do {
                System.out.println("Please choose an item from below");
                System.out.println("_______________________________");
                System.out.println("1. Cheese Pizza");
                System.out.println("2. Pepperoni Pizza");
                System.out.println("3. Hamburger Pizza");
                System.out.println("4. Supreme Pizza");
                System.out.println("5. Cheesy Bread");
                System.out.println("6. Dessert Pizza");
                choice = in.nextInt();
            } while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6);
            switch (choice) {
                case 1:
                    System.out.println("You chose a Cheese Pizza. That will be $7.00");
                    break;
                case 2:
                    System.out.println("You chose a Pepperoni Pizza. That will be $9.00");
                    break;
                case 3:
                    System.out.println("You chose a Hamburger Pizza. That will be $11.00");
                    break;
                case 4:
                    System.out.println("You chose a Supreme Pizza. That will be $15.00");
                    break;
                case 5:
                    System.out.println("You chose Cheesy Bread. That will be $3.00");
                    break;
                case 6:
                    System.out.println("You chose a Dessert Pizza. That will be $5.00");
                default:
                    System.out.println("Have a good day!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a numerical choice 1 through 6. Thank you.");
        }

    }
}