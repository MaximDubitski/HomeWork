package loops;

import java.util.Scanner;


public class homeWorkChetNechet {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scan.nextInt();
        int even = 0;
        int odd = 0;
         while (number > 0){
             if (number % 2 == 0){
                 even++;
             } else {
                 odd++;
             }
             number /= 10;
         }
        System.out.println("Четных "+ even+ "; Нечетных " + odd);
    }
}