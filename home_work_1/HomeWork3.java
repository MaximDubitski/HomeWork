package operators1;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста три числа");
        System.out.println("Первое");
        int n1 = scan.nextInt();
        System.out.println("Второе");
        int n2 = scan.nextInt();
        System.out.println("Третье");
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 < n3) {
            System.out.println(n1);
            System.out.println("Среднее");
        } else if (n1 > n3 && n1 < n2) {
            System.out.println(n1);
            System.out.println("Среднее");
        } else if (n2 > n1 && n2 < n3) {
            System.out.println(n2);
            System.out.println("Среднее");
        } else if (n2 > n1 && n1 < n3) {
            System.out.println(n2);
            System.out.println("Среднее");
        } else if (n3 > n1 && n3 < n2) {
            System.out.println(n3);
            System.out.println("Среднее");
        } else if (n3 > n1 && n3 < n2) {
            System.out.println(n3);
            System.out.println("Среднее");
        } else if (n1 == n2 && n2 == n3) {
            System.out.println(n2);
            System.out.println("Среднее");
        }
    }
}