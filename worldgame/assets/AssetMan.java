package worldgame.assets;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class AssetMan {
	public static BufferedImage TILESET;
	
	public static BufferedImage grass;
	public static void init() {
		try {
			TILESET = ImageIO.read(AssetMan.class.getResource("tileset.png"));
			grass = TILESET.getSubimage(0, 0, 16, 16);
		} catch (Exception e) {
			System.out.println("[YIKES!!!]/ something's gone wrong loading tileset.png");
			System.out.println("          \\ the game will crash if I go on... better leave");
			System.out.println("**----JAVA ERROR LOG----**");
			e.printStackTrace();
			System.exit(0);
		}
	}
}