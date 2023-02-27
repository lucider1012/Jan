package day0217.collection.set;

import java.util.TreeSet;

public class TreeLotto {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		
		for( ; lotto.size() < 6; ) { // 저장된 객체(주소)의 수가 6보다 작을때만 반복
			int num = (int)(Math.random() * 45) + 1;//1 ~ 45
			lotto.add(num); //중복 값은 저장하지 않는다.
		}
		
		System.out.println(lotto);
		
	}
}
