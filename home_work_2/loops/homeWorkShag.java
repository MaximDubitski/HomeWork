package loops;

import java.util.Scanner;


public class homeWorkShag {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите min число");
        int min = scan.nextInt();
        System.out.println("Введите max число");
        int max = scan.nextInt();
        System.out.println("Введите шаг");
        int shag = scan.nextInt();

        for (int i = min; i < max; i += shag) {
            System.out.print(i + " ");
        }
    }
}