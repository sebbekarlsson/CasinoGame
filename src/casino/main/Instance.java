package casino.main;

public abstract class Instance {
	protected int x,y,z = 0;
	
	public void update(){
		tick();
		draw();
	}
	
	public abstract void tick();
	public abstract void draw();
}
