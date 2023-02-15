package en.codegym.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Conscription
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", you've been drafted for military service";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age >= 18 && age <= 28) {
            System.out.println(name + militaryCommissar);
        }
    }
}
