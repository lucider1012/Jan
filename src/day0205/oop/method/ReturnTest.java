package day0205.oop.method;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();//메서드 호출
        int result = r.add(3,5);//result 변수 선언, int 형의 메서드 add 의 a,b 값에 각각 3,5 할당
        System.out.println(result);//메서드 add 실행값 출력
        int[] result2 ={0};//result2 변수 선언, 배열의 0번째 값 사용
        r.add(3,5,result2);//메서드 add 에 3,5, result2 할당
        System.out.println(result2[0]);//메서드 실행한거 출력
    }
    int add(int a, int b){//메서드 헤드, 변수 2개 선언
        return a+b;//리턴값 지정
    }
    void add(int a, int b,int[] result) {//메서드 헤드, int 형 변수 2개와 int 일차원 배열 1개 선언
        result[0] =a+b;//return 대신에 배열에 값을 할당함
    }
}
