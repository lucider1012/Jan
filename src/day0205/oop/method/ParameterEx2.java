package day0205.oop.method;

public class ParameterEx2 {
    static void change(int[] x){//reference - 배열의 주소값
        x[0]=1000;
        System.out.println("x[0] : "+x[0] );
    }
    public static void main(String[] args) {
        int[] x = {10};
        System.out.println("x[0] : "+ x[0]);
        change(x);
        System.out.println("x[0] : "+ x[0]);
    }
}
