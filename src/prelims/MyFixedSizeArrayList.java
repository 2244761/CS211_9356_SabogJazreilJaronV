package prelims;

import java.util.NoSuchElementException;

public class MyFixedSizeArrayList implements MyList {

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void insert(Object data) throws ListOverflowException {

    }

    @Override
    public Object getElement(Object data) throws NoSuchElementException {
        return null;
    }

    @Override
    public boolean delete(Object data) {
        return false;
    }

    @Override
    public int search(Object data) {
        return 0;
    }
}
