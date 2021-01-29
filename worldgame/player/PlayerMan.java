package worldgame.player;

import worldgame.FrameLog;
import worldgame.KeyMan;
import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;

public class PlayerMan {
	public static float x;
	public static float y;
		
	final static float speed = 128f;
	
	public static void render() {
		DrawMan.draw(AssetMan.TILES[4], x, y, 8, 8);
	}
	
	public static void controller() {
		float xcont = 0;
		float ycont = 0;
		if(KeyMan.W) ycont = 1f;
		if(KeyMan.S) ycont = -1f;
		if(KeyMan.D) xcont = 1f;
		if(KeyMan.A) xcont = -1f;
		
		float hypot = (float)Math.hypot((double)xcont,(double)ycont);
		if(ycont != 0) ycont /= hypot;
		if(xcont != 0) xcont /= hypot;
		
		x+=xcont*FrameLog.deltaTime()*speed;
		y+=ycont*FrameLog.deltaTime()*speed;
	}
}
