package en.codegym.task.pro.task03.task0305;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        } else if (num1 == num2) {
            System.out.println(num1 + " " + num2);
        } else if (num1 == num3) {
            System.out.println(num1 + " " + num3);
        } else if (num2 == num3) {
            System.out.println(num2 + " " + num3);
        }
    }
}
