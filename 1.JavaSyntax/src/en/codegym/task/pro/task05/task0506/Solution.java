package en.codegym.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Minimum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }
}
