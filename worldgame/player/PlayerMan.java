package worldgame.player;

import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;

public class PlayerMan {
	public static float x;
	public static float y;
	
	public static void render() {
		DrawMan.draw(AssetMan.TILES[4], x, y, 8, 8);
	}
}
