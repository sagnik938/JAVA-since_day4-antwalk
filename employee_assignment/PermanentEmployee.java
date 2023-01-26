package employee_assignment;

public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public void calcMonthlySalary(){
        double salary , variableComponent = 0;
        if( this.experience >= 3 && this.experience <5){
            variableComponent = 0.05 * this.basicPay;
        }
        else if( this.experience >= 5 && this.experience <7){
                variableComponent = 0.07 * this.basicPay;
        }
        else if( this.experience >= 10){
            variableComponent = 0.12 * this.basicPay;
        }
        salary = this.basicPay + this.hra + variableComponent;
        super.setSalary(Math.round(salary));
    }
}
