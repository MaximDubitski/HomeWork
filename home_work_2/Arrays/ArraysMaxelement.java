package Arrays;


public class ArraysMaxelement {
    public static void main(String[] args) {
        int arr[] = {62,37,88,37,96,67,33,12};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Максимальный элемент с четным индексом : " + max);
    }
}
