package com.arion.starassault.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bob {
	
	public enum State {
		IDEL, WALKING, JUMPING, DYING
	}
	
	static final float SIZE  = 0.5f;
	static final float JUMP_VELOCITY = 1f;
	static final float SPEED = 2f;
				
	Vector2 acceleration = new Vector2();
	Vector2 velocity = new Vector2();
	Vector2 position = new Vector2();
	State state = State.IDEL;
	boolean faceingLeft = true;
	Rectangle bounds = new Rectangle();
	


}
