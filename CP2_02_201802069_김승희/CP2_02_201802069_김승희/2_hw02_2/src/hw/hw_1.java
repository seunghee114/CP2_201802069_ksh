package hw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class hw_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hw_1 frame = new hw_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public hw_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("마일을 킬로미터로 변환");
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("거리를 마일 단위로 입력하시오.");
		lblNewLabel.setBounds(32, 37, 181, 15);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 62, 352, 41);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("변환");
		panel.add(btnNewButton);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(240, 34, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(51, 113, 288, 38);
		contentPane.add(panel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(25);
	}
}
