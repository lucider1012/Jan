package day0214.oop.test02;

public class Sales extends Employee implements Bonus{
    public Sales() {}
    public Sales(String name, int number, String department, int salary) {
        super(name, number, department, salary);
    }
    @Override
    public void incentive(int pay) {
        setSalary((int) (getSalary() +(pay * 1.2)));
    }
    @Override
    public double tax() {
        return getSalary()*0.13;
    }

    @Override
    public String toString() {
        return getName() + "\t\t" + getDepartment() + "\t\t\t" + getSalary();
    }
}

