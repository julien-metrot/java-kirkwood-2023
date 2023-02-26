package en.codegym.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Everyone wants to be loved
*/

public class Solution {
    public static void main(String[] args) {
        String text = " loves me.";
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (i < 10) {
            System.out.println(name + text);
            i++;
        }

    }
}
