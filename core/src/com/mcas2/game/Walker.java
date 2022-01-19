package com.mcas2.game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
import java.util.Random;

public class Walker extends ApplicationAdapter {
	Random r = new Random();
	ShapeRenderer shapeRenderer;
	int x = Gdx.graphics.getWidth()/2;
	int y = Gdx.graphics.getHeight()/2;
	ArrayList<Point> points;

	@Override
	public void create () {
		shapeRenderer = new ShapeRenderer();
		points = new ArrayList<>();
	}

	@Override
	public void render () {
		ScreenUtils.clear(1,1,1,1);

		x += r.nextInt(3)-2;
		y += r.nextInt(3)-2;

		if (x<0) {
			x = 0;
		}
		if (x> Gdx.graphics.getWidth()) {
			x = Gdx.graphics.getWidth();
		}

		if (y<0) {
			y = 0;
		}
		if (y> Gdx.graphics.getHeight()) {
			y = Gdx.graphics.getHeight();
		}

		points.add(new Point(x,y));

		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		for (Point iter : points){
			shapeRenderer.setColor(0, 1, 0, 1);
			shapeRenderer.circle(iter.getX(), iter.getY(), 3);
		}

		shapeRenderer.end();
	}


	@Override
	public void dispose () {
		shapeRenderer.dispose();
	}
}

