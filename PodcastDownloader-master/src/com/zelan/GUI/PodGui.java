package com.zelan.GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.zelan.Engine.Downloader;


public class PodGui extends JFrame{
	

	/**
	 * @author Evgeny Kornachev
	 */
	private static final long serialVersionUID = 1L;

	PodGui(){
		setParamsAndInitialization();
		setAddListener();
		buildGUI();
		setVisible(true);	
	}
	
	
	
	
	private void buildGUI() {
		
		/*
		 * Setting coordinates and sizes of components
		 * All components are placed on the frame
		 */
		l_InfoTop.setBounds(5, 4, 305, 80);
		p_Download.setBounds(0, 90, 320, 152);
		b_DownloadAll.setBounds(9, 4, 294, 44);
		b_DownloadFromTo.setBounds(9, 54, 294, 44);
		b_DownloadOne.setBounds(9, 104, 294, 44);
		l_DownloadAll.setBounds(9, 4, 240, 94);
		b_Size.setBounds(9, 104, 240, 44);
		b_Return_.setBounds(258, 4, 46, 144);
		l_From.setBounds(9, 4, 146, 46);
		l_To.setBounds(9, 52, 146, 46);
		tf_NumFrom.setBounds(159, 4, 90, 46);
		tf_NumTo.setBounds(159, 52, 90, 46);
		l_Num.setBounds(9, 4, 146, 48);
		tf_Num.setBounds(159, 4, 90, 48);
		b_Start.setBounds(9, 250, 294, 50);
		b_Yes.setBounds(9, 250, 144, 50);
		b_No.setBounds(162, 250, 144, 50);
		l_InfoDownload.setBounds(5, 306, 305, 30);
		
		//add components on JFrame
		add(l_InfoTop);
		add(p_Download);
		add(b_Start);
		add(b_Yes);
		add(b_No);
		add(l_InfoDownload);	
		p_Download.add(b_DownloadAll);
		p_Download.add(b_DownloadFromTo);		
		p_Download.add(b_DownloadOne);				
		p_Download.add(l_DownloadAll);						
		p_Download.add(b_Size);							
		p_Download.add(b_Return_);					
		p_Download.add(l_From);						
		p_Download.add(l_To);						
		p_Download.add(tf_NumFrom);						
		p_Download.add(tf_NumTo);									
		p_Download.add(l_Num);						
		p_Download.add(tf_Num);							
	}
	
	private void setAddListener() {
		listener=new MyEventListener(this);
		
		tf_NumFrom.addKeyListener(new MyEventListener(this, tf_NumFrom));
		tf_NumTo.addKeyListener(new MyEventListener(this, tf_NumTo));
		tf_Num.addKeyListener(new MyEventListener(this, tf_Num));
		
		b_Return_.addMouseListener(listener);
		b_DownloadAll.addMouseListener(listener);
		b_DownloadFromTo.addMouseListener(listener);
		b_DownloadOne.addMouseListener(listener);
		b_Start.addMouseListener(listener);
		b_Yes.addMouseListener(listener);
		b_No.addMouseListener(listener);
		b_Size.addMouseListener(listener);
	
	}

