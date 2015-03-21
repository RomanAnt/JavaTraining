package com.practicalJava.lesson11;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import java.awt.*; 
import java.util.Random;
           
//  java.awt.Panel buttonsPanel;
public class MyTicTacToeApplet extends JApplet implements MouseListener {
     
         java.awt.Panel buttonsPanel;
         private static final String PLAYERX = "Player X";
         private static final String PLAYERO = "Player O";
     	
         private String playerName = PLAYERX;
         private javax.swing.JLabel playerNumber;
         private JButton[] buttons; //must declare on a class level !
         private JButton playAgain;
     
         public void init(){ 
        	 
		               initComponents();
	              }
             
         private  void initComponents(){
		  
		   JPanel windowContent = new JPanel();

		 // Set the layout manager for this panel
		  BorderLayout bl = new BorderLayout(); 
	         windowContent.setLayout(bl); 
	         
	     playAgain = new JButton("Play Again");
	     
	   	  windowContent.add("South",playAgain);
          playAgain.addMouseListener(this);
          
		 buttonsPanel = new Panel();	
	Font buttonFont =new Font ("Times New Roman", Font.PLAIN,60);
	buttonsPanel.setLayout(new GridLayout(4,3));
	
	            buttons = new JButton[9];//JButton buttons[] = new JButton   !NOT LIKE THAT!
	             for (int i=0;i<9 ;i++){
	            	 buttons[i]= new JButton();
	            	 buttons[i].addMouseListener(this);
	            	 buttons[i].setFont(buttonFont);
	            	 buttonsPanel.add(buttons[i]);
	             }
	
	
	playerNumber = new JLabel(playerName, SwingConstants.CENTER);
	 setPlayerName(PLAYERX); 
     buttonsPanel.add(playerNumber);
     windowContent.add("Center",buttonsPanel);
	add(windowContent);
	}             
	 private void setPlayerName(String playerName){
	        this.playerName = playerName;
	        playerNumber.setText(playerName  + " your turn. ");
	    }
		

	@Override
	public void mouseClicked(MouseEvent e) {
	JButton currentButton = (JButton)e.getComponent();
		    
			if (currentButton == playAgain) {
				playAgain.setEnabled(false);
				reset();
			}
		 
			else  if (currentButton.getText() == "" && currentButton.getText()!="Play Again"){
	         
	                currentButton.setText("X");
	                 checkForWinner();
			}
	              
	                	 computerMove();
	 	            	checkForWinner();
	                 
	 	            	
	            
	        
	        
	            
	      
	            	
	            
	                
	            
	           
	        
	         if (currentButton.getText() == "Play Again"){ 
	        	reset();
	        	
	        }
	}
	         public void checkForWinner(){
	           
	            
	            if(findThreeInARow()){
	            	// attention == check string not the reference to PLAYERX
	                String winnerName=(playerName == "X")?"PlayerX ":"Computer"; //see p.50 conditional operator 
	                playerNumber.setText(winnerName + "WON");
	                playAgain.setEnabled(true);
	            
	               
	           
	              
	            }
	          
	            
		
		
	}

	 
		private void reset() {
			for (JButton b : buttons) {
				b.setText("");
				b.setBackground(null);
				playerNumber.setText("Your turn!");
    	
     }
	}
		private boolean findThreeInARow() {
			if (buttons[0].getText() == buttons[1].getText()
					&& buttons[1].getText() == buttons[2].getText()
					&& buttons[0].getText() != "") {

				setColorBlue(0, 1, 2);
				playerName = buttons[0].getText();
				return true;

			} else if (buttons[3].getText() == buttons[4].getText()
					&& buttons[4].getText() == buttons[5].getText()
					&& buttons[3].getText() != "") {
				setColorBlue(3, 4, 5);
				playerName = buttons[3].getText();
				return true;

			} else if (buttons[6].getText() == buttons[7].getText()
					&& buttons[7].getText() == buttons[8].getText()
					&& buttons[6].getText() != "") {
				setColorBlue(6, 7, 8);
				playerName = buttons[6].getText();
				return true;

			} else if (buttons[0].getText() == buttons[3].getText()
					&& buttons[3].getText() == buttons[6].getText()
					&& buttons[0].getText() != "") {
				setColorBlue(0, 3, 6);
				playerName = buttons[0].getText();
				return true;

			} else if (buttons[1].getText() == buttons[4].getText()
					&& buttons[4].getText() == buttons[7].getText()
					&& buttons[1].getText() != "") {
				setColorBlue(1, 4, 7);
				playerName = buttons[1].getText();
				return true;

			} else if (buttons[2].getText() == buttons[5].getText()
					&& buttons[5].getText() == buttons[8].getText()
					&& buttons[2].getText() != "") {
				setColorBlue(2, 5, 8);
				playerName = buttons[2].getText();
				return true;

			} else if (buttons[0].getText() == buttons[4].getText()
					&& buttons[4].getText() == buttons[8].getText()
					&& buttons[0].getText() != "") {
				setColorBlue(0, 4, 8);
				playerName = buttons[0].getText();
				return true;

			} else if (buttons[2].getText() == buttons[4].getText()
					&& buttons[4].getText() == buttons[6].getText()
					&& buttons[2].getText() != "") {

				setColorBlue(2, 4, 6);
				playerName = buttons[2].getText();
				return true;
			}

			else
				return false;
		}

		
		private boolean checkEmptySquare()
		{
			for (int i = 0; i < buttons.length; i++) {
				if(buttons[i].getText() == "")
				{
					return true;
				}
				
		}
			return false;
		}
		
		
		private void computerMove() {
			Random r = new Random();
			int i = r.nextInt(9);
			if ((!buttons[i].getText().equals("")) &&(checkEmptySquare())) {
				computerMove();
			} else if(checkEmptySquare()){
				buttons[i].setText("O");
			}
		}
		private void setColorBlue(int b1, int b2, int b3) {
			
			// try if playerName== X Color.BLUE
			    // else color.RED
         //  if (playerName == "X"){
			buttons[b1].setOpaque(true);
			buttons[b1].setBackground(Color.BLUE);
			buttons[b2].setOpaque(true);
			buttons[b2].setBackground(Color.BLUE);
			buttons[b3].setOpaque(true);
			buttons[b3].setBackground(Color.BLUE);
		     
     
       
		}   

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
