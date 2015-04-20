package casino.main.scenes.world;

import org.lwjgl.opengl.GL11;

import casino.main.Instance;

public class Tile extends Instance {
	public TileType type;
	public static int SIZE = 16;
	
	public Tile(float x, float y, float z, TileType type) {
		super(x, y, z);
		this.type = type;
		sprite.textures.add(type.texture);
		sprite.forceSize(SIZE,SIZE);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, z);
			sprite.update();
		GL11.glPopMatrix();
			
		
	}
	
	public void setType(TileType type){
		this.type = type;
		sprite.textures.clear();
		sprite.textures.add(type.texture);
	}

}
