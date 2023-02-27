package day0215.lang;

class Student{
    int studentId; //변수 생성
    String name; //문자열 변수 생성

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }//Student(int studentId, String name) 기본 생성자 생성
    //equals(): 객체가 가지고 있는 값이 같으면 같은 객체(true) 라고 오버라이딩 한다.

    @Override
    public boolean equals(Object obj) { //equals 메서드의 매개변수 오버라이딩
        if(obj instanceof Student){
            Student s2 = (Student) obj;
            if (studentId == s2.studentId) {
                return name.equals(s2.name);
            }
        }
        return false; //객체의 타입이 다르면 다른 객체
    }

    @Override
    public int hashCode() {
        return studentId+name.hashCode();
    }
}

public class EqualsTest2 {
    public static void main(String[] args) {
        Student s1 = new Student(123, "kim");
        Student s2 = new Student(123, "kim");

        System.out.println(s1.hashCode() == s2.hashCode());
        //System.out.println(s1.hashCode());
        //System.out.println(s2.hashCode());
        //System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s1.studentId+s1.name);
        //System.out.println(s2.studentId + s2.name);
        if (s1==s2) {
            System.out.println("같은 학생입니다.");
        }
        else {
            System.out.println("다른 학생입니다.");
        }
        if (s1.equals(s2)){
            System.out.println("같은 학생입니다.");
        }
        else {
            System.out.println("다른 학생입니다.");
        }
    }
}
