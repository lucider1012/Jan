package day0214.oop.test02;

public class Company {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];
        employees[0]= new Secretary("Hilery", 1, "secretary", 800);
        //Secretary sc = new Secretary()
        //employees[0] = sc;
        employees[1]= new Sales("Clinten", 2, "sales", 1200);
        //Sales sl = new Sales();
        //employees[1] = sl;
        System.out.println
                ("name\t\tdepartment\t\tsalary");
        System.out.println
                ("----------------------------------");
        for (Employee employee : employees) {
            System.out.println
                    (employee);
        }
        //sc.incentive(100);
        //sl.incentive(100);
        System.out.println
                ("\n인센티브 " + 100+ " 지급");
        System.out.println
                ("\nname\t\tdepartment\t\tsalary\t\ttax");
        System.out.println
                ("----------------------------------------------");
        for (Employee employee : employees) {
            if(employee instanceof Secretary){
                Secretary s = (Secretary) employee;
                s.incentive(100);
            }
            if(employee instanceof Sales){
                Sales s = (Sales) employee;
                s.incentive(100);
            }
            System.out.println
                    (employee+"\t\t" +employee.tax());
        }
    }
}
