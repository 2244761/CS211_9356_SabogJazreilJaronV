package prelims;

/*
  Name: Sabog, Jazreil Jaron V.
  Date: September 18, 2024
  Class Code: 9356B CS 211L
  Individual Prelim Project
 */

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyFixedSizeArrayList<E> implements MyList<E> {
    /**
     * Current size of the list
     */
    private int size = 0;

    /**
     * Max Capacity of the internal array used to store the elements
     */
    private static final int MAX_CAPACITY = 5;

    /**
     * Internal array that stores the elements
     */
    private final E[] elements;

    /**
     * Default Constructor
     */
    @SuppressWarnings("unchecked")
    public MyFixedSizeArrayList() {
        elements = (E[]) new Object[MAX_CAPACITY];
    }

    /**
     * Get the size of the list
     * @return the size of the list
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Insert the specified data at the end of the list
     * @param data the data to insert
     * @throws ListOverflowException if elements exceed the max capacity
     */
    @Override
    public void insert(E data) throws ListOverflowException {
        if (size == elements.length) {
            throw new ListOverflowException("Max Size of the List is 5");
        }
        elements[size++] = data;
    }

    /**
     * Retrieves the element from the list that is equal to the provided data
     * @param data the element to search for
     * @return the element if found, throws NoSuchElementException otherwise
     * @throws NoSuchElementException if the element is not found in the list
     */
    @Override
    public E getElement(E data) throws NoSuchElementException {
        int index = search(data);

        if (index < 0) throw new NoSuchElementException("Element not found.");

        return elements[index];
    }

    /**
     * Deletes the first occurrence of the specified data from the list
     * @param data the data to delete
     * @return true if the element was found and deleted, false otherwise
     */
    @Override
    public boolean delete(E data) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(data)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                    elements[size - 1] = null;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    /**
     * Searches for the first occurrence of the specified data in the list
     * @param data the data to search for
     * @return the index of the element if found, -1 otherwise
     */
    @Override
    public int search(E data) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns a string representation of the list
     */
    @Override
    public String toString() {
        return "List: " + Arrays.stream(elements)
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
