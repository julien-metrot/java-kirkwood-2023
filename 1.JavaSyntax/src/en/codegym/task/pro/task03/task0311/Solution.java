package en.codegym.task.pro.task03.task0311;

import java.util.Scanner;

/* 
High accuracy
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (Math.abs(num1 - num2) < 0.000001) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }
}
