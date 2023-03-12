package en.codegym.task.pro.task05.task0508.task0519;

import java.util.Arrays;

/* 
Is anyone there?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] array2 = Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
        int result = Arrays.binarySearch(array2, element);
        System.out.println(result >= 0);
    }
}
