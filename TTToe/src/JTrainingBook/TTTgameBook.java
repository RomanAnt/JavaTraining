package JTrainingBook;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class TTTgameBook extends JApplet implements MouseListener
{
    private static String PLAYERX = "Player X";
    public static String PLAYERO = "Player 0";
    private String playerName = PLAYERX;
    private JButton bttn1;
    private JButton bttn2;
    private JButton bttn3;
    private JButton bttn4;
    private JButton bttn5;
    private JButton bttn6;
    private JButton bttn7;
    private JButton bttn8;
    private JButton bttn9;
    
    private JLabel playerNumber;
    private Panel bttnsPanel;
    
    public void init()
    {
	initComponents();
    }

    private void initComponents() 
    {
	bttnsPanel = new Panel();
	bttn1 = new JButton();
	bttn2 = new JButton();
	bttn3 = new JButton();
	bttn4 = new JButton();
	bttn5 = new JButton();
	bttn6 = new JButton();
	bttn7 = new JButton();
	bttn8 = new JButton();
	bttn9 = new JButton();
	
	playerNumber = new JLabel(playerName, SwingConstants.CENTER);
	bttn1.addMouseListener(this);
	bttn2.addMouseListener(this);
	bttn3.addMouseListener(this);
	bttn4.addMouseListener(this);
	bttn5.addMouseListener(this);
	bttn6.addMouseListener(this);
	bttn7.addMouseListener(this);
	bttn8.addMouseListener(this);
	bttn9.addMouseListener(this);
	
	Font bttnFont = new Font("Times New Roman", Font.PLAIN, 60);
	
	bttn1.setFont(bttnFont);
	bttn2.setFont(bttnFont);
	bttn3.setFont(bttnFont);
	bttn4.setFont(bttnFont);
	bttn5.setFont(bttnFont);
	bttn6.setFont(bttnFont);
	bttn7.setFont(bttnFont);
	bttn8.setFont(bttnFont);
	bttn9.setFont(bttnFont);
	
	bttnsPanel.setLayout(new java.awt.GridLayout(4,3));
	
	JButton bttnArr[] = {bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9};
	for(JButton barr : bttnArr) bttnsPanel.add(barr);
	
	bttnsPanel.add(new Component(){});
	
	setPlayerName(PLAYERX);
	bttnsPanel.add(playerNumber);
	add(bttnsPanel);
    }
    
    private void setPlayerName(String playerName)
    {
	this.playerName = playerName;
	playerNumber.setText(playerName + ", твоя очередь.");
    }
    
    private void reset ()
    {
	JButton bttnArr[] = {bttn1, bttn2, bttn3, bttn4, bttn5, bttn6, bttn7, bttn8, bttn9};
	for (JButton bat : bttnArr) bat.setText("");
	setPlayerName (PLAYERX);
    }
    
    private void checkForWinner()
    {
	String [] str = {"OK"};
	
	if(findFullRow())
	{
	    String winnerName = (playerName == PLAYERX)? PLAYERO : PLAYERX;
	    
	    JOptionPane.showOptionDialog (this, winnerName.concat(" won ! Congrads!!"), "Congradulations!!", JOptionPane.YES_OPTION, JOptionPane.PLAIN_MESSAGE, null, str,"OK");
	    
	    reset();
	}
    }
    
    public void mouseClicked (MouseEvent evnt)
    {
	JButton currntBttn = (JButton) evnt.getComponent();
	if (currntBttn.getText() == "")
	{
	    if (playerName == PLAYERX)
	    {
		currntBttn.setText("X");
		setPlayerName(PLAYERO);
	    }
	    else if (playerName == PLAYERO)
	    {
		currntBttn.setText("0");
		setPlayerName (PLAYERX);
	    }
	}
	checkForWinner();
    }
    
    public void mousePressed (MouseEvent evnt) {}
    public void mouseReleased (MouseEvent evnt){}
    public void mouseEntered (MouseEvent evnt){}
    public void mouseExited (MouseEvent evnt) {}
    
    public boolean findFullRow()
    {
	if 	(  bttn1.getText() == bttn2.getText() && bttn2.getText() == bttn3.getText() && bttn1.getText() != ""
		|| bttn1.getText() == bttn4.getText() && bttn1.getText() == bttn7.getText() && bttn1.getText() != ""
		|| bttn7.getText() == bttn8.getText() && bttn7.getText() == bttn9.getText() && bttn7.getText() != ""
		|| bttn3.getText() == bttn6.getText() && bttn3.getText() == bttn9.getText() && bttn9.getText() != ""
		|| bttn1.getText() == bttn5.getText() && bttn1.getText() == bttn9.getText() && bttn9.getText() != ""
		|| bttn7.getText() == bttn5.getText() && bttn5.getText() == bttn3.getText() && bttn3.getText() != ""
		|| bttn4.getText() == bttn5.getText() && bttn5.getText() == bttn6.getText() && bttn4.getText() != ""
		|| bttn2.getText() == bttn5.getText() && bttn5.getText() == bttn8.getText() && bttn8.getText() != "") 
	    return true;
	else return false;
    }

    
    
    
}
