package day0205.oop.method;

public class MethodEx {
    long add(int x, long y){
        return x+y;
    }//int, long 타입의 값을 받아 더하고 리턴하는 add
    int subtract(int x, int y){
        return x-y;
    }//int, int 값을 받아 빼고 결과를 리턴하는 subtract
    int multiply(int x,int y){
        return x*y;
    }//int, int 값을 받아 곱하고 결과를 리턴하는 multiply
    double divide(double x,double y){
        return x/y;
    }//double,double 값을 받아 나누고 결과를 리턴하는 divide
    void addString(String x, String y){
        System.out.println(x+y);
    }//두개의 문자열 받아서 더해서 출력 후 결과를 리턴하지 않는 addString 메서드
    public static/* 클래스변수 */void/*리턴값이 없다.*/ main(String[] args) {
        MethodEx ad = new MethodEx();

        System.out.println(ad.add(10,20));
    ad.addString("hello", "java");

    }
}

