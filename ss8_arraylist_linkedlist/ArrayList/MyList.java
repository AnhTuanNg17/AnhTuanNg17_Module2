package ss8_arraylist_linkedlist.ArrayList;

import java.util.Arrays;

public class MyList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capicity){
        element = new Object[capicity];
    }
    private void ensureCapa(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element,newSize);
    }
    public void add(int index)



}
