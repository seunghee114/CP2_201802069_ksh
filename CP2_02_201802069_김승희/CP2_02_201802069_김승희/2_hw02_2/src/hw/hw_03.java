package hw;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class hw_03 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hw_03 frame = new hw_03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public hw_03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("°è»ê±â");
		setBounds(100, 100, 245, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 131, 212, 45);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(button_7);
		
		JButton button_8 = new JButton("8");
		panel.add(button_8);
		
		JButton button_9 = new JButton("9");
		panel.add(button_9);
		
		JButton button_16 = new JButton("/");
		panel.add(button_16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 186, 212, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JButton button_4 = new JButton("4");
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("5");
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("6");
		panel_1.add(button_6);
		
		JButton button_15 = new JButton("*");
		panel_1.add(button_15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 241, 212, 45);
		contentPane.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JButton button_1 = new JButton("1");
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("2");
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("3");
		panel_2.add(button_3);
		
		JButton button_14 = new JButton("-");
		panel_2.add(button_14);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(13, 296, 211, 45);
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JButton button_10 = new JButton("0");
		panel_3.add(button_10);
		
		JButton button_11 = new JButton("00");
		panel_3.add(button_11);
		
		JButton button_12 = new JButton("=");
		panel_3.add(button_12);
		
		JButton button_13 = new JButton("+");
		panel_3.add(button_13);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 76, 212, 45);
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		JButton button = new JButton("C");
		panel_4.add(button);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 26, 212, 29);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
