import java.util.Scanner;

public class WedJan25 {
    public static void main(String[] args) {
        // Java Comment
        System.out.println("Hello"); // Another Comment
//        System.out.println();  ctrl + forward /
//        System.out.println();
//        System.out.println();

        /*
        * Longer
        * Java Comment
        * */

        String myFirstName = "Julien";
        char middleInitial = 'U';
        String myLastName = "Metrot";
        int myAge = 21;
        double myWeight = 150.5;
        boolean likesPizza = true;
        float currentTemp = 30;
        long reallyLongNumber = 999999999999999999L;
        int reallyLongInt = 999999999;
        int biggestInt = Integer.MAX_VALUE;
        int a = 7;
        int b = 2;
        System.out.println(a / b); // Python prints 3.5    Java prints 3
        System.out.println(a + b); // 9
        System.out.println(a - b); // 5
        System.out.println(a * b); // 14
        System.out.println(a % b); // 1
        int c = 3;
        System.out.println(a + b * c); // 13
        System.out.println((a + b) * c); // 27
        System.out.println(Math.min(a, b)); // 2

        String fName = "Julien";
        String lName = "Metrot";
        System.out.println(fName + lName);
        System.out.println(fName + " " + lName);
        System.out.println(fName + " " + lName + " is " + myAge + " years old.");
        System.out.printf("%s %s is %d years old.\n", fName, lName, myAge);

        int x = 2;
        double y = 1.1;
        System.out.println(x - y);
        System.out.printf("%.1f\n", x - y);

        int favNum;
        favNum = 34;

        double gallons;
        double liters;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter gallons: ");
        gallons = scanner.nextDouble();
        liters = gallons * 3.7854;
        System.out.printf("%f gallons is approximately %.2f liters\n", gallons, liters);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();
        weight = weight / 9.81 * 1.622;
        System.out.printf("You would way %.1f on the Moon", weight);
    }
}