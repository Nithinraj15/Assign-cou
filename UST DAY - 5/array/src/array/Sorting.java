package array;
import java.util.Arrays;
public class Sorting {
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] bubbleSortData1 = {5, 1, 4, 2, 8};
        System.out.println("Original array (Bubble Sort): " + Arrays.toString(bubbleSortData1));
        bubbleSort(bubbleSortData1);
        System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(bubbleSortData1));
        int[] bubbleSortData2 = {3, 9, 1, 7, 4};
        System.out.println("Original array (Bubble Sort): " + Arrays.toString(bubbleSortData2));
        bubbleSort(bubbleSortData2);
        System.out.println("Sorted array (Bubble Sort): " + Arrays.toString(bubbleSortData2));
        int[] selectionSortData1 = {64, 25, 12, 22, 11};
        System.out.println("Original array (Selection Sort): " + Arrays.toString(selectionSortData1));
        selectionSort(selectionSortData1);
        System.out.println("Sorted array (Selection Sort): " + Arrays.toString(selectionSortData1));

        int[] selectionSortData2 = {10, 30, 20, 50, 40};
        System.out.println("Original array (Selection Sort): " + Arrays.toString(selectionSortData2));
        selectionSort(selectionSortData2);
        System.out.println("Sorted array (Selection Sort): " + Arrays.toString(selectionSortData2));
    }
}
