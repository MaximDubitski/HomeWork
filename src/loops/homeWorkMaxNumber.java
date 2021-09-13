package loops;

        import java.util.Scanner;

public class homeWorkMaxNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int max = 0;

        while (number > 0) {
            if (number % 10 > max) max = (int) (number % 10);
            number /= 10;
        }
        System.out.println("Наибольшая цифра : " + max);
    }
}
