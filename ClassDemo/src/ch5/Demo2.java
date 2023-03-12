package ch5;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = 10;
        int width = 10;
        int i = 0;
        while(i < height) {
            int j = 0;
            while(j < width) {
                System.out.print("8");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
