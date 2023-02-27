package day0215.lang;

public class StringEx2 {
    public static void main(String[] args) {
        String s1 = "AAA";
        String s2 = "AAA";
        String s3 = new String("AAA");
        String s4 = "BBB";
        //String ->저장된 문자열을 int로 바꿔서 계산
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s2==s3);
        System.out.println(s4.hashCode()+"\n\n");


        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s3));
    }
}
