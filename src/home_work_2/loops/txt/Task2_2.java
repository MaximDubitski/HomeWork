package home_work_2.loops.txt;


import java.util.Scanner;


public class Task2_2 {
    public static void main(String[] args) {
        int[] container1 = arrayFromConsole();
        allElements(container1);
        everySecond(container1);
        revers(container1);
    }

    public static void allElements(int[] container1){
        System.out.println("Вывести все элементы в консоль : ");
        for (int i = 0; i < container1.length; i++) {
            System.out.print(container1[i] + " ");
        }
        System.out.println();
    }

    public static void everySecond(int[] container1){
        System.out.println("Вывести каждый второй элемент массива в консоль : ");
        for (int i = 0; i < container1.length; i += 2) {
            System.out.print(container1[i] + " ");
        }
        System.out.println();
    }

    public static void revers(int[] container1){
        System.out.println("Вывести все элементы массива в консоль в обратном порядке : ");
        for (int i = container1.length - 1; i >= 0; i--) {
            System.out.print(container1[i] + " ");
        }
        System.out.println();
    }

    public static int[] arrayFromConsole(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число для ячейки " + i);
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}
