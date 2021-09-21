package loops.txt;

import java.util.Scanner;

public class Task111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        long number = scanner.nextInt();
        long result = 1;
        for (int i = 1; i < number + 1; i++) {
            result *= i;
        }

        System.out.println("Факториал числа " + number + " = " + result);
    }
}
