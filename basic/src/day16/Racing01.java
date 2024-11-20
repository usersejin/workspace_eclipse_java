package day16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Racing01 extends JFrame implements ActionListener {

    // 멤버변수
    JButton jbtn1, jbtn2, jbtn3, jbtnStart;
    ImageIcon img1, img2;

    // 생성자
    public Racing01() {
        setTitle("경마장");
        // 이미지
        img1 = new ImageIcon("src/images/horse.gif"); // 달리는 이미지
        img2 = new ImageIcon("src/images/horsestop.gif"); // 멈춘 이미지
        // 버튼 생성
        jbtn1 = new JButton(img2);
        jbtn2 = new JButton(img2);
        jbtn3 = new JButton(img2);
        jbtnStart = new JButton("START");

        // 버튼 위치
        setLayout(null);
        jbtn1.setBounds(50, 150, 120, 60);
        jbtn2.setBounds(50, 250, 120, 60);
        jbtn3.setBounds(50, 350, 120, 60);
        jbtnStart.setBounds(250, 600, 800, 50);

        // 버튼 부착
        add(jbtn1);
        add(jbtn2);
        add(jbtn3);
        add(jbtnStart);
        
        // 이벤트 처리
        jbtnStart.addActionListener(this);

        // 창 설정
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50, 50, 1200, 800);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // START 버튼을 누르면 시작
        if (e.getSource() == jbtnStart) {
        	
            // 달리는 이미지로 변경
            jbtn1.setIcon(img1);
            jbtn2.setIcon(img1);
            jbtn3.setIcon(img1);

            // 버튼들이 독립적으로 움직이도록 스레드 생성
            Thread t1 = new Thread(new Horse(jbtn1));
            Thread t2 = new Thread(new Horse(jbtn2));
            Thread t3 = new Thread(new Horse(jbtn3));

            // 스레드 시작
            t1.start();
            t2.start();
            t3.start();
        }
    }

    // 말 이동 스레드 클래스 
    class Horse implements Runnable {
        JButton btn;

        // 생성자
        public Horse(JButton btn) {
            this.btn = btn;
        }

        @Override
        public void run() {
            while (btn.getX() < 900) { // 버튼이 x좌표 900까지 이동
                int x = btn.getX() + (int)(Math.random() * 10); // 랜덤하게 x좌표 이동
                btn.setBounds(x, btn.getY(), 120, 60); // 버튼 이동 좌표 지정

                try {
                    Thread.sleep(50); // 버튼 이동 속도
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // x좌표 900에 도달하면 멈춘 이미지로 변경
            btn.setIcon(img2);
        }
    }

    public static void main(String[] args) {
        Racing r = new Racing();
    }
}
