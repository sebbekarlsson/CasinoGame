package casino.main;

public abstract class Instance {
	protected float x,y,z = 0;
	
	
	public Instance(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void update(){
		tick();
		draw();
	}
	
	public abstract void tick();
	public abstract void draw();
}
