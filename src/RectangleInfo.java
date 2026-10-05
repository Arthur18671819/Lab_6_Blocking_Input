import  java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
         Scanner  scanner = new Scanner(System.in);
          double length = 0;
          double width = 0;
          String trash = ""; // use for bad input, which will read as String
          boolean done = false;

          do {
                System.out.println("Please enter the length of the rectangle: ");
                if (scanner.hasNextDouble()) {
                 length = scanner.nextDouble();
                 done = true;
                } else {
                 trash = scanner.next(); // read the bad input
                 System.out.println(trash + " is invalid input. Please enter a valid number.");
                }
          } while (!done);

          done = false; // reset done for next input
          do {
                System.out.println("Please enter the width of the rectangle: ");
                if (scanner.hasNextDouble()) {
                 width = scanner.nextDouble();
                 done = true;
                } else {
                 trash = scanner.next(); // read the bad input
                 System.out.println(trash + " is invalid input. Please enter a valid number.");
                }
          } while (!done);

          double area = length * width;
          double perimeter = 2 * (length + width);
          System.out.printf("The area of the rectangle is: %.2f%n", area);
          System.out.printf("The perimeter of the rectangle is: %.2f%n", perimeter);
    }
}
