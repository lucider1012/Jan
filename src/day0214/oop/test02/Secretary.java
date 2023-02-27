package day0214.oop.test02;

public class Secretary extends Employee implements Bonus {
    public Secretary() {}
    public Secretary(String name, int number, String department, int salary) {
        super(name, number, department, salary);
    }
    public void incentive(int pay) {
        setSalary((int)(getSalary() + (pay * 0.8)));
    }
    public double tax() {
        return getSalary()*0.1 ;
    }
    public String toString() {
        return getName() + "\t\t" + getDepartment() + "\t\t" + getSalary()+"\t";
    }
}


