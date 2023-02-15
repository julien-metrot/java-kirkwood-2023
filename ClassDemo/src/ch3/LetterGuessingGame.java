package ch3;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class LetterGuessingGame {
    public static char randomLetter() {
        int min = 65;
        int max = 90;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return (char) randomNum;
    }

    public static void main(String[] args) {
        char guess, answer = randomLetter();
        int numguesses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a letter: ");
        while (true) {
            guess = scanner.nextLine().charAt(0);
            boolean guessIsLowerCase = guess >= 97 && guess <= 122;
            if (guessIsLowerCase) {
                guess -= 32;
            }
            if (guess == answer || guess - 32 == answer) {
                System.out.println("Correct!");
                System.out.println("It took you " + numguesses + " times to guess the letter.");
                break;
            } else {
                System.out.println("Incorrect.");
                if (!(guess >= 65 && guess <= 90)) {
                    System.out.print("Invalid letter. Guess again: ");
                } else if (answer > guess) {
                    System.out.print("Guess higher: ");
                } else {
                    System.out.print("Guess lower: ");
                }
                numguesses++;
            }
        }

        int number1 = 5;
        while (true) {
            if (number1 <= 20) {
                System.out.print(number1);
                number1++;
            } else {
                break;
            }
        }

        int height = 10;
        int width = 20;

        int i = 0;
        while(i < height) {
            int j = 0;
            while(j < width) {
                if(i == 0 || i == height - 1) {
                    System.out.print("B");
                } else {
                    if(j == 0 || j == width - 1) {
                        System.out.print("B");
                    }else {
                        System.out.print(" ");
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
