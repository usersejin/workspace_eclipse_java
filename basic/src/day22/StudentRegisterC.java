package day22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.StudentDAO;
import vo.StudentVO;

// 학생 등록
public class StudentRegisterC extends JFrame implements ActionListener {

	JLabel jlName, jlNo, jlSubject, jlScore;
	JTextField jtfName, jtfNo, jtfSubject, jtfScore;
	JButton jbtn;
	StudentManage sm;

	public StudentRegisterC() {

		setLayout(null);

		// 등록버튼
		jbtn = new JButton("등록");
		jbtn.setBounds(50, 170, 350, 40);
		add(jbtn);
		jbtn.addActionListener(this);

		// 이름 라벨과 tf
		jlName = new JLabel("이름");
		jtfName = new JTextField();
		jlName.setBounds(50, 50, 50, 40);
		jtfName.setBounds(100, 50, 100, 40);
		add(jlName);
		add(jtfName);

		// 학번 라벨과 tf
		jlNo = new JLabel("학번");
		jtfNo = new JTextField();
		jlNo.setBounds(250, 50, 50, 40);
		jtfNo.setBounds(300, 50, 100, 40);
		add(jlNo);
		add(jtfNo);

		// 과목 라벨과 tf
		jlSubject = new JLabel("과목");
		jtfSubject = new JTextField();
		jlSubject.setBounds(50, 100, 50, 40);
		jtfSubject.setBounds(100, 100, 100, 40);
		add(jlSubject);
		add(jtfSubject);

		// 성적 라벨과 tf
		jlScore = new JLabel("성적");
		jtfScore = new JTextField();
		jlScore.setBounds(250, 100, 50, 40);
		jtfScore.setBounds(300, 100, 100, 40);
		add(jlScore);
		add(jtfScore);

		setTitle("학생 등록");
		setBounds(450, 450, 470, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// JFrame default 가 x 누르면 그냥 사라지는 거임 -> EXIT_ON_CLOSE 안하면 돼
		setVisible(true);
	}

	public StudentRegisterC(StudentManage sm) {
		this();
		this.sm = sm;
	}
	public static void main(String[] args) {
		new StudentRegisterC();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		StudentDAO dao = new StudentDAO();
		dao.StudentRegister(
				new StudentVO(0, Integer.parseInt(jtfScore.getText()), jtfName.getText(), jtfSubject.getText()));

		// 초기화
		jtfName.setText("");
		jtfNo.setText("");
		jtfSubject.setText("");
		jtfScore.setText("");

		// 메세지 출력
		JOptionPane.showConfirmDialog(jbtn, "등록 완료");
//		dispose();
	}

}