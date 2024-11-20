package day12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWin8 extends Frame {
	MyWin8() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { 
				System.exit(0);
			}
		}); 
		setSize(800, 600);
		setLocation(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyWin8();
	}

}
