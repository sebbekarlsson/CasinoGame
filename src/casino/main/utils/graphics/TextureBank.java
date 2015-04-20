package casino.main.utils.graphics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class TextureBank {

	public static Texture GRASS = loadTexture("graphics/test/aspnet.png");
	
	public static Texture loadTexture(String path){
		Texture texture = null;
		try {
			texture = TextureLoader.getTexture("png", new FileInputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return texture;
	}
}
