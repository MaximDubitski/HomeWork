package Arrays;

import java.util.Scanner;

public class ArraysDelElem {
    public static void main(String[] args) {
        int arr[] = {62,37,88,37,96,67,33,12};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Удаляемый диапазон [a, b]");
        System.out.println("Введите a ");
        int min = scanner.nextInt();
        System.out.println("Введите b ");
        int max = scanner.nextInt();
    }
}
