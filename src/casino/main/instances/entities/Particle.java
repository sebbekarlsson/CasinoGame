package casino.main.instances.entities;

import java.awt.Color;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import casino.main.Entity;

public class Particle extends Entity {
	public Color color = Color.white;
	Random random = new Random();

	public Particle(float x, float y, float z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		if(random.nextInt(100) == 0){
			addForce(random.nextInt(360),10f);
		}
		
	}

	@Override
	public void draw() {
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		
		
		GL11.glPushMatrix();
		GL11.glTranslatef(x, y, z);
		
			GL11.glColor3f(color.getRed()/255, color.getGreen()/255, color.getBlue()/255);
			GL11.glBegin(GL11.GL_QUADS);
			GL11.glVertex2f(0, 0);
			GL11.glVertex2f(16, 0);
			GL11.glVertex2f(16, 16);
			GL11.glVertex2f(0, 16);
			
		
			
			GL11.glEnd();
		GL11.glPopMatrix();
		
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		
	}

}
