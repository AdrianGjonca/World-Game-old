package worldgame.world;

import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;

public class World {
	public Tile[][] map;
	int size;
	public World(int size) {
		this.size = size;
		map = new Tile[size][size];
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				map[x][y] = Tile.Grass;
				if(x%6 == 0) map[x][y] = Tile.Leaves;
				if(y%6 == 0) map[x][y] = Tile.Leaves;
				if(x%5 == 0) map[x][y] = Tile.Grass; //Check math later
				if(y%5 == 0) map[x][y] = Tile.Grass;
			}
		}
	}
	public void render() {
		int hsize16 = (size/2)*16;
		int posX = ((int)DrawMan.getCamX()+hsize16)/16;
		int posY = ((int)DrawMan.getCamY()+hsize16)/16;
		for(int x = posX-14; x<posX+14; x++) {
			for(int y = posY-11; y<posY+11; y++) {
				if(x>=0 && x<size &&
				y>=0 && y<size) {
					DrawMan.draw(AssetMan.TILES[map[x][y].ordinal()], x*16-hsize16, y*16-hsize16, 8, 8);
				}
			}
		}
	}
	public Tile tile(float x, float y) {
		int hsize16 = (size/2)*16;
		int tilex = ((int)x+8+hsize16)/16;
		int tiley = ((int)y+8+hsize16)/16; ///NEED TO LOOK INTO THE MATH WHY THIS NEEDS THE +8 ( so far it just works.... ;) )
		return map[tilex][tiley];
	}
}
