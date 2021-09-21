package operators1;

public class HomeWorktxt1 {
    public static void main(String[] ar) {
        int x = 42; // 00101010
        int y = 15; // 00001111

        System.out.println("Операции с числами 42 и 15");

        System.out.println("Побитовый унарный оператор NOT x = " + ~x); // 11010101
        System.out.println("Побитовый унарный оператор NOT y = " + ~y); // 11110000

        System.out.println("Побитовый AND = " + (x & y)); // 00001010

        System.out.println("Побитовый OR = " + (x | y)); // 00101111

        System.out.println("Побитовый исключающее OR = " + (x ^ y)); // 00100101

        System.out.println("Сдвиг вправо = " + (x >> 2)); // 00001010
        System.out.println("Сдвиг вправо = " + (y >> 2)); // 00000011

        System.out.println("Сдвиг вправо с заполнением нулями = " + (x >>> 2)); // 00001010
        System.out.println("Сдвиг вправо с заполнением нулями = " + (y >>> 2)); // 00000011

        System.out.println("Сдвиг влево = " + (x << 2)); // 10101000
        System.out.println("Сдвиг влево = " + (y << 2)); // 00111100
        System.out.println("---");
        System.out.println("---");
        System.out.println("---");

        System.out.println("Операции с числами -42 и -15");
        int x1 = -42;
        int y1 = -15;

        System.out.println("Побитовый унарный оператор NOT x = " + ~x1); // 00101001
        System.out.println("Побитовый унарный оператор NOT y = " + ~y1); // 00001110

        System.out.println("Побитовый AND = " + (x1 & y1)); // 11010000

        System.out.println("Побитовый OR = " + (x1 | y1)); // 11110111

        System.out.println("Побитовый исключающее OR = " + (x1 ^ y1)); // 00100111

        System.out.println("Сдвиг вправо = " + (x1 >> 2)); // 11110101
        System.out.println("Сдвиг вправо = " + (y1 >> 2)); // 11111100

        System.out.println("Сдвиг вправо с заполнением нулями = " + (x1 >>> 2)); // 111111111111111111111111110101
        System.out.println("Сдвиг вправо с заполнением нулями = " + (y1 >>> 2)); // 111111111111111111111111111100

        System.out.println("Сдвиг влево = " + (x1 << 2)); // 1111111101011000
        System.out.println("Сдвиг влево = " + (y1 << 2)); // 11000100
    }
}

