package testPack2;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Calculator
{
	private JTextField txtFld;
	
	Calculator() //default class constructor
	{

		JFrame calcFrame = new JFrame();    //create main frame of the GUI
		JPanel calcPanel = new JPanel();	//create main panel of the GUI
		calcPanel.setLayout(new GridBagLayout());//assigning GBLayout to the panel
	
		GridBagConstraints gbc = new GridBagConstraints();
	
	     									//creating components of the GUI
		txtFld = new JTextField(2);
		txtFld.setHorizontalAlignment(JTextField.RIGHT);
		//txtFld.setText("0");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 1;
		gbc.gridwidth = 6;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.insets = new java.awt.Insets(6,2,6,2);//(top,left,bottom,right)
		calcPanel.add(txtFld, gbc);
	
		JButton stubBttn = new JButton(" ");
		stubBttn.setEnabled(false);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.insets = new java.awt.Insets(2,2,6,6);
		calcPanel.add(stubBttn, gbc);
	
	
	
		JButton buttnMC = new JButton("MC");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,6);
		calcPanel.add(buttnMC, gbc);
	
		JButton buttnMR = new JButton("MR");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,6);
		calcPanel.add(buttnMR, gbc);
	
		JButton buttnMS = new JButton("MS");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,6);
		calcPanel.add(buttnMS, gbc);
	
		JButton buttnMP = new JButton("M+");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,6);
		calcPanel.add(buttnMP, gbc);
	
		JButton buttnBS = new JButton("BackSpace");
		//buttnBS.setEnabled(false);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 2;
		gbc.insets = new java.awt.Insets(2,2,6,2);
		calcPanel.add(buttnBS, gbc);
	
		JButton buttnCE = new JButton("CE");
		gbc.gridx = 3;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 2;
		//gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttnCE, gbc);
	
		JButton buttnC = new JButton("C");
		gbc.gridx = 5;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,6,6,2);//(top, left, bottom, right)
		calcPanel.add(buttnC, gbc);
	
		JButton buttn1 = new JButton("1");
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn1, gbc);
	
		JButton buttn2 = new JButton("2");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn2, gbc);
	
		JButton buttn3 = new JButton("3");
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn3, gbc);
	
		JButton buttnPls = new JButton("<html><font size=+2>+</font></html>");
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,4,2,2);
		calcPanel.add(buttnPls, gbc);
	
		JButton buttnSqrt = new JButton("SQRT");
		gbc.gridx = 5;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,6,2,2);
		calcPanel.add(buttnSqrt, gbc);
	
		JButton buttn4 = new JButton("4");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn4, gbc);
	
		JButton buttn5 = new JButton("5");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn5, gbc);
	
		JButton buttn6 = new JButton("6");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn6, gbc);
	
		JButton buttnMns = new JButton("<html><b><font size=+2>-</font></b></html>");
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,4,2,2);
		calcPanel.add(buttnMns, gbc);
	
		JButton buttnRev = new JButton("1/x");
		gbc.gridx = 5;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,6,2,2);
		calcPanel.add(buttnRev, gbc);
	
		JButton buttn7 = new JButton("7");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn7, gbc);
	
		JButton buttn8 = new JButton("8");
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn8, gbc);
	
		JButton buttn9 = new JButton("9");
		gbc.gridx = 3;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttn9, gbc);
	
		JButton buttnMult = new JButton("<html><b><font size=+2>*</font></b></html>");
		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,4,2,2);
		calcPanel.add(buttnMult, gbc);
	
	
	
		JButton buttnZer = new JButton("0");
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttnZer, gbc);
	
		JButton buttnDelim = new JButton("<html><b><font size=+2>,</font></b></html>");
		gbc.gridx = 3;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,2,2,2);
		calcPanel.add(buttnDelim, gbc);
		
		JButton buttnDvd = new JButton("<html><font size=+1>/</font></html>");
		gbc.gridx = 4;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,4,2,2);
		calcPanel.add(buttnDvd, gbc);
	
		JButton buttnEq = new JButton("<html><font size=+1>=</font></html>");
		//txtFld. ; //(JString)buttnEq.getFont();
		gbc.gridx = 5;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new java.awt.Insets(2,6,2,2);
		calcPanel.add(buttnEq, gbc);
	
								//handling the main frame of the Calc
		calcFrame.setTitle("Калькулятор");
		calcFrame.setSize(350,250);
		calcFrame.setVisible(true);
		calcFrame.setContentPane(calcPanel);
		calcFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		calcFrame.pack();
		
		
		CalcProc calcEngine = new CalcProc(this); //call processing of events
		
									//register components with action listener
		buttnMult.addActionListener(calcEngine);
		buttnPls.addActionListener(calcEngine);
		buttnMns.addActionListener(calcEngine);
		buttnDvd.addActionListener(calcEngine);
		buttnEq.addActionListener(calcEngine);
		buttn1.addActionListener(calcEngine);
		buttn2.addActionListener(calcEngine);
		buttn3.addActionListener(calcEngine);
		buttn4.addActionListener(calcEngine);
		buttn5.addActionListener(calcEngine);
		buttn6.addActionListener(calcEngine);
		buttn7.addActionListener(calcEngine);
		buttn8.addActionListener(calcEngine);
		buttn9.addActionListener(calcEngine);
		buttnZer.addActionListener(calcEngine);
		buttnDelim.addActionListener(calcEngine);
		buttnC.addActionListener(calcEngine);
		
		
	}

		
	public void writeDisplay(String stringDisp)  //method that sets the display value during calculation
	{
		txtFld.setText(stringDisp);
	}
	
	public String readDisplay()  //method that sets the display value during calculation
	{
		return txtFld.getText();
	}
	
								
	
	public static void main(String аргумзыВсякие[])
	{
		Calculator clctr = new Calculator();
		
		
	}

}