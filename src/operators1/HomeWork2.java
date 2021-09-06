package operators1;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 100;


        int n1 = (int) (Math.random() * ((max - min) + min));
        System.out.println(n1);

        int n2 = (int) (Math.random() * ((max - min) + min));
        System.out.println(n2);


        if (n1 % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
        if (n2 % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
}