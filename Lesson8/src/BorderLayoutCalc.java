import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutCalc 
{
	private static final long serialVersionUID = 1L;

//{
//	public windowProbe()
//	{
//		setSize(600,600);
//		setTitle("My First Window");
//		setVisible(true);
//	}

	
	public static void main (String арг”менты“ута[])
	{	
		JFrame wndwF = new JFrame("My own window");//creating frame

		
		JPanel winPan = new JPanel() ;//creating panel
		JPanel winPan2 = new JPanel();
		
		
		
		BorderLayout fLO = new BorderLayout();//creating layout
		FlowLayout fL2 = new FlowLayout();
		
		winPan.setLayout(fLO);		//assigning layout to the frame
		winPan2.setLayout(fL2);
		
		//JButton jB1 = new JButton ("My Bttn");//creating button
		JTextField tF1 = new JTextField(5);
		JButton jB2 = new JButton ("Her Bttn");//creating button
		JTextField tF2 = new JTextField(5);
		
		winPan.add(BorderLayout.SOUTH,winPan2);
		
		winPan2.add(new JButton ("My BttnS"));						//add the button to the frame
		winPan2.add(tF1);
		winPan.add(BorderLayout.CENTER, jB2);						//add the button to the frame
		winPan2.add(tF2);
		winPan.add(BorderLayout.EAST,new JButton ("My BttnE"));
		winPan.add(BorderLayout.WEST,new JButton ("My BttnW"));
		winPan.add(BorderLayout.NORTH,new JButton ("My BttnN"));
		
		wndwF.setSize(800,600);
		wndwF.setTitle("My First Window");
		wndwF.setVisible(true);
		
		wndwF.setContentPane(winPan);//adding the panel inst to the frame instance
		
		
	}
}
