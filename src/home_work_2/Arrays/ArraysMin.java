package Arrays;


public class ArraysMin {
    public static void main(String[] args) {
        int arr[] = {62,37,88,37,96,67,33,12};
        int min1 = arr[0];
        int min2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min1 >= arr[i]) {
                min1 = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (min2 >= arr[i] && arr[i] != min1){
                min2 = arr[i];
            }

        }
        System.out.println("Первый минимальный элемент : " + min1 + ", Второй минимальный элемент : " + min2);
    }
}
