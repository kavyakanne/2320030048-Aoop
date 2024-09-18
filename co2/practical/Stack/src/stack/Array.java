package stack;

public class Array <T> implements Stack<T>{
	 private T[] array;
	    private int size;
	    private int capacity;
	    
	    @SuppressWarnings("unchecked")
	    public Array() {
	        capacity = 10;
	        array = (T[]) new Object[capacity];
	        size = 0;
	    }
	    public void push(T item) {
	        if (size == capacity) {
	            resize();
	        }
	        array[size++] = item;
	    }
	    public T pop() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }
	        T item = array[--size];
	        array[size] = null; 
	        return item;
	    }
	    public T peek() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }
	        return array[size - 1];
	    }
	    public boolean isEmpty() {
	        return size == 0;
	    }
	    @SuppressWarnings("unchecked")
	    private void resize() {
	        capacity *= 2;
	        T[] newArray = (T[]) new Object[capacity]; 
	        System.arraycopy(array, 0, newArray, 0, size); 
	        array = newArray; 
	    }

}
