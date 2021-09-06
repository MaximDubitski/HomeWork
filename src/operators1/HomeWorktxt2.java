package operators1;

public class HomeWorktxt2 {
    public static void main(String[] ar) {
        int a = 5;
        int b = 2;
        int c = 8;

        System.out.println("5 + 2 / 8 = " + (a + b / c));
        //   2 / 8 = 0; т.к. int целое число и выводится без остатка

        System.out.println("(5 + 2) / 8) = " + ((a + b) / c));
        // выполняется сложение т.к. приоритет скобки

        System.out.println("(5 + 2) / 8 = " + ((a + b++) / c));
        // b = 2, b++ = 3

        System.out.println("(5 + 2++) / --8 = " + ((a + b++) / --c));
        // b++ = 3, так же --c = 7

        int d = 2;
        System.out.println("(5 * 2 >> 2++) / --8 = " + (a * b >> --d));
        //

        int e = 7;
        int f = 20;
        int g = 68;
        int h = 22;
        System.out.println("(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + ((a + e > f ? g : h * b >> d++) / --c));
        // d++ = 3 и --c = 7;

        System.out.println("(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 = " + ((a + e > f ? g : h * b >> d++) / --c));
        // d++ = 3 и --c = 7; 1-

    }
}

