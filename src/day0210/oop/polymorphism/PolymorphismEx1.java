package day0210.oop.polymorphism;
class Product{
    int price;
    int bonus;
    public Product(int price, int bonus) {
        this.price = price;
        this.bonus = bonus;
    }
}
class Tv extends Product {
    Tv(){
        super(200,20);
    }
    @Override
    public String toString() {
        return "Tv";
    }
}
class Com extends Product {
    public Com(){
        super(100, 10);
    }
    @Override
    public String toString() {
        return "Com";
    }
}
class Buyer{
    int money = 1000;
    int bonus = 10;
    public void buy(Product p){
        if (p.price > money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money-= p.price;;
        bonus += p.price;
        System.out.println(p+"를 구입");
    }
}
public class PolymorphismEx1 {
    public static void main(String[] args) {
        Tv t = new Tv();
        Com c = new Com();
        Buyer b = new Buyer();

        b.buy(c);
        b.buy(t);

    }
}
