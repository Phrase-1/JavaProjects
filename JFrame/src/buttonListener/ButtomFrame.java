package buttonListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtomFrame extends JFrame{
	private JPanel buttonPanel;
	private static final int DEFAULE_WIDTH = 300;
	private static final int DEFAULE_HEIGHT = 200;
	
	public ButtomFrame() {
		setSize(DEFAULE_WIDTH,DEFAULE_HEIGHT);
		JButton yellowButton = new JButton("Yellow");
		JButton blueButton = new JButton("Blue");
		JButton redButton = new JButton("Red");
		
		buttonPanel = new JPanel();
		
		buttonPanel.add(yellowButton);
		buttonPanel.add(blueButton);
		buttonPanel.add(redButton);
		
		this.add(buttonPanel);
		
		yellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				buttonPanel.setBackground(Color.yellow);
			}
		});
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				buttonPanel.setBackground(Color.blue);
			}
		});
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				buttonPanel.setBackground(Color.red);
			}
		});
	}
}
