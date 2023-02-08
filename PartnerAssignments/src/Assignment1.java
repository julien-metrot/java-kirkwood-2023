import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Part 1
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Largest: " + Math.max(num1, num2));

        //Part 2
        System.out.print("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be greater than 0");
        } else {
            double circumference = 2 * Math.PI * radius;
            double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("%.2f\n", circumference);
            System.out.printf("%.2f", area);
        }
    }
}