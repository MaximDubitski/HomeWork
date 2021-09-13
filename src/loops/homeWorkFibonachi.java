package loops;

import java.util.Scanner;


public class homeWorkFibonachi {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько чисел Фибоначчи нужно вывести на экран?");
        int fib = scan.nextInt();
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        System.out.print(f1 + " " + f2 + " ");

        for (int i = 2; i < fib ; i++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;

        }
    }
}