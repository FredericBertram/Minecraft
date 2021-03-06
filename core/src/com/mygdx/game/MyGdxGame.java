package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;

public class MyGdxGame extends ApplicationAdapter {

	public final float field_of_view=67;
	public final float camara_near=1;
	public final float camara_far=300;
	public final float camara_velocity= 15;
	public final float camara_degrees_per_pixel= 08f;

	public Environment environment;
	public PerspectiveCamera camera;

	
	@Override
	public void create () {
	environment=new Environment();

	camera= new PerspectiveCamera(field_of_view,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
	camera.position.set(0,10f,10f);
	camera.near=camara_near;
	camera.far=camara_far;
	}


	//@Override
	public void render () {
	    Gdx.gl.glClearColor(0.5f,0.8f,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT| GL20.GL_DEPTH_BUFFER_BIT);

	}
	
	//@Override
	//public void dispose () {

	}
}
