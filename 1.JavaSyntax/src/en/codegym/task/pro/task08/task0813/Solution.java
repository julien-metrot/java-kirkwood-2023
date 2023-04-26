package en.codegym.task.pro.task08.task0813;

/* 
Power of two
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(6));
    }

    public static int getPowerOfTwo(int power) {
        return power >= 0 ? 1 << power : 1 >> -power;
    }
}
