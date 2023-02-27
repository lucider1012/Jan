package day0205.oop.variable;

public class Card {
    static int width;
    static int height;

    int num;
    String kind;

    public void printCard(){
        System.out.printf("width : %d height: %d num:%d, kind: %s\n", width, height, num, kind);
    }
}
