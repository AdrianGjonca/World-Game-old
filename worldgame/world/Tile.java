package worldgame.world;

public enum Tile {
	Grass(true),
	Leaves(false),
	;

	public boolean col = false;
	
	Tile(boolean b) {
		col = b;
	}
}

