package operators1;

import java.util.Scanner;

public class HomeWork5{
    public static void main(String[] ar){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пожалуйста число");
        int n1 = scan.nextInt();
        System.out.println("Перевести в байты( введите '1') или килобайты( введите '2'): ");
        Scanner scanner = new Scanner(System.in);
        int n2 = scan.nextInt();

        switch (n2){
            case 1:
                System.out.println(n1 * 1024 + " байт");
                break;
            case 2:
                System.out.println(n1 / 1024 + " килобайт");
                break;
        }
    }
}
