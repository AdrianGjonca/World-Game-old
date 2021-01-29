package worldgame;

import java.awt.image.BufferedImage;

import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;
import worldgame.player.PlayerMan;
import worldgame.world.World;

public class Main {

	public static void main(String[] args) {
		WindowMan.init();
		AssetMan.init();
		DrawMan.init(WindowMan.graphics(), 0, 0);
		
		World world = new World(100);
		while(true) {
			System.out.println(FrameLog.fps());
			/////
			DrawMan.camera(PlayerMan.x, PlayerMan.y);
			world.render();
			PlayerMan.render();
			PlayerMan.x+=FrameLog.deltaTime()*8f;
			/////
			WindowMan.frame();
			//FrameLog.cap(512);
			FrameLog.next();
		}
	}

}
