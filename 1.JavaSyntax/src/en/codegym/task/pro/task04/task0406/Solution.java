package en.codegym.task.pro.task04.task0406;

import java.util.Scanner;

/* 
We show what we get
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           String input = scanner.nextLine();
           if (input.equals("enough")) {
               break;
           }
           System.out.println(input);
        }

    }
}