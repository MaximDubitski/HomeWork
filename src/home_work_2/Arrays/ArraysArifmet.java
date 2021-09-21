package Arrays;


public class ArraysArifmet {
    public static void main(String[] args) {
        int arr[] = {62,37,88,37,96,67,33,12};
        int summa = 0;

        for (int i = 0; i < arr.length; i++) {
                summa += arr[i];
        }
        System.out.println("Сумма элементов массива : " + summa);

        int avrg = summa/arr.length;
        System.out.println("Среднее арифметическое : " + avrg);
        System.out.print("Элементы меньше среднего арифметического : ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avrg){
                System.out.print(arr[i] + " ");
            }

        }
    }
}
