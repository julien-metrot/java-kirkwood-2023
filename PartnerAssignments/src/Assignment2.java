import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1
        // Driver: Julien
        // Navigator: Andres
        System.out.print("Enter a number: ");
        double input = scanner.nextDouble();
            if (!(input % 1 == 0)) {
                System.out.println(input + " is neither odd or even");
            } else if (input % 2 == 0) {
                System.out.println((int)input + " is an even number");
            } else if (!(input % 2 == 0)) {
                System.out.println((int)input + " is an odd number");
            }

        // Part 2
        // Driver: Andres
        // Navigator: Julien
        System.out.print("Enter s number of seconds: ");
        int seconds = scanner.nextInt();
        int days = seconds / (24 * 60 * 60);
        seconds = seconds % (24 * 60 * 60 );
        int hours = seconds / (60 * 60);
        seconds = seconds % (60 * 60 );
        int minutes = seconds / (60);
        seconds = seconds % (60);

        System.out.println("Days = " + days);
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + seconds);

    }
}