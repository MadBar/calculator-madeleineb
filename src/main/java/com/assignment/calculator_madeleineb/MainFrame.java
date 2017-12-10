package com.assignment.calculator_madeleineb;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	
	private JFrame frmMadbarCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmMadbarCalculator.setVisible(true);
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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMadbarCalculator = new JFrame();
		frmMadbarCalculator.setTitle("MadBar Calculator");
		frmMadbarCalculator.setBounds(100, 100, 450, 300);
		frmMadbarCalculator.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
		frmMadbarCalculator.getContentPane().setLayout(null);
		
		JLabel lblMadBarCal = new JLabel("MadBar Calculator");
		lblMadBarCal.setBounds(166, 11, 92, 23);
		frmMadbarCalculator.getContentPane().add(lblMadBarCal);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("Clickeddd!");
				frmMadbarCalculator.getContentPane().setBackground(Color.red);
			}
		});
		btnPlus.setBounds(37, 178, 41, 23);
		frmMadbarCalculator.getContentPane().add(btnPlus);
	}
}
