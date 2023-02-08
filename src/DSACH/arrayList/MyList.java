package DSACH.arrayList;

import java.util.Arrays;

public class MyList <E> {
    private int size=0;
    private static final int default_capacity=10;
    private Object elements[];
    public MyList(){
        elements=new Object[default_capacity];
    }
    private void ensureCapacity(){
        int newSize=elements.length*2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size==elements.length){
            ensureCapacity();
        }
        elements[size++]=e;
    }
    public E get(int i){
        if(i>=size|| i<0){throw new IndexOutOfBoundsException("index: " + i+", Size"+i);
        }
        return (E)elements[i];
    }
}
