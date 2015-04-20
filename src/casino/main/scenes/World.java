package casino.main.scenes;

import org.lwjgl.opengl.Display;

import casino.main.Camera;
import casino.main.Game;
import casino.main.Scene;
import casino.main.scenes.world.Chunk;
import casino.main.scenes.world.Tile;


public class World extends Scene {
	public Chunk[][] chunks = new Chunk[256][256];
	
	@Override
	public void init() {
		for(int x = 0; x < chunks.length; x++){
			for(int y = 0; y < chunks[x].length; y++){
				chunks[x][y] = new Chunk(x*(Tile.SIZE*16), y*(Tile.SIZE*16), 0);
			}
		}
	}

	@Override
	public void tick() {
		for(int x = 0; x < chunks.length; x++){
			for(int y = 0; y < chunks[x].length; y++){
				Chunk chunk = chunks[x][y];
				Camera camera = Game.getCurrentScene().camera;
				if(!(chunk.x+(Tile.SIZE*16) < camera.x || chunk.x > camera.x+Display.getWidth() ||
						chunk.y+(Tile.SIZE*16) < camera.y || chunk.y > camera.y+Display.getHeight())){
					chunk.update();
				}
			}
		}
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	

}
