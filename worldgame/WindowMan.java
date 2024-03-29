package worldgame;

import java.awt.Color;
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
		pan.setBackground(Color.black);
		
		g_pan = pan.getGraphics();
		g_img = img.createGraphics();
		
		frame.addKeyListener(new KeyMan());
	}
	
	public static void frame() {
		int a = (int)(((float)pan.getHeight()/(float)_Config.SCREEN_Y)*(float)_Config.SCREEN_X);
		g_pan.drawImage(img, pan.getWidth()/2-a/2, 0, a, pan.getHeight(), null);
		g_pan = pan.getGraphics();
		g_img.clearRect(0, 0, _Config.SCREEN_X, _Config.SCREEN_Y);
	}
	
	public static Graphics2D graphics() {
		return g_img;
	}
	
}
