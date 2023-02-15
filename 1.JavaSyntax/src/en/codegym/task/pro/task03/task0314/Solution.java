package en.codegym.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Broken keyboard
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase(secret)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
