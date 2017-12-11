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
	private final JLabel lblPickNr = new JLabel("Fill the two fields below with two numbers you wish to operate");
	private final JLabel lblOperation = new JLabel("Chose operation to perform");
	private final JTextField textField1Nr = new JTextField();
	private final JTextField textField2Nr = new JTextField();
	
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
	
	private final JLabel lblResult = new JLabel("Result: ");
	private final JTextField textFieldResult = new JTextField();
	

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
		initialize();
		addComponents();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// frmMadbarCalculator = new JFrame();

		// Properties of Frame
		frmMadbarCalculator.setTitle("MadBar Calculator");
		frmMadbarCalculator.setBounds(100, 100, 366, 304);
		frmMadbarCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMadbarCalculator.getContentPane().setLayout(null);
		frmMadbarCalculator.setVisible(true);
		
		// Properties of Text Fields
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(60, 218, 263, 20);
		textFieldResult.setColumns(10);
		textField1Nr.setToolTipText("insert number");
		textField1Nr.setHorizontalAlignment(SwingConstants.RIGHT);
		textField1Nr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField1Nr.setBounds(20, 38, 141, 40);
		textField1Nr.setColumns(10);
		textField2Nr.setToolTipText("insert number");
		textField2Nr.setHorizontalAlignment(SwingConstants.RIGHT);
		textField2Nr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField2Nr.setColumns(10);
		textField2Nr.setBounds(171, 38, 147, 40);

		// Properties of basic buttons
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnPlus.setBounds(258, 113, 65, 40);
		btnSubt.setBounds(171, 112, 65, 40);
		btnDivi.setBounds(96, 112, 65, 40);
		btnMult.setBounds(20, 112, 65, 40);

		// Properties of advanced buttons
		btnPow2.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnPow2.setBounds(21, 163, 40, 40);
		btnPow3.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnPow3.setBounds(71, 163, 40, 40);
		btnPow4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow4.setBounds(121, 164, 40, 40);
		btnPow5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow5.setBounds(181, 163, 40, 40);
		btnPow6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow6.setBounds(233, 164, 40, 40);
		btnPow7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnPow7.setBounds(283, 164, 40, 40);
	}

	public void addComponents() {
		
		frmMadbarCalculator.getContentPane().add(textField1Nr);
		
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
		
		
		frmMadbarCalculator.getContentPane().add(textField2Nr);
		lblPickNr.setVerticalAlignment(SwingConstants.TOP);
		lblPickNr.setBounds(20, 11, 298, 16);
		
		frmMadbarCalculator.getContentPane().add(lblPickNr);
		lblOperation.setBounds(104, 89, 141, 14);
		
		frmMadbarCalculator.getContentPane().add(lblOperation);
		lblResult.setBounds(20, 214, 40, 28);
		
		frmMadbarCalculator.getContentPane().add(lblResult);
		
		frmMadbarCalculator.getContentPane().add(textFieldResult);
	}

	public void addActionListeners() {
		//Basic
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("Clickeddd!");
//				frmMadbarCalculator.getContentPane().setBackground(Color.red);
				
		
				/*Hämta siffra från text field. 
				 * spara i en variabel? 
				 * Rensa textfield
				 * 
				 * 
				 * */
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
	}
}
