package tasks.task14.GameDoubleList;

import java.util.Iterator;

public class DoubleIterator<E> implements Iterator<E> {
    private int index = 0;
    private E[] values;

    DoubleIterator(E[] values){
        this.values = values;
    }

    public boolean hasNext(){
        return index < values.length;
    }

    public E next(){
        return values[index++];
    }

}
