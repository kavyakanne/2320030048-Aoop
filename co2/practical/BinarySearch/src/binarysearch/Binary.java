package binarysearch;

public class Binary <T extends Comparable<T>>{
	public int binarySearch(T[] array, T key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midValue = array[mid];

            if (midValue.compareTo(key) < 0) {
                low = mid + 1;
            } else if (midValue.compareTo(key) > 0) {
                high = mid - 1;
            } 
            else {
                return mid; 
            }
        }
        return -1;
	}
	  public static void main(String[] args) {
	        
	        Binary<Integer> intSearch = new Binary<>();
	        Integer[] intArray = {1, 3, 5, 7, 9, 11};
	        System.out.println("Integer search result: " + intSearch.binarySearch(intArray, 7));

	        Binary<Double> doubleSearch = new Binary<>();
	        Double[] doubleArray = {1.1, 3.3, 5.5, 7.7, 9.9};
	        System.out.println("Double search result: " + doubleSearch.binarySearch(doubleArray, 5.5));

	        Binary<String> stringSearch = new Binary<>();
	        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};
	        System.out.println("String search result: " + stringSearch.binarySearch(stringArray, "cherry"));
	    }
}


