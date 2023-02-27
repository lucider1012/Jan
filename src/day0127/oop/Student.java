package day0127.oop;

public class Student {

    int sId;
    String name;
    int grade;
    String address;

    void showInfo(){
        System.out.printf("%d학년 %s 학생의 주소는 %s 입니다.\n", grade, name, address);
    }
}
