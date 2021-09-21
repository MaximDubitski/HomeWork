package home_work_2.loops.txt;


import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double num = scanner.nextDouble();
        System.out.println("в какую степень возвести");
        int step = scanner.nextInt();

        double result = num;
        for (int i = 1; i < step; i++) {
            result *= num;
        }
        System.out.println(num + " ^ " + step + " = " + result);
    }
}
