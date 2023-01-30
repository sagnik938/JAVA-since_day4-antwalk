package GenericsAssgn;

import java.util.ArrayList;

import java.util.Iterator;

public class ImplementorClass<T> {
    ArrayList<T> arr = new ArrayList<T>();

    public ImplementorClass(ArrayList<T> arr) {
        this.arr = arr;
    }

    public void getArr() {
        Iterator<T> itr = arr.iterator();
        while( itr.hasNext() ){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }

    public void setArr(ArrayList<T> arr) {
        this.arr = arr;
    }
    
}
