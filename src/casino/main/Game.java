package casino.main;

import java.awt.Dimension;
import java.util.ArrayList;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import casino.main.scenes.World;

public class Game {
	public static int width = 640;
	public static int height = width / 16 * 9;
	public static int scale = 2;
	public static Dimension FRAMESIZE = new Dimension(width * scale, height * scale);
	public static ArrayList<Scene> scenes = new ArrayList<Scene>();
	public static int SCENEINDEX = 0;
	static float zoom = 1f;
	
	
	public static void main(String[] args){
		scenes.add(new World());
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
		
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        //GLU.gluPerspective(70f, (float)Display.getWidth()/Display.getHeight(), 1f, 100f);
        GL11.glOrtho(0, Display.getWidth(), Display.getHeight(), 0,-1f,1000 );
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
     	GL11.glLoadIdentity();
     	GL11.glEnable(GL11.GL_TEXTURE_2D);
     	GL11.glEnable(GL11.GL_DEPTH_TEST);
		while(!Display.isCloseRequested()){
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			GL11.glClearColor(0, 0, 0, 1);
			
			
			if(getCurrentScene().inited == false){
				getCurrentScene().init();
				getCurrentScene().inited = true;
			}
			
			GL11.glColor3f(1, 1, 1);
			Camera camera = getCurrentScene().camera;
			
			GL11.glPushMatrix();
				GL11.glTranslatef(-camera.x, -camera.y,0f);
					GL11.glTranslated(((camera.x)+Display.getWidth()/2), ((camera.y)+Display.getHeight()/2), 0f);
						GL11.glScaled(camera.z, camera.z, 1);
					GL11.glTranslated(-((camera.x)+Display.getWidth()/2), -((camera.y)+Display.getHeight()/2), 0f);
					camera.update();
					getCurrentScene().update();
			GL11.glPopMatrix();
			
			zoom += 0.01f;
			
			
			Display.sync(60);
			Display.update();
		}
		
		System.exit(0);
	}
	
	public static Scene getCurrentScene(){
		return scenes.get(SCENEINDEX);
	}
}
