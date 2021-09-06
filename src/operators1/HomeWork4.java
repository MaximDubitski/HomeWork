package operators1;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста два числа");
        System.out.println("Первое");
        int n1 = scan.nextInt();
        System.out.println("Второе");
        int n2 = scan.nextInt();

        if (n1 % n2 == 0) {
            System.out.println("Первое число нацело делится на второе");
        } else if (n1 % n2 != 0) {
            System.out.println("Первое число нацело не делится на второе");
            System.out.println("Остаток от деления : " + n1 % n2);
            System.out.println("Частное : " + n1 / n2);
        }
    }
}