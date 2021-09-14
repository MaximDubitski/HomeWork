package Arrays;


public class ArraysDelElements {
    public static void main(String[] args) {
        int arr[] = {12,104,81};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            while (arr[i] > 0) {
                sum += arr[i] % 10;
                arr[i] /= 10;
            }
            arr[i] = elem;
        }

        System.out.println("Сумма чисел массива = " + sum);
    }
}
