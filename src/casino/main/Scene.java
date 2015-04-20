package casino.main;

import java.util.ArrayList;

public abstract class Scene {
	public ArrayList<Instance> instances = new ArrayList<Instance>();
	public Camera camera = new Camera();
	public boolean inited = false;
	
	public void update(){
		
		if(inited == false){
			init();
			inited = true;
		}
		
		for(int i = 0; i < instances.size(); i++){
			instances.get(i).update();
		}
		
		tick();
		draw();
	}
	
	public abstract void init();
	public abstract void tick();
	public abstract void draw();
	
	public void instance_create(Instance instance){
		instances.add(instance);
	}
}
