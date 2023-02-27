package day0205.oop.method;

public class CallStackEx {
    public static void first(){
        System.out.println("first");
        second();
    }

    public static void second(){
        System.out.println("second");
    }
    public static void main(String[] args) {
        System.out.println("main");
        CallStackEx.first();
    }
}
