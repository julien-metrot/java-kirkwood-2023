import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction();
        System.out.println(fraction1);
        Fraction fraction2 = new Fraction(27,6);
        System.out.println(fraction2.getNumerator());
        System.out.println(fraction2.getDenominator());
        fraction2.setNumerator(30);
        fraction2.setDenominator(45);
        System.out.println(fraction2);
        try{
            Fraction fraction3 = new Fraction(1,0);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        try{
            fraction2.setDenominator(0);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
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
        if (denominator == 0){
            throw new IllegalArgumentException("Cannot be zero");
        }
        this.denominator = denominator;
    }

    // methods
    public String toString(){
        return numerator + "/" + denominator;
    }
}