	private void setParamsAndInitialization(){
		
		/*
		 * set JFtame's params
		 */
		setSize(320, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new GridLayout(2,2));
		setTitle("Downloader");
		setLayout(null);
		

		p_Download.setLayout(null); 
		
		//hide the components that should be invisible when you first start
		b_Size.setVisible(false);
		b_Return_.setVisible(false);
		l_DownloadAll.setVisible(false);
		l_From.setVisible(false);
		l_To.setVisible(false);
		tf_NumFrom.setVisible(false);
		tf_NumTo.setVisible(false);
		l_Num.setVisible(false);		
		tf_Num.setVisible(false);
		b_Start.setVisible(false);
		b_Yes.setVisible(false);
		b_No.setVisible(false);
		
		//Setting names for button(JLable use as button)
		b_DownloadAll.setName("button_DownloadAll");
		b_DownloadFromTo.setName("button_DownloadFromTo");
		b_DownloadOne.setName("button_DownloadOne");		 
		b_Return_.setName("keyBack");
		b_Start.setName("keyStart");		 
		b_Yes.setName("keyYes");
		b_No.setName("keyNo");
		b_Size.setName("keyCheckSize");
		 
		//Setting color and text position for all JLabel and buttons(JLable use as button)
		l_InfoTop.setBackground(color_Label_Info);
		l_InfoTop.setOpaque(true);
		l_InfoTop.setHorizontalAlignment(JLabel.CENTER);
		 
		b_DownloadAll.setBackground(color_Button_Exited);
		b_DownloadAll.setOpaque(true);
		b_DownloadAll.setHorizontalAlignment(JLabel.CENTER);
		 
		b_DownloadFromTo.setBackground(color_Button_Exited);
		b_DownloadFromTo.setOpaque(true);
		b_DownloadFromTo.setHorizontalAlignment(JLabel.CENTER);
		 
		b_DownloadOne.setBackground(color_Button_Exited);
		b_DownloadOne.setOpaque(true);
		b_DownloadOne.setHorizontalAlignment(JLabel.CENTER);
		 
		l_InfoDownload.setBackground(color_Label_Info);
		l_InfoDownload.setOpaque(true);
		l_InfoDownload.setHorizontalAlignment(JLabel.CENTER);
		 
		l_DownloadAll.setBackground(color_Label_Info);
		l_DownloadAll.setOpaque(true);
		l_DownloadAll.setHorizontalAlignment(JLabel.CENTER);
		 
		 
		tf_NumFrom.setBackground(color_TextField_Right);
		tf_NumFrom.setOpaque(true);
		tf_NumFrom.setHorizontalAlignment(JLabel.CENTER);
		 
		tf_NumTo.setBackground(color_TextField_Right);
		tf_NumTo.setOpaque(true);
		tf_NumTo.setHorizontalAlignment(JLabel.CENTER);
		 
		tf_Num.setBackground(color_TextField_Right);
		tf_Num.setOpaque(true);
		tf_Num.setHorizontalAlignment(JLabel.CENTER);
		 
		 
		l_From.setBackground(color_Label_Info);
		l_From.setOpaque(true);
		l_From.setHorizontalAlignment(JLabel.CENTER);
		 
		l_To.setBackground(color_Label_Info);
		l_To.setOpaque(true);
		l_To.setHorizontalAlignment(JLabel.CENTER);
		 
		l_Num.setBackground(color_Label_Info);
		l_Num.setOpaque(true);
		l_Num.setHorizontalAlignment(JLabel.CENTER);
		 
		 
		b_Size.setBackground(color_Component_Disactive);
		b_Size.setOpaque(true);
		b_Size.setHorizontalAlignment(JLabel.CENTER);
		 
		b_Start.setBackground(color_Button_Exited);
		b_Start.setOpaque(true);
		b_Start.setHorizontalAlignment(JLabel.CENTER);
		
		b_Return_.setBackground(color_Button_Exited);
		b_Return_.setOpaque(true);
		b_Return_.setAlignmentY(BOTTOM_ALIGNMENT);
		b_Return_.setHorizontalAlignment(JLabel.CENTER);
		 		 
		b_Yes.setBackground(color_Button_Exited);
		b_Yes.setOpaque(true);
		b_Yes.setHorizontalAlignment(JLabel.CENTER);
		 
		b_No.setBackground(color_Button_Exited);
		b_No.setOpaque(true);
		b_No.setHorizontalAlignment(JLabel.CENTER);
		 
		b_Size.setBackground(color_Button_Exited);
		b_Size.setOpaque(true);
		b_Size.setHorizontalAlignment(JLabel.CENTER);
				 
	}
	
	
	//Rebuild menu if you choose "Download All"
	public void setMenu_DownloadAll(){
		
		l_From.setVisible(false);
		l_To.setVisible(false);
		l_Num.setVisible(false);
		
		tf_NumFrom.setVisible(false);
		tf_NumTo.setVisible(false);
		tf_Num.setVisible(false);
		
		b_DownloadAll.setVisible(false);
		b_DownloadFromTo.setVisible(false);
		b_DownloadOne.setVisible(false);
				
		b_Start.setVisible(true);
		b_Size.setVisible(true);
		b_Return_.setVisible(true);
		l_DownloadAll.setVisible(true);
		
	}
	
