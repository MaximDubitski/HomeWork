package home_work_2.loops.txt;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {
        int[] container1 = arrayFromConsole();
        System.out.println(Arrays.toString(container1));
        int[] container2 = arrayRandom(5, 100);
        System.out.println(Arrays.toString(container2));
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

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(maxValueExclusion);
        }
        return arr;
    }
}
