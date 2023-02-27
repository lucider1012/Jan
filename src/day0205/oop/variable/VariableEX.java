package day0205.oop.variable;

public class VariableEX {
    int iv; //인스턴스 변수
    static int cv; //클래스 변수
    void method(){ // 인스턴스 메서드
        int lv = 0; //지역변수
    }
    public static void main(String[] args) {
        System.out.println(VariableEX.cv); //클래스명.클래스 변수명
        System.out.println(cv);//같은 클래스 내라면 클래스 변수명만 사용해도 무방
        //인스턴스 멤버를 사용하려면 클래스를 객체로 생성
        VariableEX ve = new VariableEX();
        System.out.println(ve.iv);//참조변수. 인스턴스 변수명
        VariableEX ve2 = new VariableEX();
        ve2.iv = 10;
        System.out.println(ve.iv);
        System.out.println(ve2.iv);
        ve.method();
    }
}
//클래스 정보 로딩
//static 멤버 로딩
//main() 메서드 실행
//main() 내에서 객체 생성 -> 해당 클래스의 인스턴스 멤버 로딩
//             메서드 호출 -> 지역변수 로딩
//             메서드 종료 -> 지역변수 ㅗ멸
//main() 종료
//프로그램 종료
//