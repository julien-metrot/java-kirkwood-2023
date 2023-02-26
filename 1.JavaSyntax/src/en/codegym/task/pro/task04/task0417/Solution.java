package en.codegym.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Wind speed
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double result = number * 3.6;
        System.out.println(Math.round(result));

    }
}