package lab2;

import java.util.Arrays;
import java.util.AbstractList;

/**
 * This class implements some of the methods of the Java ArrayList class.
 * @author MorphiceGV
 * 
 */
public class MyArrayList<E> extends AbstractList<E> {
	// Data Fields
	/** The default initial capacity */
	private static final int INITIAL_CAPACITY = 10;
	/** The underlying data array */
	private E[] data;
	/** The current size */
	private int pos = 0;
	/** The current capacity */
	private int capacity = 0;

	/**
	 * Construct an empty ArrayList with the default initial capacity
	 */
	public MyArrayList() {
		capacity = INITIAL_CAPACITY;
		data = (E[]) new Object[capacity];
	}

	/**
	 * Allocate a new array to hold the directory
	 * 
	 */
	private void reallocate() {
		capacity = 2 * capacity;
		data = Arrays.copyOf(data, capacity);
	}

	/**
	 * Add an entry to the end of the list
	 * 
	 * @param anEntry - The anEntry to be inserted
	 * @return true/false - if the entry is inserted successfully at the end
	 */
	public boolean add(E anEntry) {
		if (pos == capacity) {
			reallocate();
		}
		data[pos] = anEntry;
		pos++;
		return true;
	}

	/**
	 * Get a value in the array based on its index.
	 * 
	 * @param index - The index of the item desired
	 * @return The contents of the array at that index
	 * @throws ArrayIndexOutOfBoundsException - if the index is negative or if it is
	 *                                        greater than or equal to the current
	 *                                        size
	 */
	public E get(int index) {
		if (index < 0 || index >= pos) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return data[index];
	}

	/**
	 * Set the value in the array based on its index.
	 * 
	 * @param index    - The index of the item desired
	 * @param newValue - The new value to store at this position
	 * @return The old value at this position
	 * @throws ArrayIndexOutOfBoundsException - if the index is negative or if it is
	 *                                        greater than or equal to the current
	 *                                        size
	 * @throws NullPointerException           - if newValue is null
	 */
	public E set(int index, E newValue) {
		if (index < 0 || index >= pos) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		if (newValue == null)
			throw new NullPointerException();

		E oldValue = data[index];
		data[index] = newValue;
		return oldValue;
	}

	/**
	 * Get the current size of the array
	 * 
	 * @return The current size of the array
	 */
	public int size() {
		return pos;
	}

	/**
	 * Returns the index of the first occurence of the specified element in this
	 * list, or -1 if this list does not contain the element
	 * 
	 * @param item The object to search for
	 * @returns The index of the first occurence of the specified item or -1 if this
	 *          list does not contain the element
	 */
	public int indexOf(Object item) {
		for (int i = 0; i < pos; i++) {
			if (data[i] == null && item == null) {
				return i;
			}
			if (data[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * ================================ The following functions need to be filled
	 * ===================================================
	 * 
	 */

	/**
	 * Add an entry to the data inserting it at the specified index.
	 * 
	 * @param index    - The index of the time that the new value it to be inserted
	 * @param newValue - The value to be inserted
	 * @throws ArrayIndexOUtOfBoundsException if index is less than zero or greater
	 *                                        than size
	 * @throws NullPointerException           if newValue is null TO DOOOOO
	 */
	public void add(int index, E newValue) {

		// checks index and capacity if within range

		if (index < 0 || index > pos) {
			throw new ArrayIndexOutOfBoundsException();

		}

		// checks if the newValue is invalid
		if (newValue == null) {
			throw new NullPointerException();

		}

	
		// if something is there then
		for (int i = pos - 1; i >= index; i--) {

			data[i + 1] = data[i];
		}

		data[index] = newValue;
		pos++;

		// if full create another
		if (pos == capacity) {
			reallocate();
		}

	}

	/**
	 * Construct an empty ArrayList with a specified initial capacity
	 * 
	 * @param capacity - The initial capacity
	 * @throws IllegalArgumentException - if the capacity is less 0 To do 2!
	 */
	public MyArrayList(int capacity) {

		
//if full then creates another 
//	

		if (capacity < 0) {
		throw new IllegalArgumentException();
	}
		capacity = INITIAL_CAPACITY;
//creates a new array 
	 data = (E[]) new Object[capacity];

	}

	/**
	 * Remove an entry based on its index
	 * 
	 * @param index - The index of the entry to be removed
	 * @return The Item removed
	 * @throws ArrayIndexOutOfBoundsException - if the index is negative or if it is
	 *                                        greater than or equal to the current
	 *                                        size
	 */
	public E remove(int index) {
		// checks if negative or greater than current size\
		if (index < 0 || index >= pos) {
		
			throw new ArrayIndexOutOfBoundsException();
		}
//remove item on specific index 
	E returnValue = data[index];
	for (int i = index + 1 ; i <pos; i++)
	{
		data[i-1] = data[i];
	}
		pos--;
		return returnValue; 
		
	} 

	/**
	 * Count the total number of elements equals to elem
	 * 
	 * @param theValue - the compared element
	 * @return the total number of replicas or -1 if not found in the list
	 */
	public int countApperance(E theValue) {
		
		int duplicates = 0 ;
		
	for (int i = 0; i < pos; i++)
	{
		
			if (data[i] == theValue)
			{
				duplicates++;
				
			}
			
		}
		 return duplicates; 
	}
		

	/**
	 * Remove all the duplicated elements equals to theValue
	 * 
	 * @param theValue - the duplicated element to be removed
	 */
	public void removeDuplicate(E theValue) {
		
		for (int i = 0 ; i < pos ; i++)
		{
			for (int j= i + 1 ; j < pos ; j++)
			{
				if(data[i]==data[j])
					
					remove (data[j]);
			}
			 
		}
		
		
	}

	/*
	 * ================================ The end of functions need to be filled
	 * ===================================================
	 * 
	 */
}