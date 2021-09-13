package Arrays;


public class ArraysSumChetn {
    public static void main(String[] args) {
        int[] arr = {34,123,-22,-1,33,41,42,7};
        int summa = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) {
                summa += arr[i];
            }
        }
        System.out.println("Сумма четных элементов массива : " + summa);
    }
}