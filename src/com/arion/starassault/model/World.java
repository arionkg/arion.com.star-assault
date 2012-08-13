package com.arion.starassault.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

public class World {

	Array<Block> blocks = new Array<Block>();
	Bob bob;
	
	public Array<Block> getBlocks() {
		return blocks;
	}
	
	public Bob getBob() {
		return bob;
	}
	
	public World() {
		createWorld();
	}
	
	void createWorld() {
		bob = new Bob();
		for (int i=0; i < 10; i++) {
			blocks.add(new Block(new Vector2(i, 0)));
			blocks.add(new Block(new Vector2(i, 7)));
			if (i > 2)
				blocks.add(new Block(new Vector2(i, 1)));
		}
		
		for (int i=2; i<6; i++ ) {
			blocks.add(new Block(new Vector2(6, i)));
			if (i > 2)
				blocks.add(new Block(new Vector2(9,i)));
		}
			
	}
}
