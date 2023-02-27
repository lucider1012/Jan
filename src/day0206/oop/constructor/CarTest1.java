package day0206.oop.constructor;

public class CarTest1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        /* c1.color = "white";
        c1.geartype = "auto";
        c1.door = 2;*/
        System.out.println(c1.toString());
        Car c2 = new Car("black", "manual", 4);
        System.out.println(c2.toString());

        Car c3 = new Car(c2);
        System.out.println(c3.toString());

    }
}
