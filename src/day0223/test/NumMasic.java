package day0223.test;

import java.util.Scanner;

public class NumMasic {

	public static void main(String[] args) {

		String select; //yes 또는 or
		int result=0; //사용자가 생각한 숫자를 출력하기 위한 변수
		System.out.println("1 ~ 61 사이의 숫자를 머리속으로 생각하세요 ");
		System.out.println("04 05 06 07 12"); //1~3, 8~11까지없음
		System.out.println("13 14 15 20 21"); //16~19 없음
		System.out.println("22 23 28 29 30"); //24~27 없음
		System.out.println("31 36 37 38 39");
		System.out.println("44 45 46 47 52");
		System.out.println("53 54 55 60 61");
		
		System.out.print("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");
		
		Scanner scan=new Scanner(System.in);
		select=scan.next();
		
		if(select.equals("y")) {
			result += 4;
		}
		
		//-------------------------------------------------------------------
		System.out.println("--------------------------------");
		System.out.println("16 17 18 19 20"); //1~15 없음
		System.out.println("21 22 23 24 25");
		System.out.println("26 27 28 29 30");
		System.out.println("31 48 49 50 51");
		System.out.println("52 53 54 55 56");
		System.out.println("57 58 59 60 61");

		System.out.print("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");

		select=scan.next();
		
		if(select.equals("y")) {
			result += 16;
		}
		
		//-------------------------------------------------------------------
		System.out.println("--------------------------------");
		System.out.println("01 03 05 07 09"); //짝수 없음
		System.out.println("11 13 15 17 19");
		System.out.println("21 23 25 27 29");
		System.out.println("31 33 35 37 39");
		System.out.println("41 43 45 47 49");
		System.out.println("51 53 55 57 59 61");
		
		System.out.print("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");

		select=scan.next();
		
		if(select.equals("y")) {
			result += 1;
		}

		//-------------------------------------------------------------------
		System.out.println("--------------------------------");
		System.out.println("08 09 10 11 12"); //1~7 없음
		System.out.println("13 14 15 24 25"); // 16~23 없음
		System.out.println("26 27 28 29 30");
		System.out.println("31 40 41 42 43");
		System.out.println("44 45 46 47 56");
		System.out.println("57 58 59 60 61");
		
		System.out.print("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");

		select=scan.next();
		
		if(select.equals("y")) {
			result += 8;
		}

		//-------------------------------------------------------------------
		System.out.println("--------------------------------");
		System.out.println("02 03 06 07 10"); //4~5 없음
		System.out.println("11 14 15 18 19"); //12~13, 16~17 없음
		System.out.println("22 23 26 27 30"); //20~21, 24~25 없음
		System.out.println("31 34 35 38 39");
		System.out.println("42 43 46 47 50");
		System.out.println("51 54 55 58 59");
		
		System.out.print("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");

		select=scan.next();
		
		if(select.equals("y")) {
			result += 2;
		}
		System.out.println("--------------------------------");
		System.out.println("32 33 34 35 36 37"); //4~5 없음
		System.out.println("38 39 40 41 42 43");
		System.out.println("44 45 46 47 48 49");
		System.out.println("50 51 52 53 54 55");
		System.out.println("56 57 58 59 60 61");


		System.out.print("여기에 당신이 생각한 숫자가 있습니까? - y/n : ");

		select=scan.next();

		if(select.equals("y")) {
			result += 32;
		}
		
		System.out.println("-----------------------------------");
		System.out.println("당신이 생각한 숫자는 "+result+"입니다.");
	 }//main 
   
}//clss
