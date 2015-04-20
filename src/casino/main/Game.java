package casino.main;

import java.awt.Dimension;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Game {
	public static int width = 640;
	public static int height = width / 16 * 9;
	public static int scale = 2;
	public static Dimension FRAMESIZE = new Dimension(width * scale, height * scale);
	
	public static void main(String[] args){
		new Game();
	}
	
	public Game(){
		try {
			Display.setDisplayMode(new DisplayMode(FRAMESIZE.width, FRAMESIZE.height));
			Display.setTitle("Casino Game");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(!Display.isCloseRequested()){
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			GL11.glClearColor(0, 0, 0, 1);
			GL11.glLoadIdentity();
			
			GL11.glPushMatrix();
			
			GL11.glPopMatrix();
		}
		
		System.exit(0);
	}
}
