package day5;

public class PG extends Student {
    String gradeCategory;

    public PG(String name, int[] marks) {
        super(name, marks);
    }

    public String getGradeCategory() {
        return gradeCategory;
    }

    public void setGradeCategory(String gradeCategory) {
        this.gradeCategory = gradeCategory;
    }

    @Override
    void genResult() {
        int marks[] = getMarks();
        int avg = 0;
        for( int mark : marks){
            avg += mark;
        }
        avg /= marks.length;
        if( avg > 60 ){
            setGradeCategory("Pass");
        }
        else{
            setGradeCategory("Fail");
        }
        super.setResult(this.gradeCategory);
    }
    
}
