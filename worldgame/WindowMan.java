package worldgame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowMan {
	
	static JFrame frame;
	static JPanel pan;
	static BufferedImage img;
	
	static Graphics g_pan;
	static Graphics2D g_img;
	
	public static void init() {
		frame = new JFrame();
		pan = new JPanel();
		frame.add(pan);
		
		img = new BufferedImage(_Config.SCREEN_X,_Config.SCREEN_Y,BufferedImage.TYPE_INT_RGB);
		frame.setSize(_Config.SCREEN_X, _Config.SCREEN_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		g_pan = pan.getGraphics();
		g_img = img.createGraphics();
	}
	
	public static void frame() {
		g_pan.drawImage(img, 0, 0, null);
		g_pan = pan.getGraphics();
	}
	
	public static Graphics2D graphics() {
		return g_img;
	}
	
}
