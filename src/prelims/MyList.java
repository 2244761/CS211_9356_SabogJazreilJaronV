package prelims;

/*
  Name: Sabog, Jazreil Jaron V.
  Date: September 18, 2024
  Class Code: 9356B CS 211L
  Individual Prelim Project
 */

import java.util.NoSuchElementException;

public interface MyList<E> {
    /**
     * Gets the size of the list
     * @return the size of the list
     */
    public int getSize();

    /**
     * Inserts an element into the list
     * @param data the element to insert
     * @throws ListOverflowException if the list is full (MyFixedSizeArrayList)
     */
    public void insert (E data) throws ListOverflowException;

    /**
     * Retrieves an element from the list based on its value
     * @param data the element to search for
     * @return the element if found, throws NoSuchElementException otherwise
     * @throws NoSuchElementException if the element is not found
     */
    public E getElement(E data) throws NoSuchElementException;

    /**
     * Deletes an element from the list
     * @param data the data to delete
     * @return true if the data was deleted, false otherwise
     */
    public boolean delete (E data); // returns false if the data is not deleted in the list

    /**
     * Searches for the data in the list
     * @param data the data to search for
     * @return the index of the element if found, -1 otherwise
     */
    public int search (E data); // returns index of data, else -1 is return
}
