package loops.txt;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        if(scanner.hasNextLong()){
            long value = scanner.nextLong();
            long add = 1;
            long number = value;
            int partsCount = 0 ;

            do {
                number = number / 10;
                partsCount++;
            } while (number != 0);

            number = value;
            long[] parts = new long[partsCount];

            for (int i = parts.length - 1; i > -1; i--) {
                parts[i] = number % 10;
                number /= 10;
            }

            for (int i = 0; i < parts.length; i++) {
                System.out.print(parts[i]);
                if(i != parts.length - 1){
                    System.out.print(" * ");
                }
                add *= parts[i];
            }

            System.out.println(" = " + add);
            System.out.println("Вы ввели число " + value);
        } else if(scanner.hasNextDouble()){
            System.out.println("Введено не целое число");
        } else {
            System.out.println("Введено не число");
        }
    }
}
