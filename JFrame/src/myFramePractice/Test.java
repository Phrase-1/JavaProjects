package myFramePractice;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Test {
	ImageIcon i = new ImageIcon("beatDown.gif");
	
	public static void main(String[] args) {
	      EventQueue.invokeLater(() -> {
	    	  
	          JFrame frame = new MyFrame();
	          JLabel label = new JLabel(new Test().i);
	    	  
	    	  
	    	  frame.setSize(1800,1200);
	    	  frame.add(label);
	          
	          frame.setTitle("ImageTest");
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.setVisible(true);
	       });
	}

}
