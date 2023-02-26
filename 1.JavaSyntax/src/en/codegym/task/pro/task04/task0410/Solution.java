package en.codegym.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        while ( scanner.hasNextInt()) {
            int input = scanner.nextInt();
            
            if (input < small) {
                secSmall = small;
                small = input;
            } else if (input > small && input < secSmall) {
                secSmall = input;
            }
        }
        if (secSmall == Integer.MAX_VALUE) {
            System.out.println();
        }
        System.out.println(secSmall);
    }
}