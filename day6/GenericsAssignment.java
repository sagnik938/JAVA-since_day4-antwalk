package day6;

import java.util.ArrayList;

import java.util.Iterator;

public class GenericsAssignment<T> {
    ArrayList<T> arr = new ArrayList<T>();

    public GenericsAssignment(ArrayList<T> arr) {
        this.arr = arr;
    }
    public void getArr(){
        Iterator<T> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        
    }
    // public void setArr(ArrayList<T> arr) {
    //     this.arr = arr;
    // }

    
}
