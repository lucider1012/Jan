package day0215.test;

import java.util.Scanner;

public class Employee {
    String no, name, dept, job, sal;
    public Employee() {
    }

    public Employee(String no, String name, String dept, String job, String sal) {
        this.no = no;
        this.name = name;
        this.dept = dept;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", job='" + job + '\'' +
                ", sal='" + sal + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("A1892","이진선","AI개발부","사원","3500");
        employees[1] = new Employee("B8077","심용권","Web개발부","부장","7000");
        employees[2] = new Employee("F5691","신지영","총괄개발부","전무","9000");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        for (Employee employee : employees) {
            if (num.compareTo(employee.no) == 0) {
                System.out.println(employee.toString());
            }
        }
    }
}
