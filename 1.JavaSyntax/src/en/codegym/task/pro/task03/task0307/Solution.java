package en.codegym.task.pro.task03.task0307;

import java.util.Scanner;

/* 
To work or not to work? That is the question
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("You don't have to work");
        }
    }
}
