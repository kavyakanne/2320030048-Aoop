package com.minmax;

public class GenericApp {


	    public static void main(String[] args) {
	
	        Integer[] intArray = {39, 6, 2, 3, 1, 7};
	        Genericminmax<Integer> intMinMax = new Genericminmax<>();
	        System.out.println("Integer Array:");
	        System.out.println("Min: " + intMinMax.findMin(intArray));
	        System.out.println("Max: " + intMinMax.findMax(intArray));

	        String[] strArray = {"mango", "dragonfruit", "kiwi", "apple"};
	        Genericminmax<String> strMinMax = new Genericminmax<>();
	        System.out.println("\nString Array:");
	        System.out.println("Min: " + strMinMax.findMin(strArray));
	        System.out.println("Max: " + strMinMax.findMax(strArray));

	     
	        Character[] charArray = {'y', 'z', 'a', 'b'};
	        Genericminmax<Character> charMinMax = new Genericminmax<>();
	        System.out.println("\nCharacter Array:");
	        System.out.println("Min: " + charMinMax.findMin(charArray));
	        System.out.println("Max: " + charMinMax.findMax(charArray));


	        Float[] floatArray = {3.5f, 5.2f, 2.8f, 7.9f, 1.4f, 9.6f};
	        Genericminmax<Float> floatMinMax = new Genericminmax<>();
	        System.out.println("\nFloat Array:");
	        System.out.println("Min: " + floatMinMax.findMin(floatArray));
	        System.out.println("Max: " + floatMinMax.findMax(floatArray));
	    }
	}



