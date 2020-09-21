package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JFrameTest {
	public static void main(String[] args){
		 EventQueue.invokeLater(() ->
         {
            JFrame frame = new MyFrame();
            //frame.setTitle("SizedFrame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
         });

	}
}
