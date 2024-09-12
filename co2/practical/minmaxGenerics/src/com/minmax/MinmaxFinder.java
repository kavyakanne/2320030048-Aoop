package com.minmax;

public interface MinmaxFinder <T extends Comparable<T>> {
	 T findMin(T[] array);
	    T findMax(T[] array);

}
