package com.arion.starassault.view;

import com.arion.starassault.model.World;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class WorldRender {
	private World world;
	private OrthographicCamera cam;
	
	ShapeRenderer debugRender = new ShapeRenderer();
	
	public WorldRender(World world) {
		this.world = world;
		cam = new OrthographicCamera(10, 7);
		cam.position.set(5, 3.5f, 0);
		cam.update();
	}
	
	public void render() {
		debugRender.setProjectionMatrix(cam.combined);
		
		debugRender.begin(ShapeType.Rectangle);
	}

}
