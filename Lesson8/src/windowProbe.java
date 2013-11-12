import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class windowProbe 
{
	

	public static void main (String арг”менты“ута[])
	{	
		JFrame wndwF = new JFrame();//creating frame

		
		JPanel winPan = new JPanel() ;				//creating panel
		
		GridLayout fLO = new GridLayout(2,4,20,10);//creating Gridlayout
		
		//winPan.setLayout(new BoxLayout(winPan, BoxLayout.Y_AXIS));		//assigning Boxlayout to the panel
		winPan.setLayout(fLO);									//assigning Gridlayout to the panel
		                               //JButton jB1 = new JButton ("My Bttn");//creating button
		JTextField tF1 = new JTextField(5);
		JButton jB2 = new JButton ("Her Bttn");     //creating button
		JTextField tF2 = new JTextField(5);
		
		winPan.add(new JButton ("My Bttn1"));						//add the button to the frame
		winPan.add(tF1);
		winPan.add(jB2);						//add the button to the frame
		winPan.add(tF2);
		winPan.add(new JButton ("My Bttn2"));
		winPan.add(new JButton ("My Bttn3"));
		winPan.add(new JButton ("My Bttn4"));
		
		wndwF.setSize(800,600);
		wndwF.setTitle("My First Window");
		wndwF.setVisible(true);
		
		wndwF.setContentPane(winPan);//adding the panel inst to the frame instance
		
		
	}
}
