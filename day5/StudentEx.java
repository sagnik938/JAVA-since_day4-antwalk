package day5;

class NegativeMarksException extends Exception{

    public NegativeMarksException(String message) {
        super(message);
    }
    
}

public class StudentEx {
    String name;
    int[] marks;
    float avg;
    public StudentEx(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public float getAvg() {
        return avg;
    }
    public void setAvg(float avg) {
        this.avg = avg;
    }

    public void calcAvg() throws Exception{
        int sum = 0,totalSub =0;
        try{
            try{

                for(int i = 0 ; i < this.marks.length ; i++ ){
                    if( marks[i] < 0 || marks[i] >100){
                        throw new NegativeMarksException("Invalid Marks");
                    }
                    sum += this.marks[i];
                    // ++totalSub;
                }
                this.avg = sum/totalSub;
            }

            catch(ArithmeticException e){
                System.out.println("Divide by 0 exception");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of reach");
        }
         catch(Exception e){
            System.out.println(e);
        }
    }
}
