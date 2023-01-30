public class MonJan30 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String output = "";
            if (i % 3 == 0) {
                output += "Fizz";
            }
            if (i % 5 == 0) {
                output += "Buzz";
            }
            if (output.equals("")) {
                output += i;
            }
            System.out.println(output);
        }


        int numCount = 0;
        for (int x = 1; x <= 100; x++) {
            System.out.print(x + " ");
            numCount++;
            if (numCount == 10) {
                System.out.println();
                numCount = 0;
            }
        }
    }
}