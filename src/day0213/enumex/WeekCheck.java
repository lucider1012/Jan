package day0213.enumex;

import java.util.Calendar;

public class WeekCheck {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //현재 시간을 저장하는 calendar 객체 사용
        int w = cal.get(Calendar.DAY_OF_WEEK);// 요일을 1~7의 값으로 가져옴
        Week week;

        switch (w) {
            case 1:
                week = Week.SUN;
                break;
            case 7:
                week = Week.SAT;
                break;
            default:
                week = Week.MON;
                break;
        }
        System.out.println("오늘 요일 : "+ week);
        if (week==Week.SAT||week ==Week.SUN) {
            System.out.println("공부를 합니다.");
        }
        else {
            System.out.println("열심히 놉니다.");
        }
    }
}
