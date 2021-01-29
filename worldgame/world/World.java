package worldgame.world;

import worldgame.assets.AssetMan;
import worldgame.graphics.DrawMan;

public class World {
	Tile[][] map;
	int size;
	public World(int size) {
		this.size = size;
		map = new Tile[size][size];
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				map[x][y] = Tile.Grass;
			}
		}
	}
	int x,y;
	public void render() {
		int hsize16 = (size/2)*16;
		int posX = ((int)DrawMan.getCamX()+hsize16)/16;
		int posY = ((int)DrawMan.getCamY()+hsize16)/16;
		for(x = posX-14; x<posX+14; x++) {
			for(y = posY-11; y<posY+11; y++) {
				if(x>=0 && x<size &&
				y>=0 && y<size) {
					if(map[x][y] == Tile.Grass) DrawMan.draw(AssetMan.grass, x*16-hsize16, y*16-hsize16, 8, 8);
				}
			}
		}
	}
}
