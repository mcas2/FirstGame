package com.mcas2.game;

public class Point {
    float x,y;

    public Point(){
        x=0;
        y=0;
    }

    public Point(float xPos, float yPos){
        x= xPos;
        y= yPos;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
