package button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a button panel
 */
public class ButtonFrame2 extends JFrame
{
   private JPanel buttonPanel;
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;
 

   public ButtonFrame2()
   {      
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      // create buttons
      JButton yellowButton = new JButton("Yellow");
     
      JButton blueButton = new JButton("Blue");
      JButton redButton = new JButton("Red");

      buttonPanel = new JPanel();

      // add buttons to panel
      buttonPanel.add(yellowButton);
      buttonPanel.add(blueButton);
      buttonPanel.add(redButton);
  
      // add panel to frame
      add(buttonPanel);

      // associate actions with buttons
      yellowButton.addActionListener(new ActionListener()
                                    {
    	                               public void actionPerformed(ActionEvent event)
                                       {
    	                            	   
    	                            	   buttonPanel.setBackground(Color.YELLOW);
    	  
    	                            	   	JButton b = (JButton)event.getSource();
    	                            	   	b.setText("I am clicked!");
    	 
                                       }
                                    });
      blueButton.addActionListener(new ActionListener()
      								{
    	  								public void actionPerformed(ActionEvent event)
    	  								{
      	   
    	  									buttonPanel.setBackground(Color.blue);

    	  									JButton b = (JButton)event.getSource();
    	  									b.setText("I am clicked!");

    	  								}
      								});
      redButton.addActionListener(new ActionListener()
      							{
    	  							public void actionPerformed(ActionEvent event)
    	  							{     	   
    	  								buttonPanel.setBackground(Color.red);
    	  								JButton b = (JButton)event.getSource();
    	  								b.setText("I am clicked!");
    	  							}
      							});
     
   }

}
