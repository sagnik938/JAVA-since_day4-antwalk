package day5;

public class TesterStudentEx {
    public static void main(String[] args) {
        int marks[] = {90,70,800};
        StudentEx s = new StudentEx("ABC", marks);
        try {
            s.calcAvg();
        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println(s.getAvg());
    }
}
