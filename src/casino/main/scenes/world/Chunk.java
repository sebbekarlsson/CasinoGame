package casino.main.scenes.world;

import java.util.Random;

public class Chunk {
	public float x,y,z = 0;
	public Tile[][] tiles = new Tile[16][16];
	public boolean inited = false;
	static Random random = new Random();
	
	
	
	public Chunk(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void init(){
		for(int x = 0; x < tiles.length; x++){
			for(int y = 0; y < tiles[x].length; y++){
				TileType type = TileType.GRASS;
				if(random.nextInt(32) == 0){type = TileType.STONE;}
				tiles[x][y] = new Tile(this.x+(x*(Tile.SIZE)), this.y+(y*(Tile.SIZE)), 0, type);
			}
		}
		
	}
	
	public void update(){
		if(inited == false){
			init();
			inited = true;
		}
		tick();
		draw();
	}
	
	public void tick(){
		for(int x = 0; x < tiles.length; x++){
			for(int y = 0; y < tiles[x].length; y++){
				tiles[x][y].update();
			}
		}
	}
	public void draw(){}
}
