package bubblesort;

import java.util.Arrays;

public class Bubble {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 4, 2};
        System.out.println("Before sorting (Integers): " + Arrays.toString(intArray));
        bubbleSort(intArray);
        System.out.println("After sorting (Integers): " + Arrays.toString(intArray));
        Double[] doubleArray = {5.5, 3.3, 8.8, 4.4, 2.2};
        System.out.println("\nBefore sorting (Doubles): " + Arrays.toString(doubleArray));
        bubbleSort(doubleArray);
        System.out.println("After sorting (Doubles): " + Arrays.toString(doubleArray));
        String[] stringArray = {"apple", "banana", "cherry", "date", "berry"};
        System.out.println("\nBefore sorting (Strings): " + Arrays.toString(stringArray));
        bubbleSort(stringArray);
        System.out.println("After sorting (Strings): " + Arrays.toString(stringArray));
    }
}
