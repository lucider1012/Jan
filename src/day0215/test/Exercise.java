package day0215.test;
//StringBuilder과 String 클래스의 charAt(int i)과 indexOf(int ch)를 사용할 것
public class Exercise {

    public static String delChar(String src, String delCh){
        StringBuilder sb = new StringBuilder(src.length());
        for (int i = 0; i < src.length(); i++)
        {
            char c = src.charAt(i);
            if(delCh.indexOf(c)==-1){
                sb.append(c);
            }
        }
    return sb.toString();
    }
    public static void main(String[] args) {


        System.out.println("(1!2@3^4~5)"+"->"+delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "+delChar("(1 2 3 4\t5)"," \t"));
    }
}
