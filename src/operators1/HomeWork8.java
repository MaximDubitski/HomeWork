package operators1;

import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год");
        int y1 = scan.nextInt();

        if (y1 % 4 != 0) {
            System.out.println("Обычный год");
        } else if (y1 % 100 == 0 & y1 % 400 != 0) {
            System.out.println("Обычной год");
        } else if (y1 % 4 == 0) {
            System.out.println("Високосный год");
        }
    }
}