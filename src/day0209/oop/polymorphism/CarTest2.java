package day0209.oop.polymorphism;

public class CarTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fe = null;

        fe = (FireEngine)car; //error sub의 참조변수가 super의 객체를 참조할 수 없음
        fe.drive();
        fe.water();

    }
}
