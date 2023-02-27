package day0209.oop;

public class OrderTest {
    public static void main(String[] args) {
        ValueObjectEx vo1 = new ValueObjectEx("국수집", "멸치국수", 1);
        System.out.println(vo1.getFood()+ vo1.getQuantity()+"개 주문");
        //vo1.quantity = 10; 변경 불가
        ValueObjectEx vo2 = new ValueObjectEx("국수집","잔치국수",2);
        System.out.println(vo2.getFood() + vo2.getQuantity() + "개 주문");
    }
}
