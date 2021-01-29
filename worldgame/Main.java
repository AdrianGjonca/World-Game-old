package worldgame;

import java.awt.image.BufferedImage;

import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;

public class Main {

	public static void main(String[] args) {
		WindowMan.init();
		AssetMan.init();
		DrawMan.init(WindowMan.graphics(), 0, 0);
		
		BufferedImage tile = AssetMan.TILESET.getSubimage(0, 0, 16, 16);
		float x = 0;
		float y = 0;
		while(true) {
			System.out.println(FrameLog.fps());
			//
			DrawMan.draw(tile, 0, 0, 8, 8);
			DrawMan.camera(x, y);
			x += FrameLog.deltaTime * 120f;
			//
			WindowMan.frame();
			FrameLog.cap(512);
			FrameLog.next();
		}
	}

}
