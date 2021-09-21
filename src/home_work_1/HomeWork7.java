package operators1;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int n1 = scan.nextInt();
        char ch = (char) n1;

        if (n1 >= 65 && n1 <= 90 || n1 >= 97 && n1 <= 122) {
            System.out.println("Это английская буква : " + ch);
        } else {
            System.out.println("Не английская буква");
        }
    }
}