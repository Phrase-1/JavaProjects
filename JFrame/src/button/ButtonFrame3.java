package button;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a button panel
 */
public class ButtonFrame3 extends JFrame  // 不带panel，两个按钮。即：button也可以直接加到frame中
{
   //private JPanel buttonPanel;
   private JButton button1 = new JButton("按键");
   private JButton yellowButton = new JButton("Yellow");
   
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;
 

   public ButtonFrame3()
   {      
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      
     // setLayout(null); //与setBounds联合用
      // button1.setPreferredSize(new Dimension(110,24));// not work
      //button1.setBounds(9,9,119,29);
     // setLayout(null); 
     // yellowButton.setBounds(9,9,219,29);
      //yellowButton.setBounds(9,9,119,29);
      
      add(button1);      
      add(yellowButton);
      this.setLayout(new FlowLayout(FlowLayout.LEFT));  //流式布局，去掉试试
      
      // associate actions with buttons
      button1.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent event)
          {    	                            	     	                           
    	          	JButton b = (JButton)event.getSource();
    	            	b.setText("I am clicked!");
    	 
            }
        });
      
      yellowButton.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent event)
         {    	                            	     	                           
      	     
        	 yellowButton.setBackground(Color.yellow);       	
        	 yellowButton.setOpaque(true);//foreground设置透明
        	 yellowButton.setBorderPainted(false); //最后显示黄色
      	    
        	

         }
      });
     
     
   }

}
