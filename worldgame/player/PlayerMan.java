package worldgame.player;

import worldgame.FrameLog;
import worldgame.KeyMan;
import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;
import worldgame.world.World;

public class PlayerMan {
	public static float x;
	public static float y;
		
	final static float speed = 128f;
	static World world;
	
	public static void init(World world) {
		PlayerMan.world = world;
	}
	
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
		
		if(xcont<0 && !colpoint(x-4, y)) xcont=0;
		if(xcont>0 && !colpoint(x+4, y)) xcont=0;
		if(ycont<0 && !colpoint(x, y-5)) ycont=0;
		if(ycont>0 && !colpoint(x, y+3)) ycont=0;
		
		x+=xcont*FrameLog.deltaTime()*speed;
		y+=ycont*FrameLog.deltaTime()*speed;
	}
	
	private static boolean colpoint(float x, float y) {
		return world.tile(x, y).col;
	}
}
