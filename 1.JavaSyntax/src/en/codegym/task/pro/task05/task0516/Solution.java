package en.codegym.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Filling an array
*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int largePart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, largePart, valueStart);
        Arrays.fill(array, largePart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
