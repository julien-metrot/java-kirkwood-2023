package en.codegym.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Is the glass half empty or half full?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean bool = scanner.nextBoolean();
        if (bool) {
            System.out.println((int) Math.ceil(glass));
        } else {
            System.out.println((int) Math.floor(glass));
        }

    }
}