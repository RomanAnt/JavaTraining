package com.zelan.GUI;


import static com.zelan.Engine.Downloader.getNumMax;
import static com.zelan.Engine.Downloader.getSize;
import static com.zelan.Engine.Downloader.reset;
import static com.zelan.Engine.Downloader.setNum;
import static com.zelan.Engine.Downloader.setNumFrom;
import static com.zelan.Engine.Downloader.setNumTo;
import static com.zelan.Engine.Downloader.startDownload;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyEventListener extends MouseAdapter implements KeyListener{
	private PodGui gui;
	private eDownloadVar downloadVar;
	private JTextField tf;
	private int from;
	private int to;
	private int num;
	
	
	/*
 	 * constructor for MouseListener
 	 */
 	MyEventListener(PodGui gui){
		this.gui=gui;		
	}
 	
 	/*
 	 * constructor for KeyListener
 	 */
 	public MyEventListener(PodGui gui, JTextField tf){
		this.gui=gui;
		this.tf=tf;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		String nameComponent=e.getComponent().getName();
		
		/*
		 * push "Download All"
		 * set download mode as DownloadAll
		 */
		if(nameComponent.equals("button_DownloadAll")){
			downloadVar=eDownloadVar.DownloadAll;
			gui.setMenu_DownloadAll();
		}
		
		/*
		 * push "Download From-To"
		 * set download mode as DownloadFromTo
		 */
		else if(nameComponent.equals("button_DownloadFromTo")){
			downloadVar=eDownloadVar.DownloadFromTo;
			gui.setMenu_DownloadFromTo();
		}
		
		/*
		 * push "Download One"
		 * set download mode as DownloadOne
		 */
		else if(nameComponent.equals("button_DownloadOne")){
			downloadVar=eDownloadVar.DownloadOne;
			gui.setMenu_DownloadOne();
		}
		
		/*
		 * push "Go Back"
		 * reset all download parameters
		 */
		else if(nameComponent.equals("keyBack")){
			downloadVar=eDownloadVar.NotChoise;
			gui.setMenu_ChooseDownload(); 
								
			from=0;
			to=0;
			num=0;
			
			reset();	//from Downloader.java			
		}
		
		/*
		 * push "Start"
		 * Scenario depends on the download mode that set before
		 */
		else if(nameComponent.equals("keyStart")){
			
			//If download mode is DownloadAll
			if(downloadVar==eDownloadVar.DownloadAll){
				gui.setTextInfoDownload("Are you sure?");
				gui.setMenu_Start_WhenDownloadAll();
			//	System.out.println("keyStart");			
			}
			
			//If download mode is DownloadFromTo
			if(downloadVar==eDownloadVar.DownloadFromTo){
				try{
					
					from=Integer.parseInt(gui.getStringFrom_NumFrom());
					to=Integer.parseInt(gui.getStringFrom_NumTo());
				
					System.out.println(from);
					System.out.println(to);
					
						if(from > getNumMax())		gui.errorEnterNum("Field From > max value");
						else if(to>getNumMax())		gui.errorEnterNum("Field To> max value");
						else if(to<from)			gui.errorEnterNum("Value To < Value From");		
						else if(to==from)			gui.errorEnterNum("Value To = Value From");
						else if(to==0)				gui.errorEnterNum("Value To = 0");
						else if(from==0)			gui.errorEnterNum("Value From = 0");
						else{
							gui.setTextInfoDownload("Are you sure?");
							gui.setMenu_Start_WhenDownloadFromTo();
							System.out.println("keyStart");
						}
				}
				catch(Exception e2)	{				gui.errorEnterNum("Empty field or incorrect value");		}		
			}
	
			//If download mode is DownloadOne
			if(downloadVar==eDownloadVar.DownloadOne){
				try{
					num=Integer.parseInt(gui.getStringFrom_Num());
				
					if(num > getNumMax())		gui.errorEnterNum("Field Num > max values");
					else if(num==0)				gui.errorEnterNum("Value To = 0");				
					else{
						gui.setTextInfoDownload("Are you sure?");
						gui.setMenu_Start_WhenDownloadOne();
						System.out.println("keyStart");
					}
				}
				catch(Exception r){				gui.errorEnterNum("Empty field or incorrect value");		}						
			}	
		}
		
		/*
		 * push "Yes"
		 * Scenario depends on the download mode that set before
		 */
		else if(nameComponent.equals("keyYes")){
			
			//If download mode is DownloadAll
			if(downloadVar==eDownloadVar.DownloadAll){
				gui.setMenu_Yes_WhenDownloadAllBegin();
				
				Thread tr = startDownload_Thread();	//Create Thread because if start download without thread - GUI will not repaint
				tr.start();
			}
			
			//If download mode is DownloadFromTo
			else if(downloadVar==eDownloadVar.DownloadFromTo){
//				final JLabel jlabel=gui.getInfoDownload_Label();
				setNumFrom(from);
				setNumTo(to);
				
				gui.setMenu_Yes_WhenDownloadFromToBegin();
//				startDownload(downloadVar, jlabel);
//				gui.setMenu_Yes_WhenDownloadFromToFinish();
				Thread tr = startDownload_Thread();	//Create Thread because if start download without thread - GUI will not repaint
				tr.start();
			}
			
			//If download mode is DownloadOne
			else if(downloadVar==eDownloadVar.DownloadOne){
				
				setNum(num);
				
				gui.setMenu_Yes_WhenDownloadOneBegin();
				
				Thread tr = startDownload_Thread();	//Create Thread because if start download without thread - GUI will not repaint
				tr.start();
			}
		}
		
		/*
		 * push "No"
		 * Scenario depends on the download mode that set before
		 */
		else if(nameComponent.equals("keyNo")){
			if (downloadVar == eDownloadVar.DownloadAll)			gui.setMenu_No_WhenDownloadAll();
			else if (downloadVar == eDownloadVar.DownloadFromTo)		gui.setMenu_No_WhenDownloadFromTo();
			else if (downloadVar == eDownloadVar.DownloadOne)		gui.setMenu_No_WhenDownloadOne();
		}
		
		/*
		 * push "CHECK SIZE"
		 * Scenario depends on the download mode that set before
		 */
		else if(nameComponent.equals("keyCheckSize")){
		//	System.out.println("keyCheckSize");
			
			//If download mode is DownloadAll
			if(downloadVar==eDownloadVar.DownloadAll){
				gui.setMenu_Size_WhenDowloadAllBegin();
				
				Thread tr = getSize_Thread();	//Create Thread because if start getSize without thread - GUI will not repaint
				tr.start();
			}
			
			//If download mode is DownloadFromTo
			if(downloadVar==eDownloadVar.DownloadFromTo){
					try{
						from=Integer.parseInt(gui.getStringFrom_NumFrom());
						to=Integer.parseInt(gui.getStringFrom_NumTo());
						
							if(from > getNumMax())		gui.errorEnterNum("Field From > max value");
							else if(to>getNumMax())		gui.errorEnterNum("Field To> max value");
							else if(to<from)			gui.errorEnterNum("Value To < Value From");
							else if(to==from)			gui.errorEnterNum("Value To = Value From");
							else if(to==0)				gui.errorEnterNum("Value To = 0");
							else if(from==0)			gui.errorEnterNum("Value From = 0");		
							else{
								setNumFrom(from);
								setNumTo(to);
								gui.setMenu_Size_WhenDowloadFromToBegin();
								
								Thread tr = getSize_Thread();	//Create Thread because if start getSize without thread - GUI will not repaint
								tr.start();							
							}
					}
				catch(Exception e3){					gui.errorEnterNum("Empty field or incorrect value");}
			}
			
			//If download mode is DownloadAll
			if(downloadVar==eDownloadVar.DownloadOne){
				try{
					num=Integer.parseInt(gui.getStringFrom_Num());

					if(num > getNumMax())		gui.errorEnterNum("Field Num > max values");
					else if(num==0)				gui.errorEnterNum("Value To = 0");				
					else{
						setNum(num);				
						gui.setMenu_Size_WhenDowloadOneBegin();
						
						Thread tr = getSize_Thread();		//Create Thread because if start getSize without thread - GUI will not repaint
						tr.start();
					}
				}
				catch(Exception r){				gui.errorEnterNum("Empty field or incorrect value");		}			
			}			
		}		
	}

	
	//Thread for startDownload method from Downloader.java
	private Thread startDownload_Thread() {
		final JLabel jlabel=gui.getInfoDownload_Label();
		
		Thread tr=new Thread(new Runnable() {		
			@Override
			public void run() {
			
				startDownload(downloadVar, jlabel);
				if(downloadVar==eDownloadVar.DownloadAll)	gui.setMenu_Yes_WhenDownloadAllFinish();
				else if(downloadVar==eDownloadVar.DownloadFromTo)	gui.setMenu_Yes_WhenDownloadFromToFinish();
				else if(downloadVar==eDownloadVar.DownloadOne)	gui.setMenu_Yes_WhenDownloadOneFinish();
			}
		});
		return tr;
	}
	//Thread for getSize method from Downloader.java
	private Thread getSize_Thread() {
		final JLabel jlabel=gui.getInfoDownload_Label();
		
		Thread tr=new Thread(new Runnable() {				
			@Override
			public void run() {
				
				getSize(downloadVar, jlabel );
				if(downloadVar==eDownloadVar.DownloadAll)	gui.setMenu_Size_WhenDownloadAllFinish();
				else if(downloadVar==eDownloadVar.DownloadFromTo)	gui.setMenu_Size_WhenDownloadFromToFinish();
				else if(downloadVar==eDownloadVar.DownloadOne)	gui.setMenu_Size_WhenDownloadOneFinish();
			}
		});
		return tr;
	}
	
	
	//repaints component when cursor inside the component
	@Override
	public void mouseEntered(MouseEvent e) {
		String NameComponent=e.getComponent().getName();
		gui.repaintComponentsWhenCursorEntered(NameComponent);
	
	}

	//repaints component when cursor outside the component
	@Override
	public void mouseExited(MouseEvent e) {
		String NameComponent=e.getComponent().getName();
		gui.repaintComponentsWhenCursorExited(NameComponent);
	}
	
	
	private String string;	
	@Override
	public void keyPressed(KeyEvent e) {

		Character simbol=e.getKeyChar();
			
		if(!Character.isDigit(simbol)){
			tf.setBackground(gui.color_TextField_Wrong);
			string= tf.getText();
			string=string.replaceAll(Character.toString(simbol), "");
			tf.setText(string);
			Toolkit.getDefaultToolkit().beep();
		}	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		Character c=e.getKeyChar();
		
		if(!Character.isDigit(c)){
			if((int)c!=22){
				string= tf.getText();
				string=string.replaceAll(Character.toString(c), "");
				tf.setText(string);
				tf.setBackground(gui.color_TextField_Right);
			}
			else tf.setText(string);
		}	
	}
	
	//Don't use
	@Override
	public void keyTyped(KeyEvent e) {}

	


}
