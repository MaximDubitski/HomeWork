package loops;

import java.util.Scanner;


public class homeWorkObratnoe {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        int obr = 0;

        while (number > 0){
            obr = obr * 10 + number % 10;
            number = number/10;
        }
        System.out.println(obr);
    }
}