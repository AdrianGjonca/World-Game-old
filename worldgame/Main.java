package worldgame;

import java.awt.image.BufferedImage;

import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;
import worldgame.world.World;

public class Main {

	public static void main(String[] args) {
		WindowMan.init();
		AssetMan.init();
		DrawMan.init(WindowMan.graphics(), 0, 0);
		
		World world = new World(100);
		float x = 0;
		float y = 0;
		while(true) {
			System.out.println(FrameLog.fps());
			//
			world.render();
			DrawMan.camera(x, y);
			x += FrameLog.deltaTime * 32f;
			y += FrameLog.deltaTime * 24f;
			//
			WindowMan.frame();
			//FrameLog.cap(512);
			FrameLog.next();
		}
	}

}
