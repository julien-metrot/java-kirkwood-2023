package en.codegym.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Reading numbers
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        
        int sum = (x + y + z) / 3;
        System.out.println(sum);
    }
}
