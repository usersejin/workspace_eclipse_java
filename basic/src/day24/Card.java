package day24;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

// 카드를 main 스레드(PlayCard) 와 별도로 동시에 다른 작업을 수행할 수 있도록 멀티 스레드 처리
public class Card extends Thread {
	JButton jbtn;
	ImageIcon[] icon;

	public Card(JButton jbtn, ImageIcon[] icon) {
		super();
		this.jbtn = jbtn;
		this.icon = icon;
	}

	@Override
	public void run() {
		// 랜덤 객체
		Random rnd = new Random();

		for (int i = 0; i < icon.length; i++) {

			try {
				Thread.sleep(rnd.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			jbtn.setIcon(icon[rnd.nextInt(13)]); // 여기서 이미지 바꿈

		}

	}
}
