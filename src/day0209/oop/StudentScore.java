package day0209.oop;

public class StudentScore {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    public StudentScore() {
    }

    public StudentScore(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }

    int getTotal() {
        return kor + eng + math;
    }

    double getAverage() {
        return getTotal() / 3.0;
    }
}


