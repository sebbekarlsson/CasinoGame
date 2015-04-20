package casino.main;

import org.lwjgl.input.Keyboard;

public class Camera {
	protected float x,y,z = 0;
	
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
	}
	
	public void tick(){}
	public void draw(){}
	
}	
