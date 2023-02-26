package en.codegym.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Area of a circle
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = 3.14 * Math.pow(radius, 2);
        System.out.println((int)area);

    }
}