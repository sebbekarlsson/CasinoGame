package casino.main.scenes.world;

import java.awt.Color;

import org.newdawn.slick.opengl.Texture;

import casino.main.utils.graphics.TextureBank;

public enum TileType {
	
	
	GRASS(true, Color.green, TextureBank.GRASS),
	STONE(true, Color.white, TextureBank.STONE);
	
	boolean solid;
	Color color;
	Texture texture;
	TileType(boolean solid, Color color, Texture texture){
		this.solid = solid;
		this.color = color;
		this.texture = texture;
	}
}
