import  java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double milesDriven = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        String trash = ""; // use for bad input, which will read as String
        boolean done = false;

        do {
            System.out.println("Please enter the number of miles driven: ");
            if (scanner.hasNextDouble()) {
                milesDriven = scanner.nextDouble();
                done = true;
            } else {
                trash = scanner.next(); // read the bad input
                System.out.println(trash + " is invalid input. Please enter a valid number.");
            }
        } while (!done);

        done = false; // reset done for next input
        do {
            System.out.println("Please enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                milesPerGallon = scanner.nextDouble();
                done = true;
            } else {
                trash = scanner.next(); // read the bad input
                System.out.println(trash + " is invalid input. Please enter a valid number.");
            }
        } while (!done);

        done = false; // reset done for next input
        do {
            System.out.println("Please enter the price of fuel per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                done = true;
            } else {
                trash = scanner.next(); // read the bad input
                System.out.println(trash + " is invalid input. Please enter a valid number.");
            }
        } while (!done);

        double totalCost = (milesDriven / milesPerGallon) * pricePerGallon;
        System.out.printf("The total cost of fuel for your trip is: $%.2f%n", totalCost);
    }
}
