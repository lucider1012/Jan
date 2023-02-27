package day0210.oop;
abstract class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public abstract void print();

}
class Student extends Person{
    private int id;
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public void print() {
        System.out.println("이름: "+ getName()+" 나이: "+getAge()+" 학번: "+id);
    }
}
class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void print() {
        System.out.println("이름: "+ getName()+" 나이: "+getAge()+" 과목: "+subject);
    }
}
class Employee extends Person {
    private String dept;

    public Employee(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public void print() {
        System.out.println("이름: "+ getName()+" 나이: "+getAge()+" 부서: "+dept);
    }
}
public class School {
    public static void main(String[] args) {


        Person s = new Student("홍길동학생", 24, 25000);
        Person t = new Teacher("홍길동강사", 30, "자바");
        Person e = new Employee("김길동관리자", 40, "교무과");
        s.print();
        t.print();
        e.print();
    }
}
