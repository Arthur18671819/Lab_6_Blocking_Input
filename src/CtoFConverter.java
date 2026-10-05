import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = ""; // use for bad input, which will read as String
        boolean done = false;

        do {
            System.out.println("Please enter the temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                done = true;
            } else {
                trash = scanner.next(); // read the bad input
                System.out.println(trash + " is invalid input. Please enter a valid number.");
            }
        } while (!done);
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}
