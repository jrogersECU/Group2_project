import java.util.Scanner;
public class Main {

    public static void print_service()
    {
        // WELCOME MESSAGE (START OF PROGRAM)
        System.out.println("Welcome to the printing service! How can we help you today?");
        System.out.println("************ Printing Service ************");
        System.out.println("1. Place Order");
        System.out.println("2. Exit");
        System.out.println("******************************************");
    }

    public static void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        //Fixme HAS PLACEHOLDER VALUES! THIS IS NOT SET IN STONE!
        // Collect order details from the client
        int quantity, sizeChoice, finishChoice = 1, timeChoice = 1;

        System.out.print("Enter the number of prints (1-100): ");
        quantity = scanner.nextInt();

        System.out.println("Choose size:");
        System.out.println("1. 4 x 6");
        System.out.println("2. 5 x 7");
        System.out.println("3. 8 x 10");
        System.out.print("Enter your choice: ");
        sizeChoice = scanner.nextInt();

        // Add prompts for finish and processing time choices

        // Call the method to calculate and display the order cost
        double orderCost = calculateOrderCost(quantity, sizeChoice, finishChoice, timeChoice);
        System.out.println("Total Cost: $" + orderCost);

        scanner.close();
    }

    public static double calculateOrderCost(int quantity, int sizeChoice, int finishChoice, int timeChoice)
    {
        //Fixme placeholder code to test the menu, the values are arbitrary
        double baseCost = 0.0;

        if (sizeChoice == 1) {
            baseCost = 0.14;
        } else if (sizeChoice == 2) {
            baseCost = 0.34;
        } else if (sizeChoice == 3) {
            baseCost = 0.68;
        }

        // Add logic for finish and time

        // Calculate the total cost
        double totalCost = baseCost * quantity;

        return totalCost;
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            print_service();

            System.out.print("Enter your choice (1-2): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    placeOrder();
                    break;
                case 2:
                    System.out.println("Exiting Printing Service. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }

        } while (choice != 2);

        scanner.close();
    }
}
