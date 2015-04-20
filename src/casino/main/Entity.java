package casino.main;

public abstract class Entity extends Instance {
	public float dx, dy, dz = 0f;
	public float friction = 0.3f;

	public Entity(float x, float y, float z) {
		super(x, y, z);
		// TODO Auto-generated constructor stub
	}
	
	public void update(){
		x += dx;
		y += dy;
			
		if(dx > 0){
			if(dx - friction < 0){
				dx = 0;
			}else{
				dx -= friction;
			}
		}
		if(dx < 0){
			if(dx + friction > 0){
				dx = 0;
			}else{
				dx += friction;
			}
		}
		
		if(dy > 0){
			if(dy - friction < 0){
				dy = 0;
			}else{
				dy -= friction;
			}
		}
		if(dy < 0){
			if(dy + friction > 0){
				dy = 0;
			}else{
				dy += friction;
			}
		}
		
		tick();
		draw();
	}
	
	public void addForce(float direction, float force){
		dx += Math.cos(direction) * force;
		dy += Math.sin(direction) * force;
	}

}
