package day0209.oop.polymorphism;

public class InstanceOfTest {
    public void method(Object obj){ //모든타입의 객체를 받아 올 수 있다.
        if(obj instanceof Car){
            ((Car)obj).drive(); //Car에 있는 모든 멤버를 사용하기 위해 Car타입 변환
        }
        if (obj instanceof String) { //원본 객체 타입
            char c = ((String)obj).charAt(0);
            System.out.println(c);

        }
    }
    public static void main(String[] args) throws Exception {
        FireEngine fe = new FireEngine();
        Car car = new Car();

        if(fe instanceof Car){
            Car c1 = (Car) fe;
            System.out.println("Car 타입변환 가능");
        }
        if(car instanceof FireEngine){
            FireEngine f1 = (FireEngine) car;
            System.out.println("FireEngine 타입 변환 가능");
        }
        else {
            System.out.println("FireEngine 타입 변환 불가능");
        }
    }
}
