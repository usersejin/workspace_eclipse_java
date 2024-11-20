package day22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import dao.StudentDAO;
import vo.StudentVO;

public class InfoAllStudentC extends JFrame implements ActionListener {

	JTextArea jta;
	JButton jbtn;

	public InfoAllStudentC() {
		setLayout(null);

		// 전체 학생 성적 출력
		jta = new JTextArea();
		jta.setEditable(false);
		JScrollPane scroll = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jta.setBounds(50, 30, 370, 170);
		add(jta);

		// 조회 버튼
		jbtn = new JButton("성적 조회");
		jbtn.setBounds(50, 210, 370, 40);
		add(jbtn);
		jbtn.addActionListener(this);

		setTitle("전체 학생 성적 조회");
		setBounds(450, 450, 470, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new InfoAllStudentC();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		StudentDAO dao = new StudentDAO();
		ArrayList<StudentVO> list = dao.infoAllstudent();

		if (list != null) {
			for (StudentVO vo : list) {
				jta.append("학번 : " + vo.getNo() + "\t| 이름 : " + vo.getName() + "\t| 과목 : " + vo.getSubject()
						+ "\t| 성적 : " + vo.getScore() + "\n");
			}
		} else {
			JOptionPane.showConfirmDialog(jbtn, "학생이 존재하지 않습니다.");

		}

	}

}