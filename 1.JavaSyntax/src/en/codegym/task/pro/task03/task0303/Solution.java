package en.codegym.task.pro.task03.task0303;

import java.util.Scanner;

/* 
School or college
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
             if (age >= 6) {
                 System.out.println("Off to school with you, my child");
             }
        } else {
             System.out.println("Your college class starts soon");
        }
    }
}
