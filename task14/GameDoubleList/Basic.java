package tasks.task14.GameDoubleList;

public class Basic<E> implements DoubleList<E> {

    private E[] values;

    public Basic() {
        values = (E[]) new Object[0];
    }

    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index+1, values, index, amountElemAfterIndex);
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    public E get(int index) {
        return values[index];
    }

    public int size() {
        return values.length;
    }

    public void update(int index, E e) {
        values[index] = e;
    }

    public java.util.Iterator iterator() {
        return new DoubleIterator<>(values);
    }
}
