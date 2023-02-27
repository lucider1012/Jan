package day0209.oop;

abstract class Animal12{
    abstract void move();//조금씩 다르게 구현
    void eat() {
        System.out.println("먹는다.");
    }//모든 sub에서 똑같이 사용
}
class Person extends Animal12{//일반 클래스에서 추상클래스 상속
    @Override
    void move() {//상속받은 추상 메서드 오버라이딩(무조건!!)
        System.out.println("걸어간다.");
    }
}
class Fish extends Animal12 {
    @Override
    void move() {
        System.out.println("헤엄친다.");
    }
}
class Bird extends Animal12{
    @Override
    void move() {
        System.out.println("날아간다.");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        //Animal12 a = new Animal12(); //추상클래스 객체 생성 X
        Person p = new Person();
        p.move();
        Fish f = new Fish();
        f.move();
        Bird b = new Bird();
        b.move();
    }
}

