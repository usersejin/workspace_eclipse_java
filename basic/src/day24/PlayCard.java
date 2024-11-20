package day24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PlayCard extends JFrame implements ActionListener {

	JButton card1, card2, card3, cardShuffle;
	ImageIcon imgBack, img1, img2, img3, img4, img5;
	ImageIcon img6, img7, img8, img9, img10, img11;
	ImageIcon img12, img13 ;
	
	ImageIcon[] img;

	PlayCard() {
		setLayout(null);
		img = new ImageIcon[5];
		imgBack = new ImageIcon("src/images/card_back.png");
		img1 = new ImageIcon("src/images/AS.png");
		img2 = new ImageIcon("src/images/2S.png");
		img3 = new ImageIcon("src/images/3S.png");
		img4 = new ImageIcon("src/images/4S.png");
		img5 = new ImageIcon("src/images/5S.png");
		img6 = new ImageIcon("src/images/6S.png");
		img7 = new ImageIcon("src/images/7S.png");
		img8 = new ImageIcon("src/images/8S.png");
		img9 = new ImageIcon("src/images/9S.png");
		img10 = new ImageIcon("src/images/10S.png");
		img11 = new ImageIcon("src/images/JS.png");
		img12 = new ImageIcon("src/images/KS.png");
		img13 = new ImageIcon("src/images/QS.png");

		img[0] = img1;
		img[1] = img2;
		img[2] = img3;
		img[3] = img4;
		img[4] = img5;
		img[5] = img6;
		img[6] = img7;
		img[7] = img8;
		img[8] = img9;
		img[9] = img10;
		img[10] = img11;
		img[11] = img12;
		img[12] = img13;

		card1 = new JButton(imgBack);
		card2 = new JButton(imgBack);
		card3 = new JButton(imgBack);
		cardShuffle = new JButton("SHUFFLING CARD");

		card1.setBounds(50, 50, 132, 200);
		card2.setBounds(200, 50, 132, 200);
		card3.setBounds(350, 50, 132, 200);
		cardShuffle.setBounds(50, 300, 430, 50);

		add(card1);
		add(card2);
		add(card3);
		add(cardShuffle);

		cardShuffle.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 400, 550, 450);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PlayCard();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj.equals(cardShuffle)) {
			System.out.println("버튼 클릭");
			
				Card c1 = new Card(card1, img);
				Card c2 = new Card(card2, img);
				Card c3 = new Card(card3, img);
				
				c1.start();
				c2.start();
				c3.start();

		
		}

	}

}
