package day5;

public abstract class Student {
    String name;
    int[] marks;
    String result;

    public Student(String name, int[] marks) {
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
    public void setResult(String res){
        this.result = res;
    }
    public String getResult(){
        return( this.result);
    }

    abstract void genResult();
}
