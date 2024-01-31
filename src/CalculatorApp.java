import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorApp {

	private JFrame frame;
	private JTextField number1;
	private JTextField number2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("CalculatorApp");
		frame.setBounds(100, 100, 868, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(181, 96, 81, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(465, 96, 122, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		number1 = new JTextField();
		number1.setBounds(166, 135, 129, 33);
		frame.getContentPane().add(number1);
		number1.setColumns(10);
		
		number2 = new JTextField();
		number2.setBounds(446, 135, 122, 33);
		frame.getContentPane().add(number2);
		number2.setColumns(10);
		
		JButton addButton = new JButton("ADDICTION");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int a1=Integer.parseInt(number1.getText());
				int a2=Integer.parseInt(number2.getText());
				int total=a1+a2;
				result.setText(Integer.toString(total));
				}
				catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
				}
			}
		});
		addButton.setBounds(25, 269, 148, 80);
		frame.getContentPane().add(addButton);
		
		JButton subButton = new JButton("SUBTRACTION");
		subButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int a1=Integer.parseInt(number1.getText());
					int a2=Integer.parseInt(number2.getText());
					int total=a1-a2;
					result.setText(Integer.toString(total));
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
					}
				
			}
		});
		subButton.setBounds(229, 269, 139, 80);
		frame.getContentPane().add(subButton);
		
		JButton multButton = new JButton("MULTIPLICATION");
		multButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a1=Integer.parseInt(number1.getText());
					int a2=Integer.parseInt(number2.getText());
					int total=a1*a2;
					result.setText(Integer.toString(total));
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
					}
			}
		});
		multButton.setBounds(429, 269, 139, 80);
		frame.getContentPane().add(multButton);
		
		JButton dıvButton = new JButton("DIVISION");
		dıvButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a1=Integer.parseInt(number1.getText());
					double a2=Integer.parseInt(number2.getText());
					double total=a1/a2;
					result.setText(Double.toString(total));
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
					}
			}
		});
		dıvButton.setBounds(637, 269, 139, 80);
		frame.getContentPane().add(dıvButton);
		
		JLabel lblNewLabel_2 = new JLabel("CALCULATOR APP");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
		lblNewLabel_2.setBounds(327, 32, 155, 40);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Result Screen:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(229, 425, 122, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		result = new JTextField();
		result.setBounds(334, 408, 148, 61);
		frame.getContentPane().add(result);
		result.setColumns(10);
	}
}