	//Rebuild menu if you choose "Download From-To"
	public void setMenu_DownloadFromTo(){
		
		l_DownloadAll.setVisible(false);
		l_From.setVisible(true);
		l_Num.setVisible(false);
		
		tf_Num.setVisible(false);
		
		b_DownloadAll.setVisible(false);
		b_DownloadFromTo.setVisible(false);
		b_DownloadOne.setVisible(false);
		
		b_Start.setVisible(true);
		b_Size.setVisible(true);
		b_Return_.setVisible(true);
		l_To.setVisible(true);
		tf_NumFrom.setVisible(true);
		tf_NumTo.setVisible(true);		
	}
	
	//Rebuild menu if you choose "Download One"
	public void setMenu_DownloadOne(){
		
		 l_DownloadAll.setVisible(false);
		 l_From.setVisible(false);
		 l_To.setVisible(false);
		 tf_NumFrom.setVisible(false);
		 tf_NumTo.setVisible(false);

		 b_DownloadAll.setVisible(false);
		 b_DownloadFromTo.setVisible(false);
		 b_DownloadOne.setVisible(false);
		 
		 l_Num.setVisible(true);
		 tf_Num.setVisible(true);
		 b_Size.setVisible(true);
		 b_Return_.setVisible(true);
		 b_Start.setVisible(true);		
	}
	
	//Rebuild menu(start menu) if you choose "Go Back"
	public void setMenu_ChooseDownload(){

		 b_Size.setVisible(false);
		 b_Return_.setVisible(false);
		 
		 l_DownloadAll.setVisible(false);
		 l_Num.setVisible(false);
		 l_From.setVisible(false);
		 l_To.setVisible(false);
		 tf_NumFrom.setVisible(false);
		 tf_NumTo.setVisible(false);
		 tf_Num.setVisible(false);
		 

		 b_Start.setVisible(false);		 
		 b_Yes.setVisible(false);
		 b_No.setVisible(false);
		 
		 b_DownloadAll.setVisible(true);
		 b_DownloadFromTo.setVisible(true);
		 b_DownloadOne.setVisible(true);
		 

		 b_DownloadAll.setBackground(color_Button_Exited);
		 b_DownloadFromTo.setBackground(color_Button_Exited);
		 b_DownloadOne.setBackground(color_Button_Exited);
		 
		 l_InfoDownload.setText("Select the download option");
		 l_InfoDownload.setBackground(color_Label_Info);
		 
	}
	
	//Rebuild menu if you push button "Start" in mode "Download All"
	public void setMenu_Start_WhenDownloadAll(){
		
		 b_Start.setVisible(false);
		 
		 b_Yes.setVisible(true);
		 b_No.setVisible(true);

		 b_Return_.setName("");
		 b_Size.setName("");
		 
		 l_InfoTop.setBackground(color_Component_Disactive);
		 l_DownloadAll.setBackground(color_Component_Disactive);
		 b_Return_.setBackground(color_Component_Disactive);
		 b_Size.setBackground(color_Component_Disactive);
	}
	
