package day0214.exception;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] iarr = {10, 200, 30};
        for (int i = 0; i <= iarr.length; i++) {
            try {
                System.out.println(i + 1 + "번수행");
                System.out.println("iarr[" + i + "] : " + iarr[i]);
                System.out.println(i + 1 + "~~~~~~~~~~~");
            }
            catch(Exception e){
                System.out.println("예외발생 - 인덱스 범위가 맞지 않음");
                System.out.println(e.getMessage());
                //e.printStackTrace();//예외추적 메소드
                return;
                }
            finally {
                System.out.println(i+1+"-finally");
                }
            }
            System.out.println("program end!!");
        }
    }

