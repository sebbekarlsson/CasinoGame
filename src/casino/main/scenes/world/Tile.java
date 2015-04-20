package casino.main.scenes.world;

import org.lwjgl.opengl.GL11;

import casino.main.Instance;
import casino.main.utils.graphics.TextureBank;

public class Tile extends Instance {
	public TileType type;
	public static int SIZE = 64;
	
	public Tile(float x, float y, float z, TileType type) {
		super(x, y, z);
		this.type = type;
		sprite.textures.add(TextureBank.GRASS);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		//GL11.glColor3f(type.color.getRed()/255, type.color.getGreen()/255, type.color.getBlue()/255);
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, z);
			sprite.update();
		GL11.glPopMatrix();
			
		
	}

}
