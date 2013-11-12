package trycom.javaleccion;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MyFrame extends javax.swing.JFrame
{
   public MyFrame()
   {
    
    JFrame myFrame = new JFrame();
    
    myFrame.setSize(400, 400);
    myFrame.setTitle("My Frame " + myFrame.getHeight() + "x" + myFrame.getWidth());
    myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    myFrame.setVisible(true);
    
    
    JPanel myPanel = new JPanel();
    BoxLayout myBoxLayout = new BoxLayout(myPanel, BoxLayout.Y_AXIS);
    myPanel.setLayout(myBoxLayout);
    myFrame.add(myPanel);
    
   }
    

}
