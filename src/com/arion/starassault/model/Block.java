package com.arion.starassault.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Block {
	
	static final float SIZE = 1f;
	
	Rectangle bounds = new Rectangle();
	Vector2 position = new Vector2();
	
	public Block(Vector2 pos) {
		position = pos;
		bounds.width = SIZE;
		bounds.height = SIZE;
	}
	

}
