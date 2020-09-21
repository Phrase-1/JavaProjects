package buttonListener;

import java.awt.EventQueue;

import javax.swing.JFrame;

import button.ButtonFrame;

public class ButtonFrameTest {
	public static void main(String[] args) {
	      EventQueue.invokeLater(() -> {
	    	  
	          JFrame frame = new ButtomFrame();
	          
	          frame.setTitle("Test");
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.setVisible(true);
	       });
	}

}
