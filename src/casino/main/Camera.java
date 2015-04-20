package casino.main;

import org.lwjgl.input.Keyboard;

public class Camera {
	public float x, y;
	public float z = 1f;
	
	public void update(){
		tick();
		draw();
		
		if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)){
			x -= 10f;
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){
			x += 10f;
		}
		
		
		if(Keyboard.isKeyDown(Keyboard.KEY_UP)){
			y -= 10f;
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_DOWN)){
			y += 10f;
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_Q)){
			z += 0.1f;
		}
		
		if(Keyboard.isKeyDown(Keyboard.KEY_E)){
			z -= 0.1f;
		}
	}
	
	public void tick(){}
	public void draw(){}
	
}	
