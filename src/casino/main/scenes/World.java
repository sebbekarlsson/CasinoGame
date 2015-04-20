package casino.main.scenes;

import java.util.Random;

import casino.main.Scene;
import casino.main.scenes.world.Tile;
import casino.main.scenes.world.TileType;


public class World extends Scene {
	static Random random = new Random();
	public Tile[][] tiles = new Tile[16][16];

	@Override
	public void init() {
		for(int x = 0; x < tiles.length; x++){
			for(int y = 0; y < tiles[x].length; y++){
				tiles[x][y] = new Tile(x*Tile.SIZE, y*Tile.SIZE, 0, TileType.GRASS);
			}
		}
	}

	@Override
	public void tick() {
		for(int x = 0; x < tiles.length; x++){
			for(int y = 0; y < tiles[x].length; y++){
				tiles[x][y].update();
				if(random.nextInt(100) == 0){
					tiles[x][y].type = TileType.STONE;
				}
			}
		}
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	

}
