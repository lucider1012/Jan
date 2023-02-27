package day0220.util.date;
import java.util.Scanner;
import java.util.*;
import java.text.*;
class WorkInfo{
    private String date;
    private String work;
    private int days;

    public WorkInfo() {
    }

    public WorkInfo(String date, String work, int days) {
        this.date = date;
        this.work = work;
        this.days = days;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void printInfo(){
        Calendar cal = Calendar.getInstance();

        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date start = null;
        WorkInfo w1 = new WorkInfo(date, work, days);
        try {
            start = df.parse(date);

        } catch (ParseException e) {
            System.out.println("잘못된 값이 입력되었습니다.(종료)");
            return;
        }
        cal.setTime(start);//Date ->Calendar
        cal.add(Calendar.DATE, days);

        Date end = cal.getTime();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(work+"의 시작일은 "+ sdf2.format(start)+"이고 "+ sdf2.format(end)+ "까지 수행해야합니다.");
    }
}
public class PersonInfoMain {
    public static void main(String[] args) {

        WorkInfo w = new WorkInfo();

        Scanner sc = new Scanner(System.in);
        System.out.println("시작일과 작업이름, 작업일수를 입력하세요");
        System.out.print("시작일(yyyy/MM/dd) >");
        w.setDate(sc.nextLine());
        System.out.print("업무명 >");
        w.setWork(sc.nextLine());
        System.out.print("작업 일수 >");
        w.setDays(sc.nextInt());
        w.printInfo();

    }
    public static boolean matchDate(String date) {
        String regex = "[0-9]{4}/[0-9]{2}/[0-9]{2}";
        return date.matches(regex);
    }
}

