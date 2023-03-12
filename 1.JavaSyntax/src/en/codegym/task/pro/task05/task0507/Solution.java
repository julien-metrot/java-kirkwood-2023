package en.codegym.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Maximum of N numbers
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
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
    }
}
