package day0210.oop.polymorphism;

class Parent {
    int x = 100;
    public static void cMethod(){
        System.out.println("Parent 실행");
    }
    public void method(){
        System.out.println("Parent 실행: ");
    }
}
class Child extends Parent{
    int x = 200;//변수 재정의
    public static void cMethod() {//오버라이딩
        System.out.println("Child 실행");
    }
    public void method(){
        System.out.println("Child 실행");
    }
}
public class DynamicBinding{
    public static void main(String[] args) {
        Child c = new Child();
        //정적 바인딩 -compile시점에 타입 결정
        //          - 참조변수의 타입을 따라감

        System.out.println(c.x);//200
        c.method();//Child 실행

        Parent p = new Child();
        System.out.println(p.x);//100
        p.method();
        //Child 실행 - 동적 바인딩 : 다형성으로 객체를 다룰때 인스턴스메서드 호출시 적용
        //                         실행 시점에 타입이 결정된다.
        //                         실제 참조하고 있는 객체의 타입을 따라간다.
        Parent.cMethod();
        Child.cMethod();
        p.cMethod();
    }
}
