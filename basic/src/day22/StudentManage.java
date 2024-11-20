package day22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StudentManage extends JFrame implements ActionListener {

	JButton jbtnInsert, jbtnModify, jbtnDelete, jbtnInfo;
	
	StudentManage() {
		setLayout(null);

		// 학생 등록 버튼
		jbtnInsert = new JButton("학생 등록");
		jbtnInsert.setBounds(50, 50, 150, 50);
		add(jbtnInsert);
		jbtnInsert.addActionListener(this);

		// 학생 성적 수정 버튼
		jbtnModify = new JButton("성적 수정");
		jbtnModify.setBounds(250, 50, 150, 50);
		add(jbtnModify);
		jbtnModify.addActionListener(this);

		// 학생 정보 삭제
		jbtnDelete = new JButton("학생정보 삭제");
		jbtnDelete.setBounds(50, 150, 150, 50);
		add(jbtnDelete);
		jbtnDelete.addActionListener(this);

		// 전체 학생 성적 조회₩
		jbtnInfo = new JButton("전체 학생 성적 조회");
		jbtnInfo.setBounds(250, 150, 150, 50);
		add(jbtnInfo);
		jbtnInfo.addActionListener(this);

		setTitle("학생 관리");
		setBounds(400, 400, 470, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new StudentManage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == jbtnInsert) {
			// 객체 불러오기(생성)
			StudentRegisterC sr = new StudentRegisterC(this);

		} else if (obj == jbtnModify) {
			ModifyStudentScoreC ms = new ModifyStudentScoreC(this);

		} else if (obj == jbtnDelete) {
			DeleteStudentC ds = new DeleteStudentC();
			
		} else if (obj == jbtnInfo) {
			InfoAllStudentC is = new InfoAllStudentC();
		}
	}

}