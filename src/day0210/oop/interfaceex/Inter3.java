package day0210.oop.interfaceex;

public interface Inter3 extends Inter2, Inter1{
    //int getA(); //- 똑같은 추상메서드 상속시 하나로 인식한다.
    int getData();
    //int add(int i, int j);
    default int add(int i){
        return A+i;
    }
}
