package myFramePractice;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyJPanel extends JPanel{
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	Image i = null;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	   /* BufferedImage imagePerson;
	    try {
	        imagePerson = ImageIO.read(new File("beatDown.gif"));
	    } catch (IOException e) {
	        imagePerson = null;
	    }*/
		
		/*try {
			i = ImageIO.read(new File("beatDown.gif"));
		} catch (Exception e) {
 
			e.printStackTrace();
			System.out.println("¶ÁÈ¡Í¼Æ¬³ö´í");
		}*/


		
		ImageIcon img = new ImageIcon("beatDown.gif");
		g.drawImage(img.getImage(),0,0,getWidth(),getHeight(),null);
		
	}
	public Dimension getpreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}

}
