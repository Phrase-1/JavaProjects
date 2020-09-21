package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	private JPanel panelNorth;
	private JPanel panelCenter;
	private JButton button1;
	private JButton button2;
	private TextField tf1;
	private TextField tf2;
	
	
	public MyFrame() throws HeadlessException {
		Toolkit kit = Toolkit.getDefaultToolkit();
	    Dimension screenSize = kit.getScreenSize();
	    int screenHeight = screenSize.height;
	    int screenWidth = screenSize.width;
	    
	    setSize(screenWidth / 2, screenHeight / 2);
	    
	    panelNorth = new JPanel();
	    panelCenter = new JPanel();
	    
	    button1 = new JButton("Button1");
	    button2 = new JButton("Button2");
	    tf1 = new TextField();
	    tf2 = new TextField();
	    
	    button1.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent event){
	    		tf1.setBackground(Color.lightGray);
	    		tf1.setText("My Name is ÍõÎÄì¿");
	    	}
	    });
	    button2.addActionListener(new ActionListener(){
	    	public void actionPerformed(ActionEvent event){
	    		tf2.setText("My seat number is 46");
	    	}
	    });
	    
	    
	    panelNorth.setLayout(new GridLayout(1,2));
	    panelNorth.add(button1);
	    panelNorth.add(button2);
	    
	    panelCenter.setLayout(new GridLayout(2,1));
	    panelCenter.add(tf1);
	    panelCenter.add(tf2);
		
	    this.add(panelNorth,BorderLayout.NORTH);
	    this.add(panelCenter,BorderLayout.CENTER);
	}



}
