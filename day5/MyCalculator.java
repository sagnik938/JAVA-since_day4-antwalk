package day5;

public class MyCalculator implements AdvancedArithmetic{

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        if( n>1000 ){
            return(-1);
        }
        for(int i=1;i<n;i++){
            if( n % i == 0 ){
                sum += i;
            }
        }
        return( sum + n );
    }
       
}
