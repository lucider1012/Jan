package day0209.oop;

class Card{
    static int width = 100;
    static int height = 250;
    final String NUMBER;
    final String KIND;

    @Override
    public String toString() { //객체의 값을 문자열로 바꿔준다.
        return "Card {" +
                "NUMBER='" + NUMBER + '\'' +
                ", KIND='" + KIND + '\'' +
                '}';
    }

    public Card(String nUMBER, String kIND) {
        NUMBER = nUMBER;
        KIND = kIND;
    }
}
public class FinalCard {
    public static void main(String[] args) {
        Card c1 = new Card("ACE", "HEART");
        System.out.println(c1.toString());
        //참조변수 출력시 println(Object x)실행
        //println(Object x)=> 주소값을 출력하는 것이 아니라 가리키고 있는 객체의 toString() 호출, 리턴값 출력
        //Object 타입의 매개변수로 모든 참조형 타입을 출력할 수 있다.

        //c1.NUMBER = 100; final 상수는 값을 변경할 수 없다.
        Card c2 = new Card("J", "SPADE");
        System.out.println(c2);
    }
}

