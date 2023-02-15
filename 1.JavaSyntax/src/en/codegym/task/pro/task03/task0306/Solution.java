package en.codegym.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Triangle
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }
    }
}
