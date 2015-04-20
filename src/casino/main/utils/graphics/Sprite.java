package casino.main.utils.graphics;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.Texture;

public class Sprite {
	public ArrayList<Texture> textures = new ArrayList<Texture>();
	public int TEXTUREINDEX = 0;

	public void update(){
		draw();
	}
	public void draw(){
		if(textures.size() > 0){
			Texture t = getCurrentTexture();
			t.bind();
			GL11.glBegin(GL11.GL_QUADS);
				GL11.glTexCoord2f(0, 0);
				GL11.glVertex2f(0, 0);
				
				GL11.glTexCoord2f(t.getWidth(), 0);
				GL11.glVertex2f(t.getTextureWidth(), 0);
				
				GL11.glTexCoord2f(t.getWidth(), t.getHeight());
				GL11.glVertex2f(t.getTextureWidth(), t.getTextureHeight());
				
				GL11.glTexCoord2f(0, t.getHeight());
				GL11.glVertex2f(0, t.getTextureHeight());
			GL11.glEnd();
		}
	}

	public Texture getCurrentTexture(){
		return textures.get(TEXTUREINDEX);
	}
}
