package ss8_arraylist_linkedlist.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capicity) {
        element = new Object[capicity];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public void add(int index, E e) {
        if (size == element.length) {
            ensureCapa();
        }
        if (index > size) {
            element[size++] = e;
        } else {
            element[size++] = element[size];
            for (int i = size + 1; i > index; i--) {
                element[i] = element[i + 1];
            }
            element[index] = e;
        }
    }

    public void remove(int index, E e) {
        for (int i = 0; i < index; i++) {
            element[i] = element[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    public boolean contains(E e) {
        for (int i = 0; i < element.length; i++) {
            if (element[i] == e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (element[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize;
        if (element.length < minCapacity) {
            newSize = minCapacity;
            element = Arrays.copyOf(element, newSize);
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index" + i + "Size" + i);
        }
        return (E) element[i];
    }

    public void clear() {
        while (size != 0) {
            remove(size);
        }
    }

    private void remove(int size) {
    }
    public void output(){
        for (int i = 0; i < size; i++){
            System.out.println("element" + i + ": " + element[i]);
        }
    }
}





