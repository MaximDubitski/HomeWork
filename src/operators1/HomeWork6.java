package operators1;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста число");
        int n1 = scan.nextInt();
        char b = 1;
        char k = 2;

        System.out.println("Перевести в байты( введите 'b') или килобайты( введите 'k'): ");
        Scanner scanner = new Scanner(System.in);
        String c1 = scanner.nextLine();


        switch (n1) {
            case 1:
                System.out.println(n1 * 1024 + " байт");
                break;
            case 2:
                System.out.println(n1 / 1024 + " килобайт");
                break;

        }
    }
}
