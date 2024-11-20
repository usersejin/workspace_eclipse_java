package day12;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class MyWin2 extends Frame {

	Button east, west, north, south, center;

	MyWin2() {
		super();

//		setLayout(new BorderLayout());
		Button east = new Button("동");
		Button west = new Button("서");
		Button north = new Button("북");
		Button south = new Button("남");
		Button center = new Button("중앙");

//		add(east, BorderLayout.EAST); // 매개변수가 다르면서 오버라이딩된 add가 됨
//		add(west, BorderLayout.WEST);
//		add(north, BorderLayout.NORTH);
//		add(south, BorderLayout.SOUTH);
//		add(center, BorderLayout.CENTER);

		add(east, "East"); // 매개변수가 다르면서 오버라이딩된 add가 됨 <- 그냥 add(east)와 
		add(west, "West");
		add(north, "North");
		add(south, "South");
		add(center, "Center");

		setTitle("MyWin2 클래스");
		setSize(400, 500);
		setLocation(800, 300);
		setVisible(true);
	}

	public static void main(String[] args) {

		MyWin2 mw2 = new MyWin2();
	}

}
