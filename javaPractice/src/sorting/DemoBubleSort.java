package sorting;

public class DemoBubleSort {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }


    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}