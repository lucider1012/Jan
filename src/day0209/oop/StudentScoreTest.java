package day0209.oop;

public class StudentScoreTest {
    public static void main(String[] args) throws Exception {


        StudentScore ss = new StudentScore("응애", 1, 1, 50, 70, 100);

        System.out.println("이름: " + ss.name);
        System.out.println("총점: " + ss.getTotal());
        System.out.println("평균: "+ ss.getAverage());
    }
}
