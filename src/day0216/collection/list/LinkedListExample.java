package day0216.collection.list;

import java.util.*;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		List<String> l2 = new LinkedList<>();
		
		long start;
		long end;
		
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			l1.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
		System.out.println("ArrayList : "+(end - start));
		start = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			l2.add(0, String.valueOf(i));
		}
		end = System.nanoTime();
	
		System.out.println("LinkedList : "+(end - start));
	}
}
