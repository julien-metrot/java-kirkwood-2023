package en.codegym.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Let's compare strings
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "";
        String str2 = "";
        str1 = scanner.nextLine();
        str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are different");
        }
    }
}
