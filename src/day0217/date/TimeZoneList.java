package day0217.date;

import java.util.TimeZone;

public class TimeZoneList {

	public static void main(String[] args) {
		String[] zone = TimeZone.getAvailableIDs();
		for (String str : zone) {
			System.out.println(str);
		}

	}

}
