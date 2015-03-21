import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TaxGuiFile extends JFrame implements ActionListener 
{
    JLabel lblGrIncome;
    JTextField txtGrossIncome = new JTextField(15);
    JLabel lblDependents = new JLabel ("\tNumber of Dependents");
    JTextField txtDependents = new JTextField(2);
    JLabel lblState =new JLabel ("State: ");
    
    //Define a data model for the Combobox chState
    
    Vector states = new Vector(50);
    
    //create a combobox to get data from the model
    JComboBox chState = new JComboBox (states);
    
    JLabel lblTax = new JLabel("State Tax: ");
    JTextField txtStateTax = new JTextField(10);
    JButton bGo = new JButton("Go");
    JButton bReset = new JButton("Reset");
    
    TaxGuiFile()
    {
	lblGrIncome = new JLabel("Gross Income: ");
	GridLayout gr = new GridLayout(5,2,1,1);
	setLayout (gr);
	
	add(lblGrIncome);
	add(txtGrossIncome);
	add(lblDependents);
	add(txtDependents);
	add(lblState);
	add(chState);
	add(lblTax);
	add(txtStateTax);
	add(bGo);
	add(bReset);
	
	//Populate states from a file
	
	populateStates();
	
	chState.setSelectedIndex(0);
	
	txtStateTax.setEditable(false);
	
	bGo.addActionListener(this);
	bReset.addActionListener(this);
	
	//define, instantinate and register a WindowAdapter
	//to process windowClosing Event of this frame
	
	this.addWindowListener(new WindowAdapter()
	{
	    public void windowClosing(WindowEvent e)
	    {
		System.out.println("Good bye!");
		System.exit(0);
	    }
	});
		
    }
    
    public void actionPerformed(ActionEvent evt)
    {
	Object source = evt.getSource();
	if(source == bGo)
	{
	    //the button Go processing
	    try
	    {
		int grossInc = Integer.parseInt(txtGrossIncome.getText());
		int dependents = Integer.parseInt(txtDependents.getText());
		String state = (String)chState.getSelectedItem();
		
		Tax tax = new Tax(dependents,state,grossInc);
		String sTax = Double.toString(tax.calcTax());
		txtStateTax.setText(sTax);
	    }
	    catch (NumberFormatException e)
	    {
		txtStateTax.setText("\tNon-Numeric Data");
	    }
	    catch (Exception e)
	    {
		txtStateTax.setText(e.getMessage());
	    }
	}
	else 
	    if (source == bReset) //the button Reset processing
	    {
		txtGrossIncome.setText("");
		txtDependents.setText("");
		chState.setSelectedIndex(0);
		txtStateTax.setText("");
	    }
    }
    
    //the code below will read the file states.txt and 
    //populate the drop down chStates
    
    private void populateStates()
    {
	states.add("Select State");
	
	FileInputStream myFile = null;
	InputStreamReader inputStreamReader;
	BufferedReader reader = null;
	
	try
	{
	    myFile = new FileInputStream("states.txt");
	    inputStreamReader = new InputStreamReader(myFile, "UTF8");
	    reader = new BufferedReader(inputStreamReader);
	    
	    String nextLine;
	    boolean eof = false;
	    
	    while (!eof)
	    {
		nextLine = reader.readLine();
		if (nextLine == null)
		{
		    eof = true;
		}
		else
		{
		    //Populate the model
		    states.add(nextLine);
		}
	    }
	}
	catch (IOException e)
	{
	    txtStateTax.setText("\t!!! Can't read states.txt");
	}
	finally
	{
	    //Closing the streams
	    try
	    {
		if(myFile != null)
		{
		    reader.close();
		    myFile.close();
		}
	    }
	    catch (IOException e)
	    {
		e.printStackTrace();
	    }
	}
    }
    
    public static void main(String args [])
    {
	TaxGuiFile taxFrame = new TaxGuiFile();
	taxFrame.setSize(400, 150);
	taxFrame.setVisible(true);
    }
    
}
