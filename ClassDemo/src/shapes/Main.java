package shapes;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5);
        Rectangle rect = new Rectangle(2.25, 4.1);

        System.out.println(circle.getArea());
        System.out.println(rect.getArea());
    }
}
