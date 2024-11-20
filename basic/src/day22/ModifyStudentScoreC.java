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

// 성적 수정
public class ModifyStudentScoreC extends JFrame implements ActionListener {

	JLabel jlScore, jlNo;
	JTextField jtfScore, jtfNo;
	JButton jbtn, jbtn1;
	JTextArea jta;
	StudentManage sm = null;

	public ModifyStudentScoreC() {

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
		jta.setEditable(false);
		jta.setBounds(50, 80, 360, 100);
		add(jta);

		// 성적 라벨과 tf
		jlScore = new JLabel("성적 입력");
		jtfScore = new JTextField();
		jlScore.setBounds(70, 190, 70, 40);
		jtfScore.setBounds(150, 190, 130, 40);
		add(jlScore);
		add(jtfScore);

		// 등록버튼
		jbtn = new JButton("성적 등록");
		jbtn.setBounds(300, 190, 100, 40);
		add(jbtn);
		jbtn.addActionListener(this);

		setTitle("성적 수정");
		setBounds(450, 450, 470, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public ModifyStudentScoreC(StudentManage sm) {
		this();
		this.sm = sm;
	}
	
	public static void main(String[] args) {
		new ModifyStudentScoreC();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		StudentDAO dao = new StudentDAO();
		StudentVO vo = null;
		if (obj == jbtn1) {
			// 버튼 누르면 학생 정보 출력하는 메서드
			vo = dao.selectOne(Integer.parseInt(jtfNo.getText()));
			
			// jta 에 부착
			jta.setText("학번 :\t" + vo.getNo() + "\n이름 :\t" + vo.getName() + "\n과목 : \t" + vo.getSubject() + "\n성적 :\t"
					+ vo.getScore());

		}

		else if (obj == jbtn) {
			
			// 학번 검색 후 학생 정보 출력
			dao.ModifyStudentScore(Integer.parseInt(jtfNo.getText()), Integer.parseInt(jtfScore.getText()));
			JOptionPane.showConfirmDialog(jbtn, "수정 완료");
			dispose();

		}

	}

}