package day0127.oop;

public class Tv {
    int channel;//값을 명시하지 않으면 기본값을 저장 0
    boolean power;//false
    String color;//null

    void power() {
        power = !power;
    }

    void chUp() {
        channel++;
    }

    void chDown() {
        channel--;
    }
}
