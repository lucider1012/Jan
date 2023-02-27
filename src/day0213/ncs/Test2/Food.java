package day0213.ncs.Test2;

public class Food {
    private int point;
    private int price;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Food(int price) {
        this.price = price;
        this.point = price/10;
    }
    public String getName(){
        return "음식이름";
    }
}
