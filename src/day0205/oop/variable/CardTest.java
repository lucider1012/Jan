package day0205.oop.variable;

public class CardTest {
    public static void main(String[] args) {
        Card.width = 100;
        Card.height = 250;
        Card c1 = new Card();
        c1.num = 7;
        c1.kind = "HEART";

        Card c2 = new Card();
        c2.num = 9;
        c2.kind = "CLOVER";
        c1.printCard();
        c2.printCard();
    }
}
