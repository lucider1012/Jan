package day0209.oop;
import java.util.Scanner;
class Good{
    public String name;
    public int price;
    public int quantity;
    public Good() {
    }
    public Good(String name, int price) {
    }
    public String toString() {
        return "입력된 결과는 다음과 같습니다. \n"+name + ", " + price + "원, "+quantity + "개\n" +"총 구매 가격: "+quantity*price+"원";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
public class GoodTest {
    public static void main(String[] args) {
        System.out.println("다음 항목의 값을 입력하시오.");
        Scanner sc = new Scanner(System.in);
        Good g = new Good();
        System.out.print("상품명: ");
        g.name = sc.nextLine();
        System.out.println();
        System.out.print("가격: ");
        g.price = sc.nextInt();
        System.out.println();
        System.out.print("수량: ");
        g.quantity = sc.nextInt();
    System.out.println(g.toString());
    }
}
