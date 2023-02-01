package day9;

/*
 * FI-> abstract-> cube() 
 * default -> square(), add() 
 * static -> sub() mul() div() 
 * implement interface-> override abstract-> obj
 */
@FunctionalInterface
interface Calculator{
    int cube(int num);
    default int square(int num){
        return(num*num);
    }
    default int add(int a , int b){
        return(a+b);
    }
    static int sub(int a, int b){
        return(Math.abs((a-b)));
    }
    static int mul(int a, int b){
        return(a*b);
    }
    static double div(int a,int b){
        return( (double)a / (double)b );
    }
}

public class JavaAssgnTester implements Calculator {

    @Override
    public int cube(int num) {
        return (num*num*num);
    }

    public static void main(String[] args) {
        JavaAssgnTester j1 = new JavaAssgnTester();
        System.out.println( j1.cube(7) ); 
        System.out.println( j1.square(12) ); 
        System.out.println(j1.add(2, 4)); 

        System.out.println( Calculator.div(45, 7) ); 
        System.out.println( Calculator.mul(9, 2) );
        System.out.println( Calculator.sub(4, 7) ); 

    }
    
}
