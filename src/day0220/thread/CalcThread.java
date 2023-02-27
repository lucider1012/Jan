package day0220.thread;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(long i=0; i<2100000000; i++) {
		}
		System.out.println(getName());
	}
}