	//Rebuild menu if you push button "Start" in mode "Download From-To"
	public void setMenu_Start_WhenDownloadFromTo(){
		 b_Start.setVisible(false);
		 
		 b_Yes.setVisible(true);
		 b_No.setVisible(true);
		 
		 b_Return_.setName("");
		 b_Size.setName("");
		 
		 b_Return_.setBackground(color_Component_Disactive);
		 b_Size.setBackground(color_Component_Disactive);
		 l_InfoTop.setBackground(color_Component_Disactive);
		 l_From.setBackground(color_Component_Disactive);
		 l_To.setBackground(color_Component_Disactive);
		 tf_NumFrom.setBackground(color_Component_Disactive);
		 tf_NumTo.setBackground(color_Component_Disactive);
		 
		 tf_NumFrom.disable();
		 tf_NumTo.disable();
		
	}
	
	//Rebuild menu if you push button "Start" in mode "Download One"
	public void setMenu_Start_WhenDownloadOne(){ 

		 b_Start.setVisible(false);
		 
		 b_Yes.setVisible(true);
		 b_No.setVisible(true);
		 
		 b_Return_.setName("");
		 b_Size.setName("");
		 
		 
		 l_InfoTop.setBackground(color_Component_Disactive);
		 l_InfoDownload.setBackground(color_Label_Info);
		 b_Return_.setBackground(color_Component_Disactive);
		 l_Num.setBackground(color_Component_Disactive);
		 b_Size.setBackground(color_Component_Disactive);
		 tf_Num.setBackground(color_Component_Disactive);
		 
		 tf_Num.disable();
		
	}
	
	//Rebuild menu if you push button "No" in mode "Download All"
	public void setMenu_No_WhenDownloadAll(){
		b_Yes.setVisible(false);
		b_No.setVisible(false);
		
		b_Start.setVisible(true);
		
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
				 
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		l_InfoTop.setBackground(color_Label_Info);
		l_From.setBackground(color_Label_Info);
	 l_To.setBackground(color_Label_Info);
		
		l_InfoDownload.setText("");
		
	}
	
	//Rebuild menu if you push button "No" in mode "Download From-To"
	public void setMenu_No_WhenDownloadFromTo(){
		b_Yes.setVisible(false);
		b_No.setVisible(false);
		
		b_Start.setVisible(true);
		
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		 
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		l_InfoTop.setBackground(color_Label_Info);
		l_From.setBackground(color_Label_Info);
		l_To.setBackground(color_Label_Info);		
		
		tf_NumFrom.setBackground(color_TextField_Right);
		tf_NumTo.setBackground(color_TextField_Right);
		
		tf_NumFrom.enable();
		tf_NumTo.enable();
		
		l_InfoDownload.setText("");
	}
	
	//Rebuild menu if you push button "No" in mode "Download One"
	public void setMenu_No_WhenDownloadOne(){
		b_Yes.setVisible(false);
		b_No.setVisible(false);
		
		b_Start.setVisible(true);
		
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		 
		l_Num.setBackground(color_Label_Info);
		l_InfoTop.setBackground(color_Label_Info);
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		
		tf_Num.setBackground(color_TextField_Right);
		
		tf_Num.enable();
		
		l_InfoDownload.setText("");
	}
	
	//Rebuild menu if you push button "Check Size" in mode "Download All"
	public void setMenu_Size_WhenDowloadAllBegin() {
		l_InfoTop.setBackground(color_Component_Disactive);
		l_DownloadAll.setBackground(color_Component_Disactive);
		b_Return_.setBackground(color_Component_Disactive);
		b_Size.setBackground(color_Component_Disactive);
		b_Start.setBackground(color_Component_Disactive);

		b_Return_.setName("");
		b_Size.setName("");
		b_Start.setName("");
	}
	
