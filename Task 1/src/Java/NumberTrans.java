package Java;

public class NumberTrans {

    public static String decimalToBinary(int num) {
        int b;
        String c = "";

        while (num != 0) {
            b = num % 2;
            c += b;
            num = num / 2;
        }
        return c;
    }

    public static String decimalToEight(int num) {
        int b;
        String c = "";

        while (num != 0) {
            b = num % 8;
            c += b;
            num = num / 8;
        }
        String c1;
        c1 = new StringBuilder(c).reverse().toString();
        return c1;
    }

    public static String decimalToHex(int num) {
        String symbols = "0123456789ABCDEF";

        if (num <= 0) return "0";

        int divider = 16;
        String result = "";

        while (num > 0) {
            int digit = num % divider;
            result = symbols.charAt(digit) + result;
            num /= divider;
        }

        return result;
    }
}
