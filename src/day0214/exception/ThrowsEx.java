package day0214.exception;

import java.util.Scanner;

public class ThrowsEx {
    public void gugudan(String str) throws NumberFormatException{
        int num = Integer.parseInt(str);//숫자만!!
        for (int i = 2; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }
    public void getNumber(String str) throws NumberFormatException{
        String s = str.substring(0,1);
        gugudan(s);
    }
    //런타임 예외는 예외처리를 하지 않아도 컴파일 오류가 발생하지 않음.
    public static void main(String[] args){
        ThrowsEx te = new ThrowsEx();
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단 숫자 입력 >");
        String s = sc.next();
        try {
            te.getNumber(s);
            //throws가 RuntimeException타입이 아닌 메서드 호출시
            //반드시 예외처리하면서 호출해야한다.
        }
        catch (Exception e){
            System.out.println("예외발생: "+e.getMessage());
        }
    }

}