	//Rebuild menu if you push button "Check Size" in mode "Download From-To"	
	public void setMenu_Size_WhenDowloadFromToBegin(){

		
		l_InfoTop.setBackground(color_Component_Disactive);
		b_Return_.setBackground(color_Component_Disactive);
		b_Size.setBackground(color_Component_Disactive);
		b_Start.setBackground(color_Component_Disactive);
		l_From.setBackground(color_Component_Disactive);
		l_To.setBackground(color_Component_Disactive);
		tf_NumFrom.setBackground(color_Component_Disactive);
		tf_NumTo.setBackground(color_Component_Disactive);
		l_InfoDownload.setBackground(color_Label_Info);
		
		tf_NumFrom.disable();
		tf_NumTo.disable();
		

		b_Return_.setName("");
		b_Size.setName("");
		b_Start.setName("");
		
		
	}
	
	//Rebuild menu if you push button "Check Size" in mode "Download One"
	public void setMenu_Size_WhenDowloadOneBegin(){
		l_InfoTop.setBackground(color_Component_Disactive);
		b_Return_.setBackground(color_Component_Disactive);
		b_Size.setBackground(color_Component_Disactive);
		b_Start.setBackground(color_Component_Disactive);
		l_Num.setBackground(color_Component_Disactive);
		tf_Num.setBackground(color_Component_Disactive);
		l_InfoDownload.setBackground(color_Label_Info);
	
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		b_Start.setName("keyStart");
		
		tf_Num.disable();
		
		
	}
	
	//Rebuild menu when got size of files in mode "Download All" 
	public void setMenu_Size_WhenDownloadAllFinish(){
		l_InfoTop.setBackground(color_Label_Info);
		l_DownloadAll.setBackground(color_Label_Info);
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		b_Start.setBackground(color_Button_Exited);
		
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		b_Start.setName("keyStart");
	}
	
	//Rebuild menu when got size of files in mode "Download From-To" 
	public void setMenu_Size_WhenDownloadFromToFinish(){
		l_InfoTop.setBackground(color_Label_Info);
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		b_Start.setBackground(color_Button_Exited);
		l_From.setBackground(color_Label_Info);
		l_To.setBackground(color_Label_Info);
		tf_NumFrom.setBackground(color_TextField_Right);
		tf_NumTo.setBackground(color_TextField_Right);
		l_InfoDownload.setBackground(color_Label_Info);
		
		tf_NumFrom.enable();
		tf_NumTo.enable();
	
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		b_Start.setName("keyStart");
	}
	
	//Rebuild menu when got size of files in mode "Download One" 
	public void setMenu_Size_WhenDownloadOneFinish(){
		l_InfoTop.setBackground(color_Label_Info);
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		b_Start.setBackground(color_Button_Exited);
		l_Num.setBackground(color_Label_Info);
		tf_Num.setBackground(color_TextField_Right);	
		l_InfoDownload.setBackground(color_Label_Info);
	
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		b_Start.setName("keyStart");
				
		tf_Num.enable();
	}
	
	//Rebuild menu when begin download files in mode "Download All" 
	public void setMenu_Yes_WhenDownloadAllBegin(){
		b_Yes.setVisible(false);
		b_No.setVisible(false);
		
		b_Start.setVisible(true);
		
		l_InfoTop.setBackground(color_Component_Disactive);
		l_DownloadAll.setBackground(color_Component_Disactive);
		l_InfoDownload.setBackground(color_Label_Info);
		b_Start.setBackground(color_Component_Disactive);
		
		
		b_Return_.setName("");
		b_Size.setName("");
		b_Start.setName("");
		
	}
	
	//Rebuild menu when begin download files in mode "Download From-To"
	public void setMenu_Yes_WhenDownloadFromToBegin(){
		b_Yes.setVisible(false);
		b_No.setVisible(false);
		
		b_Start.setVisible(true);
		
		b_Start.setBackground(color_Component_Disactive);
		
		b_Return_.setName("");
		b_Size.setName("");
		b_Start.setName("");
		
		tf_NumFrom.disable();
		tf_NumTo.disable();
		
	}
	
