package day0213.ncs.Test2;

public class Customer{

    private int money;
    private int point;

    public int getMoney() {
        return money;
    }

    public int getPoint() {
        return point;
    }

    public Customer(int money, int point) {
        this.money = money;
        this.point = point;
    }

    public void order(Food f){
        System.out.println(f.getName()+"를/을 주문하셨습니다.");
        money -= f.getPrice();
        point += f.getPoint();
    }
    public void M(){
        System.out.println("남은 금액은 : "+money);
        System.out.println("적립된 포인트는: "+ point);
    }
}
