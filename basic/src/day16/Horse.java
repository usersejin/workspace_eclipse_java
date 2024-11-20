package day16;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

// 말 (= 버튼) : 동시에 경주
// 말을 멀티 스레드로 만들기
public class Horse extends Thread {
	JButton jbtn;
	ImageIcon img1, img2;

	Horse(JButton jbtn, ImageIcon img1, ImageIcon img2) {
		this.jbtn = jbtn;
		this.img1 = img1;
		this.img2 = img2;
		
	}

	@Override
	public void run() {
		jbtn.setIcon(img1); // 달리는 이미지
		Random rnd = new Random(); // 
		for (int i = 1; i < 100; i++) {
			jbtn.setLocation(jbtn.getX() + rnd.nextInt(20), jbtn.getY());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		jbtn.setIcon(img2);

//		jbtn.setLocation(500, 500); // 500, 500만큼 말이 움직여
	}

}
