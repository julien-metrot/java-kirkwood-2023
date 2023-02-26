package en.codegym.task.pro.task04.task0414;

import java.util.Scanner;

/* 
There's never too much of a good thing
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number = scanner.nextInt();
        if (number <= 0 || number >= 5) {
            System.out.println(string);
        } else {
            do {
                System.out.println(string);
                number--;
            } while (number > 0);
        }
    }
}