package day0206.oop.constructor;
class Data1{
    int value;
}
class Data2{
    int value;
    Data2(int v){
        value = v;
    }

    public Data2() {

    }
}
public class ConstructorTest {

    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2();
    }
}
