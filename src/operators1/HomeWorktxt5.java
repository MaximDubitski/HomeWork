package operators1;

import java.util.Objects;
import java.util.Scanner;

public class HomeWorktxt5 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста имя");
        String name = scan.nextLine();

        if (Objects.equals(name, "Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            return;
        }
         if (Objects.equals(name, "Анастасия")){
            System.out.println("Я тебя так долго ждал");
            return;
        }
            System.out.println("Добрый день, а вы кто?");
    }
}