	//Rebuild menu when begin download files in mode "Download One"
	public void setMenu_Yes_WhenDownloadOneBegin() {
		b_Yes.setVisible(false);
		b_No.setVisible(false);
		
		b_Start.setVisible(true);

		b_Start.setBackground(color_Component_Disactive);


		tf_Num.disable();

		b_Return_.setName("");
		b_Size.setName("");
		b_Start.setName("");
		
	}
	
	//Rebuild menu when file download is complete in mode "Download All" 
	public void setMenu_Yes_WhenDownloadAllFinish(){
		l_InfoTop.setBackground(color_Label_Info);
		l_From.setBackground(color_Label_Info);
		l_To.setBackground(color_Label_Info);
		l_InfoDownload.setBackground(color_Label_Info);
		
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		b_Start.setBackground(color_Button_Exited);

		tf_NumFrom.setBackground(color_TextField_Right);
		tf_NumTo.setBackground(color_TextField_Right);		
	
		tf_NumFrom.enable();
		tf_NumTo.enable();
			
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		b_Start.setName("keyStart");
	}
	
	//Rebuild menu when file download is complete in mode "Download From-To" 	
	public void setMenu_Yes_WhenDownloadFromToFinish() {
		l_InfoDownload.setBackground(color_Label_Info);
		l_From.setBackground(color_Label_Info);
		l_To.setBackground(color_Label_Info);
		l_InfoTop.setBackground(color_Label_Info);
		
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		b_Start.setBackground(color_Button_Exited);
		
		tf_NumTo.setBackground(color_TextField_Right);
		tf_NumFrom.setBackground(color_TextField_Right);

		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		b_Start.setName("keyStart");
		
		tf_NumFrom.enable();
		tf_NumTo.enable();
	}
	
	//Rebuild menu when file download is complete in mode "Download One" 
	public void setMenu_Yes_WhenDownloadOneFinish(){
		l_InfoTop.setBackground(color_Label_Info);
		l_DownloadAll.setBackground(color_Label_Info);
		l_InfoDownload.setBackground(color_Label_Info);
		l_Num.setBackground(color_Label_Info);
		
		b_Return_.setBackground(color_Button_Exited);
		b_Size.setBackground(color_Button_Exited);
		b_Start.setBackground(color_Button_Exited);

		tf_Num.setBackground(color_TextField_Right);
		
		b_Return_.setName("keyBack");
		b_Size.setName("keyCheckSize");
		b_Start.setName("keyStart");
				
		tf_Num.enable();
	}
	

	public void repaintComponentsWhenCursorEntered(String name) {
		if(name.equals("keyStart"))							repaintButton(b_Start, color_Button_Entered, 8, 247, 298, 54, Cursor.HAND_CURSOR);
		else if(name.equals("button_DownloadAll"))			repaintButton(b_DownloadAll,color_Button_Entered, 8, 1, 298, 50, Cursor.HAND_CURSOR);
		else if(name.equals("button_DownloadFromTo"))		repaintButton(b_DownloadFromTo, color_Button_Entered, 8, 51, 298, 50, Cursor.HAND_CURSOR);
		else if(name.equals("button_DownloadOne"))			repaintButton(b_DownloadOne, color_Button_Entered, 8, 101, 298, 50, Cursor.HAND_CURSOR);
		else if(name.equals("keyBack"))						repaintButton(b_Return_, color_Button_Entered, 255, 1, 52, 150, Cursor.HAND_CURSOR);
		else if(name.equals("keyYes"))						repaintButton(b_Yes, color_Button_Entered, 8, 248, 146, 54, Cursor.HAND_CURSOR);
		else if(name.equals("keyNo"))						repaintButton(b_No, color_Button_Entered, 161, 248, 146, 54, Cursor.HAND_CURSOR);
		else if(name.equals("keyCheckSize"))				repaintButton(b_Size, color_Button_Entered, 8, 102, 242, 48, Cursor.HAND_CURSOR);
	}

