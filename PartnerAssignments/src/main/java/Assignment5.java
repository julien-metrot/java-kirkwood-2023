import java.math.BigInteger;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.nio.file.spi.FileTypeDetector;

public class Assignment5 {
    /*
Part 1A
    //Create a new class called Fraction
    //Create two int instance variables, called numerator and denominator.
    //Create a default constructor that assigns 1 to both the numerator and denominator.
    //Create a toString method that returns a string representation of the fraction in the format "numerator/denominator"

Part 1B
//In the Assignment4 class, instantiate a new Fraction object called "fraction1" using the default constructor.
//Print the Fraction object. When you run the code it should print "1/1"
     */
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        System.out.println(fraction1);
        Fraction fraction2 = new Fraction(27, 6);
        System.out.println(fraction2.getNumerator());
        System.out.println(fraction2.getDenominator());
        fraction2.setNumerator(30);
        fraction2.setDenominator(45);
        System.out.println(fraction2);
        try {
            Fraction fraction3 = new Fraction(1, 0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            fraction2.setDenominator(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(Fraction.greatestCommonDivisor(75, 45));
        System.out.println(Fraction.greatestCommonDivisor(2, 4));
        System.out.println(Fraction.greatestCommonDivisor(5, 7));

        Fraction fraction4 = new Fraction(75, 45);
        System.out.println(fraction4.simplify());
        Fraction fraction5 = new Fraction(2, 4);
        System.out.println(fraction5.simplify());
        Fraction fraction6 = new Fraction(5, 7);
        System.out.println(fraction6.simplify());
        Fraction fraction7 = new Fraction(-2, 4);
        System.out.println(fraction7.simplify());
        Fraction fraction8 = new Fraction(2, -4);
        System.out.println(fraction8.simplify());
        Fraction fraction9 = new Fraction(-2, -4);
        System.out.println(fraction9.simplify());

        System.out.println("Part 6");
        Fraction fraction10 = new Fraction(4, 1);
        System.out.println(fraction10.mixedNumber());
        Fraction fraction11 = new Fraction(0, 4);
        System.out.println(fraction11.mixedNumber());
        Fraction fraction12 = new Fraction(4, 4);
        System.out.println(fraction12.mixedNumber());
        Fraction fraction13 = new Fraction(8, 4);
        System.out.println(fraction13.mixedNumber());
        Fraction fraction14 = new Fraction(4, 8);
        System.out.println(fraction14.mixedNumber());
        Fraction fraction15 = new Fraction(13, 5);
        System.out.println(fraction15.mixedNumber());
        Fraction fraction16 = new Fraction(-13, 5);
        System.out.println(fraction16.mixedNumber());
        Fraction fraction17 = new Fraction(13, -5);
        System.out.println(fraction17.mixedNumber());
        Fraction fraction18 = new Fraction(-13, -5);
        System.out.println(fraction18.mixedNumber());
        Fraction fraction19 = new Fraction(-4, -5);
        System.out.println(fraction19.mixedNumber());


        Fraction fraction20 = new Fraction(13, 5);
        Fraction fraction21 = new Fraction(4, 8);
        System.out.println(fraction20.add(fraction21));

        Fraction fraction22 = new Fraction(-13, -5);
        Fraction fraction23 = new Fraction(13, -5);
        System.out.println(fraction22.add(fraction23));

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Enter a numerator: ");
            int num1 = scanner.nextInt();
            System.out.println();
            System.out.print("Enter a denominator: ");
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                throw new RuntimeException("Cannot use zero");
            }
            System.out.println();


            System.out.print("Enter a numerator: ");
            int num3 = scanner.nextInt();
            System.out.println();
            System.out.print("Enter a denominator: ");
            int num4 = scanner.nextInt();
            if (num4 == 0) {
                throw new RuntimeException("Cannot use zero");
            }
            System.out.println();
            /*
            Fraction frac1 = new Fraction(num1, num2);
            Fraction frac2 = new Fraction(num3, num4);
            System.out.println(frac1.add(frac2));
             */
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

class Fraction {
    //properties or instance variables
    private int numerator;
    private int denominator;


    //constructor
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    // getter and setters
    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Cannot be zero");
        }
        this.denominator = denominator;
    }


    // methods
    public static int greatestCommonDivisor(int num1, int num2) {
        BigInteger b1 = BigInteger.valueOf(num1);
        BigInteger b2 = BigInteger.valueOf(num2);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }

    public Fraction simplify() {
        Fraction simplifiedFraction = new Fraction(getNumerator(), getDenominator());
        if (getDenominator() < 0 | getNumerator() < 0) {
            simplifiedFraction.setNumerator(simplifiedFraction.getNumerator() * -1);
            simplifiedFraction.setDenominator(simplifiedFraction.getDenominator() * -1);
        }
        int gcd = greatestCommonDivisor(simplifiedFraction.getNumerator(), simplifiedFraction.getDenominator());
        simplifiedFraction.setNumerator(simplifiedFraction.getNumerator() / gcd);
        simplifiedFraction.setDenominator(simplifiedFraction.getDenominator() / gcd);
        return simplifiedFraction;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public String mixedNumber() {
        String simplifiedFraction = "";
        Fraction fraction = simplify();
        if (fraction.getDenominator() == 1) {
            simplifiedFraction = fraction.getNumerator() + "";
        } else if (fraction.getNumerator() == 1) {
            simplifiedFraction = fraction.toString();
        } else if (fraction.getNumerator() == 0) {
            simplifiedFraction = 0 + "";
        } else if (Math.abs(fraction.getNumerator()) < Math.abs(fraction.getDenominator())) {
            simplifiedFraction = fraction.getNumerator() + "/" + fraction.getDenominator();
        } else if ((fraction.getNumerator() > fraction.getDenominator() || fraction.getNumerator() < fraction.getDenominator()) && (fraction.getNumerator() < 0 || fraction.getDenominator() < 0) && Math.abs(getNumerator()) > Math.abs(fraction.getDenominator())) {
            simplifiedFraction = (fraction.getNumerator() / fraction.getDenominator()) + " " + (Math.abs(fraction.getNumerator()) % fraction.getDenominator()) + "/" + Math.abs(fraction.getDenominator());
        } else if (fraction.getNumerator() > fraction.getDenominator()) {
            simplifiedFraction = (fraction.getNumerator() / fraction.getDenominator()) + " " + (fraction.getNumerator() % fraction.getDenominator()) + "/" + (fraction.getDenominator());
        }
        return simplifiedFraction;
    }


    public String add(Fraction fraction) {
        Fraction currentFraction = new Fraction(getNumerator(), getDenominator());
        Fraction newFraction = new Fraction(fraction.getNumerator() * currentFraction.getDenominator(), fraction.getDenominator() * currentFraction.getDenominator());
        Fraction newFraction2 = new Fraction(currentFraction.getNumerator() * fraction.getDenominator(), currentFraction.getDenominator() * fraction.getDenominator());
        Fraction finalFraction = new Fraction(newFraction.getNumerator() + newFraction2.getNumerator(), newFraction2.getDenominator());
        return finalFraction.mixedNumber();
    }


}
