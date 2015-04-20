package casino.main.scenes.world;

import java.awt.Color;

public enum TileType {
	
	
	GRASS(true, Color.green),
	STONE(true, Color.white);
	
	boolean solid;
	Color color;
	TileType(boolean solid, Color color){
		this.solid = solid;
		this.color = color;
	}
}
