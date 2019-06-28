package ex3;

import Introduce_array.MyAbstractList;

import java.util.Iterator;

public class MyArrayList<E> extends MyAbstractList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    // Creat default List
    public MyArrayList() {

    }

    //Creat list from array of object;
    public MyArrayList(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);

        }
    }

    //Creat new element at the specified index
    @Override
    public void add(int index, E e) {
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            // Move the element to the right after the specific index
            data[i + 1] = data[i];
            //Insert element to data[index]
            data[index] = e;
            size++;

        }

    }

    //Creat new large array, double the current size +1;
    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size + 1]);
            System.arraycopy(data, 0, newData, 0, size);
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }
        data[size-1] =null;
        size--;
        return e;
    }

    @Override
    public Object set(int index, E e) {
        return null;
    }

    @Override
    public int size() {
        return super.size();
    }

    // return true if this list contain element
    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])) ;


        }
        return false;
    }

    @Override
    public int indexOf(E e) {
        for (int i = 0; i <size ; i++) {
            if(e.equals(data[i])){
                return i;

            }
            
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        for (int i = size-1; i>=0 ; i++) {
            if(e.equals(data[i])) return i;
        }
        return -1;
    }

    @Override
    public void add(E e) {
        if (size == data.length) {
            ensureCapacity();
        }
        data[size++] = e;

    }

    // return the element at the specified index
    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index" + index + "out of bound ");

        }
    }

    // clear the List;
    @Override
    public void clear() {
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(",");

        }
        return result.toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new ArraysListIterator();
    }


    private class ArraysListIterator implements Iterator<E> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return (current < size);
        }

        @Override
        public E next() {
            return data[current++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(current);
        }
    }
}
