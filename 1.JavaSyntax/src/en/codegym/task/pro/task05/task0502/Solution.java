package en.codegym.task.pro.task05.task0502;

/* 
Even and odd cells of an array
*/

public class Solution {
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        //write your code here
        for(int count = 0; count < strings.length; count++) {
            if(count % 2 == 0) {
                strings[count] = EVEN;
            } else {
                strings[count] = ODD;
            }
        }

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }
}
