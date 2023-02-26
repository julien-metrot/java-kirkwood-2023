package en.codegym.task.pro.task04.task0407;

/* 
Sum of numbers not divisible by 3
*/

public class Solution {
    public static void main(String[] args) {
        int numbers = 0;
        int sum = 0;
        while (numbers < 101) {
            numbers++;
            if (numbers % 3 == 0) {
                continue;
            }
            sum += numbers;
        }
        
        System.out.println(sum);
    }
}