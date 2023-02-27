package day0210.oop.interfaceex;

interface  Inter1{
    /*public static final*/ int A = 100;
    /*public abstract*/ int getA();
}
public class InterfaceTest implements Inter1{

    @Override
    public int getA() {
        return A;
    }

    public static void main(String[] args) {
        Inter1  it = new InterfaceTest();
        //InterfaceTest1 it = new InterfaceTest(); 으로도 가능 (다형성)
        System.out.println(it.getA());
        //오버라이딩 된 메서드 호출
    }
}