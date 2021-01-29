package worldgame.graphics;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import worldgame._Config;

public class DrawMan {
	static float camx, camy;
	static Graphics2D g;
	
	public static void init(Graphics2D g, float camx, float camy) {
		DrawMan.g = g;
		DrawMan.camx = camx;
		DrawMan.camy = camy;
	}
	
	public static void draw(BufferedImage img, float x, float y, float centerx, float centery) {
		x = -(x-camx)+_Config.SCREEN_X/2 - centerx;
		y = -(y-camy)+_Config.SCREEN_Y/2 - centery;
		
		if(
			x > -30 && 
			x < _Config.SCREEN_X + 30 &&
			y > -30 &&
			y < _Config.SCREEN_Y + 30
		) g.drawImage(img, (int)x, (int)y, null);
	}
	
	public static void camera(float camx, float camy) {
		DrawMan.camx = camx;
		DrawMan.camy = camy;
	}
}
