package day0206.oop.constructor;
public class Car {
    String color;
    String geartype;
    int door;
    Car(){
        this("white", "auto", 2);
    }
    Car(Car c){
        color = c.color;
        //geartype = c.geartype;
        //door = c.door;

    }
    Car(String color, String geartype, int door) {
        this.color = color;
        //현재 생성한 객체 안에 있는 인스턴스 변수
        this.geartype = geartype;
        this.door = door;
    }
    //지역변수와 인스턴스 변수의 이름이 같은 경우..
    //선언된 영역내에서는 지역변수가 우선권을 가진다.
    //객체에 잇는 인스턴스 변수를 가리키기 위해서는 객체의 주소값이 필요
    //this 참조변수는 현재 객체의 주소값을 가지고 있다.
    public String toString() {
        return "Car - color:"+color + " gearType:" +geartype + " door:" + door;
    }
}

