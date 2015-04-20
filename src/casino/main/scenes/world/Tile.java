package casino.main.scenes.world;

import org.lwjgl.opengl.GL11;

import casino.main.Instance;

public class Tile extends Instance {
	public TileType type;
	
	public Tile(float x, float y, float z, TileType type) {
		super(x, y, z);
		this.type = type;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		GL11.glColor3f(type.color.getRed()/255, type.color.getGreen()/255, type.color.getBlue()/255);
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, z);
			GL11.glBegin(GL11.GL_LINES);
				GL11.glVertex2f(0, 0);
				GL11.glVertex2f(16, 0);
			GL11.glEnd();
		
			GL11.glBegin(GL11.GL_LINES);
				GL11.glVertex2f(0, 16);
				GL11.glVertex2f(16, 16);
			GL11.glEnd();
			
			GL11.glBegin(GL11.GL_LINES);
				GL11.glVertex2f(0, 0);
				GL11.glVertex2f(0, 16);
			GL11.glEnd();
		GL11.glPopMatrix();
			
		
	}

}
