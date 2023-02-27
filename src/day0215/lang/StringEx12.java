package day0215.lang;

public class StringEx12 {
    public static void main(String[] args) {
        String str = "abcdefg/hijklmn/opqrstu/vwxyz";
        String [] al = str.split("/");
        for(String str2: al){
            //str2 = str2.substring(0, 1).toUpperCase()+str2.substring(1);
            System.out.println(/*str2*/str2.substring(0, 1).toUpperCase()+str2.substring(1));
        }
    }
}
