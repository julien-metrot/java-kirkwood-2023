package en.codegym.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCola = scanner.nextInt();
        int numberOfPeople = scanner.nextInt();
        System.out.println(numberOfCola * 1.0 / numberOfPeople);

    }
}