package day22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import dao.StudentDAO;
import vo.StudentVO;

public class DeleteStudentC extends JFrame implements ActionListener {

	JLabel jlNo;
	JTextField jtfNo;
	JButton jbtn, jbtn1;
	JTextArea jta;

	public DeleteStudentC() {

		setLayout(null);

		// 학번 라벨과 tf
		jlNo = new JLabel("학번");
		jtfNo = new JTextField();
		jlNo.setBounds(90, 30, 70, 40);
		jtfNo.setBounds(150, 30, 130, 40);
		add(jlNo);
		add(jtfNo);

		// 학번 검색 버튼
		jbtn1 = new JButton("검색");
		jbtn1.setBounds(300, 30, 100, 40);
		add(jbtn1);
		jbtn1.addActionListener(this);

		// 학생정보 띄울 jta
		jta = new JTextArea();
		jta.setBounds(50, 80, 360, 100);
		add(jta);

		// 삭제버튼
		jbtn = new JButton("삭제");
		jbtn.setBounds(300, 190, 100, 40);
		add(jbtn);
		jbtn.addActionListener(this);

		setTitle("학생 정보 삭제");
		setBounds(450, 450, 470, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DeleteStudentC();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		StudentDAO dao = new StudentDAO();
		StudentVO vo = null;
		int Studentno = Integer.parseInt(jtfNo.getText());
		if (obj == jbtn1) {
			// 버튼 누르면 학생 정보 출력하는 메서드
			vo = dao.selectOne(Integer.parseInt(jtfNo.getText()));
			if (dao.selectOne(Studentno) == null) {
				JOptionPane.showConfirmDialog(jbtn, "해당 학생이 존재하지 않습니다.");
				
				// 초기화
				jtfNo.setText("");
				jta.setText("");
			}

			// jta 에 부착
			jta.setText("학번 :\t" + vo.getNo() + "\n이름 :\t" + vo.getName() + "\n과목 : \t" + vo.getSubject() + "\n성적 :\t"
					+ vo.getScore());
			
		} else if (obj == jbtn) {
			
			dao.DeleteStudent(Integer.parseInt(jtfNo.getText()));
			
			// 초기화
			jtfNo.setText("");
			jta.setText("");
			
			// 메세지 출력
			JOptionPane.showConfirmDialog(jbtn, "삭제 완료");
		}
	}

}