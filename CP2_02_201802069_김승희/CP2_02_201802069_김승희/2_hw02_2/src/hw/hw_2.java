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

public class hw_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hw_2 frame = new hw_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public hw_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이자계산기");
		setBounds(100, 100, 452, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("원금을 입력하시오.");
		lblNewLabel.setBounds(34, 45, 144, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("이율을 입력하시오.");
		lblNewLabel_1.setBounds(34, 80, 144, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(257, 42, 96, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(257, 77, 96, 21);
		contentPane.add(textField_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 150, 366, 37);
		contentPane.add(panel);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(30);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(135, 105, 135, 41);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("변환");
		panel_1.add(btnNewButton);
	}
}
