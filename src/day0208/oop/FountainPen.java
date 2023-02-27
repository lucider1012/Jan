package day0208.oop;

public class FountainPen extends Pen{
     // 남은 량
    private String color; // 볼펜의 색

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public void refill (int n) { setAmount(n); }
}
