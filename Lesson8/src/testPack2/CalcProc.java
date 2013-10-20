package testPack2;
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class CalcProc implements ActionListener 
{
	Calculator calcReferer ; //reference to an object that events are processed
	int numberOfDelimiters = 0;
	Double argumentUno = 0.0;
	Double argumentDos = 0.0;
	Double theResault = 0.0;
	String whatWeDo = "";
	boolean actionBttnHasBeenClicked = false;
	
	CalcProc(Calculator calc)
   {
	   this.calcReferer = calc;
   }
	
	
   public void actionPerformed(ActionEvent e)
   {
	   String currentBttn = "";
	   
	   JButton clckdBttn =  (JButton)e.getSource();  //getting the clicked object
       
       String theBttnTxtField = (String)clckdBttn.getText();  //getting label of the clicked object
       char [] chArr = theBttnTxtField.toCharArray();       //as some labels are HTML I need to find the text
       currentBttn = LookOverHtmlArray(chArr);
       System.out.println(currentBttn);
       
       if (actionBttnHasBeenClicked)
       {
    	   calcReferer.writeDisplay(null);
    	   actionBttnHasBeenClicked = false;
       }
       
		switch (currentBttn)
		{
		case "1":calcReferer.writeDisplay(calcReferer.readDisplay()+"1");
				break;
		case "2":calcReferer.writeDisplay(calcReferer.readDisplay()+"2");
				break;
		case "3":calcReferer.writeDisplay(calcReferer.readDisplay()+"3");
				break;
		case "4":calcReferer.writeDisplay(calcReferer.readDisplay()+"4");
				break;
		case "5":calcReferer.writeDisplay(calcReferer.readDisplay()+"5");
				break;
		case "6":calcReferer.writeDisplay(calcReferer.readDisplay()+"6");
				break;
		case "7":calcReferer.writeDisplay(calcReferer.readDisplay()+"7");
				break;
		case "8":calcReferer.writeDisplay(calcReferer.readDisplay()+"8");
				break;
		case "9":calcReferer.writeDisplay(calcReferer.readDisplay()+"9");
				break;
		case "0":calcReferer.writeDisplay(calcReferer.readDisplay()+"0");
		break;
		case ",":  //only one delimiter is permitted
			{
			if (numberOfDelimiters == 0)
				{
				calcReferer.writeDisplay(calcReferer.readDisplay()+".");
				numberOfDelimiters++;
				}
			 }
			break;
		case "C":calcReferer.writeDisplay("0");
				break;
		case "+": {
					actionBttnHasBeenClicked = true;
					argumentUno = Double.valueOf(calcReferer.readDisplay());
					whatWeDo = "+";
					theResault = argumentUno + argumentDos;
					calcReferer.writeDisplay(String.valueOf(theResault));
					
	              }	break;
		case "=":
		{
			switch(whatWeDo)
			{	
				case "+":
				calcReferer.writeDisplay(String.valueOf( argumentUno+argumentDos));
				break;
			}
		}
	     
	              
		}
				
			
			
	}
       
      
      
       
      
   

   private String LookOverHtmlArray(char[] chArr) //finding of the meaning of a button with HTML label
   {
		int brCount = 0;
		char theText = ' ';
   
		
    if (chArr.length >1)  //if the button label has HTML code find the corn
    {    	   
 	   for (char chA : chArr)		//counts number of > brackets
 		   if (chA =='>') brCount++;
 	       	   
 	   for (int i=0; i<chArr.length; i++)	//look over the array to find the middle > bracket
 	   {
 		   if (chArr[i] == '>') brCount= (brCount/2)-1;
 		   if (brCount < 0) 
 			   {
	 			   theText = chArr[++i];         //take the next after the bracket symbol
	 			   break;
 			   }
 	   }
 		   
    }
    else theText = chArr[0];
    
    return String.valueOf(theText);
}
   
   
}
