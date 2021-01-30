package worldgame;

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
		PlayerMan.init(world);
		while(true) {
			System.out.println(FrameLog.fps());
			/////
			
			PlayerMan.controller();
			KeyMan.check();
			
			DrawMan.camera(PlayerMan.x, PlayerMan.y);
			world.render();
			PlayerMan.render();
			
			
			/////
			WindowMan.frame();
			//FrameLog.cap(512);
			FrameLog.next();
		}
	}

}
