public class CGBigInt {
    public static void main(String[] args) {
    int decimalNumber = 6;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
    String binaryNumber = "110";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
}

    public static String toBinary(int decimalNumber) {
        // https://stackoverflow.com/a/17284958
        return Integer.toBinaryString(decimalNumber);
//        String binaryStr = "";
//        while(decimalNumber > 0) {
//            int remainder = decimalNumber % 2;
//            binaryStr = remainder + binaryStr;
//            decimalNumber /= 2;
//        }
//        return binaryStr;
    }

    public static int toDecimal(String binaryNumber) {
        // https://stackoverflow.com/a/21797463
        return Integer.parseInt(binaryNumber, 2);
//        int decimalVal = 0;
//        int place = 1;
//        for(int i = binaryNumber.length() - 1; i >= 0; i--) {
//            char c = binaryNumber.charAt(i);
//            int val = Character.getNumericValue(c);
//            decimalVal += val * place;
//            place *= 2;
//        }
//        return decimalVal;
    }
}
