package test.game;

import java.awt.Color;

public class Point {
	private int x;
	private int y;
	private Color color=Color.black;
	public static final int DIAMETER=30;
	public Point(int x,int y,Color color){
		this.x=x;
		this.y=y;
		this.color=color;
		
	}
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return color;
	}

}
