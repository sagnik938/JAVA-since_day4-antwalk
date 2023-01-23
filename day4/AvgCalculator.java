package day4;

public class AvgCalculator {
    public double calcAvg(double a , double b , double c){
        return( (a+b+c)/3 );
    }
    public double calcAvg(double a , double b , double c , double x ){
        return( (a+b+c+x)/4 );
    }
    public double calcAvg(double a , double b , double c , double x ,double y){
        return( (a+b+c+x+y)/3 );
    }
}
