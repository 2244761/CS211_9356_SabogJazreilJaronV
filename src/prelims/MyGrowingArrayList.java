package prelims;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class MyGrowingArrayList<E> implements MyList<E> {
    protected int size = 0;
    private static final int Initial_Capacity = 5;
    private E[] elements;
    private E[] temp;

    @SuppressWarnings("unchecked")
    public MyGrowingArrayList() {
        elements = (E[]) new Object[Initial_Capacity];
        temp = (E[]) new Object[elements.length];
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insert(E data) {
        if (size == elements.length) {
            growList();
        }
        elements[size++] = data;
    }

    @Override
    public E getElement(E data) throws NoSuchElementException {
        int index = search(data);

        if (index < 0) throw new NoSuchElementException("Element not found.");

        return elements[index];
    }

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

    @Override
    public int search(E data) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    public void growList() {
        // Store the values
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }

        elements = (E[]) new Object[Initial_Capacity * 2];

        for (int i = 0; i < temp.length; i++) {
            elements[i] = temp[i];
        }
    }

    @Override
    public String toString() {
        return "List: " + Arrays.stream(elements)
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
