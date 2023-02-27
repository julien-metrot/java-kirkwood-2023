package ch3;

public class Demo {
    public static void main(String[] args) {
        int i = 21;
        int sub = 0;
        while (i > 0) {
            i -= sub;
            sub++;
            System.out.println(i);
        }
    }
}