	public void repaintComponentsWhenCursorExited(String name) {
		if(name.equals("keyStart"))							repaintButton(b_Start, color_Button_Exited, 9, 250, 294, 50, 0);
		else if(name.equals("button_DownloadAll"))			repaintButton(b_DownloadAll, color_Button_Exited, 9, 4, 294, 44, 0);
		else if(name.equals("button_DownloadFromTo"))		repaintButton(b_DownloadFromTo, color_Button_Exited, 9, 54, 294, 44, 0);
		else if(name.equals("button_DownloadOne"))			repaintButton(b_DownloadOne, color_Button_Exited, 9, 104, 294, 44, 0);
		else if(name.equals("keyBack"))						repaintButton(b_Return_, color_Button_Exited, 258, 4, 46, 144, 0);
		else if(name.equals("keyYes"))						repaintButton(b_Yes, color_Button_Exited, 9, 250, 144, 50, 0);
		else if(name.equals("keyNo"))						repaintButton(b_No, color_Button_Exited, 162, 250, 144, 50, 0);
		else if(name.equals("keyCheckSize"))			repaintButton(b_Size, color_Button_Exited, 9, 104, 240, 44, 0);
	}
	
	private void repaintButton(JLabel label, Color color, int x, int y, int width, int height, int cursor){
		label.setBackground(color);
		label.setBounds(x, y, width, height);
		if(cursor!=0){
			label.setCursor(new Cursor(cursor));
		}
	}
	
	public JLabel getInfoDownload_Label() {
		return l_InfoDownload;
	}
	
	public String getStringFrom_NumFrom(){
		return tf_NumFrom.getText();
	}
	
	public String getStringFrom_NumTo(){
		return tf_NumTo.getText();
	}
	
	public String getStringFrom_Num(){
		return tf_Num.getText();
	}
	
	public void setTextInfoDownload(String string){
		l_InfoDownload.setText(string);
	}

	public void errorEnterNum(String string){
		l_InfoDownload.setText(string);
		l_InfoDownload.setBackground(Color.red);
		Toolkit.getDefaultToolkit().beep();
	}
	
	
	private JPanel p_Download=new JPanel();

	private JLabel l_InfoTop=new JLabel(/*panel_300_100*/"<html>The number of podcasts available:   "+ Downloader.getNumMaxStr()+"</html>");
	private JLabel l_InfoDownload=new JLabel("Select the download option");
	
	
	private JLabel l_DownloadAll=new JLabel("<html>____________Attention!____________<br>___will be dowloaded "+ Downloader.getNumMax() +" podcasts___"
									+"<br>_____Check their TotalSize before____<br>___________downloading__________");
	
	
	private JLabel l_From=new JLabel("From");
	private JLabel l_To=new JLabel("To");
	private JLabel l_Num=new JLabel("Num");

	//I Use this Labels as buttons (with help MouseListener)
	private JLabel b_DownloadAll=new JLabel("Download ALL");
	private JLabel b_DownloadFromTo=new JLabel("Download From-To");
	private JLabel b_DownloadOne=new JLabel("Download One");
	private JLabel b_Size=new JLabel("CHECK SIZE");
	private JLabel b_Start=new JLabel("Start");
	private JLabel b_Yes=new JLabel("Yes");
	private JLabel b_No=new JLabel("No");
	private JLabel b_Return_=new JLabel("Go back");

	private JTextField tf_NumFrom=new JTextField();
	private JTextField tf_NumTo=new JTextField();
	private JTextField tf_Num=new JTextField();

	private MyEventListener listener;

	Color color_TextField_Wrong=new Color(255,189,189);
	Color color_TextField_Right=new Color(168,255,168);
	private	Color color_Button_Exited=new Color(160,195,255);
	private	Color color_Label_Info=new Color(190,150,148);
 	private	Color color_Button_Entered=new Color(73,138,242);
 	private	Color color_Component_Disactive=new Color(200,200,200);
	


	public static void main(String[] args){
		new PodGui();
	}


}
