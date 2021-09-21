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

        a = 5;
        b = 2;

        System.out.println("(5 + 2++) / --8 = " + ((a + b++) / --c));
        // b++ = 3, так же --c = 7

        a = 5;
        b = 2;
        c = 8;
        int d = 2;
        System.out.println("(5 * 2 >> 2++) / --8 = " + (a * b >> b++) / --d);
        //5*2=10, (10 >> 3) / 7 = 0;

        a = 5;
        b = 2;
        c = 8;
        d = 2;
        int e = 7;
        int f = 20;
        int g = 68;
        int h = 22;
        System.out.println("(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 = " + ((a + e > f ? g : h * b >> d++) / --c));
        // (12 > 20 ? 68 : 11 )/ 7 ; 11/7 = 1;


        System.out.println("(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 = " + ((a + e > f ? g : h * b >> d++) / --c));
        //  ошибка

        boolean result = 6 - 2 > 3 && 12 * 12 <= 119;
        // 6-2>3 true, 12*12 <=119 false, выводит false т.к оператор && выводит true, если значение слева и справа true

        boolean result1 = true && false;
        //false; оператор && выводит true, если значение слева и справа true

    }
}

