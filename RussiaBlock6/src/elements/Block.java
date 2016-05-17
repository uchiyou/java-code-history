package elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashSet;
import java.util.Iterator;

import listener.DownListener;
import util.Globe;

public class Block {
	private HashSet<Point> [] shape;
	private int status=(int)(Math.random()*4);
	private DownListener listener;
	private Point trace=new Point(0,0);
//v	private Point trace0=new Point(0,0);
	private HashSet<Point> present=new HashSet<Point>();
	private HashSet<Point> last=new HashSet<Point>();
	private boolean flag=true;

	public void setShape(HashSet<Point> [] shape){
		this.shape=shape;
	}
	public HashSet<Point> getPos(){
		return present;
	}
	
	public void down(){
		for(Point p:present){
			p.y++;
		}
		trace.y++;
		
	}
	public void right(){
		for(Point p:present){
			p.x++;
		}
		trace.x++;
		
	}
	public void left(){
		for(Point p:present){
			p.x--;
		}
		trace.x--;
	}
	@SuppressWarnings("unchecked")
	public void rotate() {
		// TODO Auto-generated method stub
		int temp=status;
		status=(status+1)%4;
		last=(HashSet<Point>) present.clone();
		present.clear();
	//	present=(HashSet<Point>)shape[status].clone(); clone不能复制容器中的元素，只是引用了原容器中的元素
		copyPos(shape[status],present);
		for(Point p:present){
			p.x+=trace.x;
			p.y+=trace.y;
		}
	}
	public void drawMe(Graphics g){
		int size=Globe.SIZE;
		g.setColor(new Color(0x99ff00));
		for(Point p:present){
			g.fill3DRect(p.x*size, p.y*size, size, size, true);
		}
		
	}
	private class keepDown implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(flag){
				down();
				listener.downEvent();
				try{
					Thread.sleep(400);
				}catch(InterruptedException e){
					e.printStackTrace();
				}}}}
	
	public void start(){
		//	present.addAll(shape[status]);
			copyPos(shape[status],present);
		Thread gamestart=new Thread(new keepDown());
		gamestart.start();
	}
	public void stop(){
		flag=false;
	}
	public void addDownListener(DownListener listener){
		this.listener=listener;
	}
	/*
	 * 复制容器中的元素，从而保持着原shape完位置不变，通过trace确认新的图形位置
	 */
	public void copyPos(HashSet<Point> origin,HashSet<Point> newCopy){
		for(Point p:origin){
			newCopy.add((Point) p.clone());
		}
	}
	public void back(int direction){
		switch(direction){
		case Globe.LEFT:
			right();
			break;
		case Globe.RIGHT:
			left();
			break;
		case Globe.DOWN:
			for(Point p:present){
				p.y--;
			}
			
			break;
		case Globe.UP:
			present.clear();
			present.addAll(last);
			break;
			default:;
		}
	}
	
	
	
		
	}
