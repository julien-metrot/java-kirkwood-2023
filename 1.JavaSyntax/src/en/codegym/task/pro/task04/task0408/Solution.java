package en.codegym.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Maximum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while(scanner.hasNextInt()) {
            int userinput = scanner.nextInt();
            if (userinput % 2 == 0 && userinput > max) {
                max = userinput;
            }
        }
        System.out.println(max);
    }
}