package en.codegym.task.pro.task04.task0405;

/* 
Unfilled rectangle
*/
// Done in class

public class Solution {
    public static void main(String[] args) {
        int height = 10;
        int width = 20;

        int i = 0;
        while(i < height) {
            int j = 0;
            while(j < width) {
                if(i == 0 || i == height - 1) {
                    System.out.print("B");
                } else {
                    if(j == 0 || j == width - 1) {
                        System.out.print("B");
                    }else {
                        System.out.print(" ");
                    }
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}