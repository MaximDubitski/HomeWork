package operators1;

import java.util.Scanner;

public class HomeWorktxt7 {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста имя");
        String name = scan.nextLine();

        switch (name){
            case "Вася":
                    System.out.println("Привет!");
                    System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                    System.out.println("Я тебя так долго ждал");
                break;

                default:
                    System.out.println("Добрый день, а вы кто?");
        }
    }
}
