package day6;

// public class GenericsDemo {
//     Object container;

//     public GenericsDemo(Object container) {
//         this.container = container;
//     }

//     public Object getContainer() {
//         return container;
//     }

//     public void setContainer(Object container) {
//         this.container = container;
//     }
    
// }
// //<T> is type specified at the time of initialisation...
public class GenericsDemo<T>{
    T container;

    public GenericsDemo(T container) {
        this.container = container;
    }

    public Object getContainer() {
        return container;
    }

    public void setContainer(T container) {
        this.container = container;
    }
    
}
