package day5;

public class TesterUG_PG_Student {
    public static void main(String[] args) {
        int[] marks_1 = {100,90,80,70};
        int[] marks_2 = {60,60,60,60};
        Student s1 = new UG("ABC",marks_1);
        Student s2 = new UG("DEF",marks_2);
        Student s3 = new PG("PQR",marks_1);
        Student s4 = new PG("XYZ",marks_2);

        s1.genResult();
        System.out.println(s1.getName() + " " + s1.getResult());
        s2.genResult();
        System.out.println(s2.getName() + " " + s2.getResult());
        s3.genResult();
        System.out.println(s3.getName() + " " + s3.getResult());
        s4.genResult();
        System.out.println(s4.getName() + " " + s4.getResult());
    }

}
