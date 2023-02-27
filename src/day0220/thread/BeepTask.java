package day0220.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {	
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(900); } catch(Exception e) {}
		}
	}
}

