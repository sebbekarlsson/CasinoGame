package casino.main;

import java.awt.Dimension;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

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
			
		}
		
		System.exit(0);
	}
}
