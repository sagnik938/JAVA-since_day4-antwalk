package day4;

public class TesterAvgCalculator {
   public static void main(String[] args) {
        AvgCalculator avg = new AvgCalculator();
        System.out.format( "%.2f\n" , avg.calcAvg(1, 2, 3) );
        System.out.format( "%.2f\n" , avg.calcAvg(100, 2, 34 , 45) );
        System.out.format( "%.2f\n" , avg.calcAvg(1, 2, 3 ,4,5) );
   }
}
