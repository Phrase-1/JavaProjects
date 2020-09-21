package myFramePractice;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JPanel myPanel1;
	private JPanel myPanel2;
	private static final int DEFAULT_WIDTH = 1800;
	private static final int DEFAULT_HEIGHT = 1200;
	
	
	public MyFrame() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		myPanel1 = new JPanel();
		myPanel2 = new JPanel();
		
		myPanel1.setLayout(new GridLayout(3,1));
		myPanel2.setLayout(new GridLayout(2,1));
		JButton bitton1 = new JButton("大家好，我是练习市场两年半的练习生");
		JButton bitton2 = new JButton("才徐坤");
		JButton bitton3 = new JButton("唱，跳，RAP，篮球");
		myPanel1.add(bitton1);
		myPanel1.add(bitton2);
		myPanel1.add(bitton3);
		myPanel2.add(new MyJPanel());

		add(myPanel1,BorderLayout.WEST);
		add(myPanel2,BorderLayout.CENTER);
		
		//add(new MyJPanel());
		
		
		
	}
	
	class ClickAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}


