package casino.main;

public class Camera {
	protected int x,y,z = 0;
	
	public void update(){
		tick();
		draw();
	}
	
	public void tick(){}
	public void draw(){}
	
}	
