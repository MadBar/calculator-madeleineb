package com.assignment.calculator_madeleineb;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;

public class MainFrame {

	//Why do they get the property Final? Auto.
	private JFrame frmMadbarCalculator = new JFrame();
	private final JTextField textField = new JTextField();
	private final JButton btnPlus = new JButton("+");
	private final JButton btnSubt = new JButton("-");
	private final JButton btnDivi = new JButton("/");
	private final JButton btnMult = new JButton("*");
	
	private final JButton btnPow2 = new JButton("x²");
	private final JButton btnPow3 = new JButton("x³");
	private final JButton btnPow4 = new JButton("x4");
	private final JButton btnPow5 = new JButton("x5");
	private final JButton btnPow6 = new JButton("x6");
	private final JButton btnPow7 = new JButton("x7");
	private final JButton btnEqual = new JButton("=");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmMadbarCalculator
							.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		textField.setToolTipText("insert number");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setText("0");
		textField.setBounds(10, 11, 191, 47);
		textField.setColumns(10);
		initialize();
		addComponents();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// frmMadbarCalculator = new JFrame();

		// Properties of frame
		frmMadbarCalculator.setTitle("MadBar Calculator");
		frmMadbarCalculator.setBounds(100, 100, 228, 264);
		frmMadbarCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMadbarCalculator.getContentPane().setLayout(null);
		frmMadbarCalculator.setVisible(true);
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 8));

		// Properties of basic buttons
		btnPlus.setBounds(161, 69, 40, 40);
		btnSubt.setBounds(111, 69, 40, 40);
		btnDivi.setBounds(61, 69, 40, 40);
		btnMult.setBounds(10, 69, 40, 40);

		// Properties of advanced buttons
		btnPow2.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnPow2.setBounds(111, 120, 40, 40);
		btnPow3.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnPow3.setBounds(61, 120, 40, 40);
		btnPow4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow4.setBounds(10, 120, 40, 40);
		btnPow5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow5.setBounds(111, 171, 40, 40);
		btnPow6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow6.setBounds(61, 171, 40, 40);
		btnPow7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow7.setBounds(10, 171, 40, 40);
		
		btnEqual.setBounds(161, 120, 40, 91);
	}

	public void addComponents() {
		
		frmMadbarCalculator.getContentPane().add(textField);
		
		frmMadbarCalculator.getContentPane().add(btnPlus);
		frmMadbarCalculator.getContentPane().add(btnSubt);
		frmMadbarCalculator.getContentPane().add(btnDivi);
		frmMadbarCalculator.getContentPane().add(btnMult);
		
		frmMadbarCalculator.getContentPane().add(btnPow2);
		frmMadbarCalculator.getContentPane().add(btnPow3);
		frmMadbarCalculator.getContentPane().add(btnPow4);
		frmMadbarCalculator.getContentPane().add(btnPow5);
		frmMadbarCalculator.getContentPane().add(btnPow6);
		frmMadbarCalculator.getContentPane().add(btnPow7);
		
		frmMadbarCalculator.getContentPane().add(btnEqual);		
	}

	public void addActionListeners() {
		//Basic
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("Clickeddd!");
				frmMadbarCalculator.getContentPane()
						.setBackground(Color.red);
			}
		});
		btnSubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Advanced
		btnPow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPow3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPow4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPow5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPow6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPow7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
