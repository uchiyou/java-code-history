package elements;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;

public class Bullet {
	private Point pos=new Point(0,0);
	private int direction;
	Icon icon=new ImageIcon("bullet.jpg");
	JLabel label=new JLabel(icon);
	
	
	public Bullet(Point pos,int direction){
		this.pos=pos;
		this.direction=direction;
	//	Thread thread=new Thread(new Fire());
	//	thread.start();
	}
	
	public synchronized void move(int direction){
		switch(direction){
		case Globe.UP:
			pos.y-=Globe.SIZE;
			break;
		case Globe.RIGHT:
			pos.x+=Globe.SIZE;
			break;
		case Globe.DOWN:
			pos.y+=Globe.SIZE;
			break;
		case Globe.LEFT:
			pos.x-=Globe.SIZE;
			break;
			default:;
		}
		label.setLocation(pos.x,pos.y);
	}
	class Fire implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true){
				System.out.println("in run");
			move(direction);
			if(pos.x<0||pos.y<0||pos.x>Globe.WIDTH*Globe.SIZE||pos.y>Globe.HEIGHT*Globe.SIZE)
				break;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}}
	}
	public void restart(Point pos,int direction){
		System.out.println("bullet direction .."+direction);
		this.pos.x=pos.x;
		this.pos.y=pos.y;
		this.direction=direction;
		label.setBounds(pos.x,pos.y,Globe.SIZE,Globe.SIZE);
		Thread thread=new Thread(new Fire());
		thread.start();
	}
	public void init(JFrame frame){
	//	label.setBounds(pos.x*Globe.SIZE,
		frame.add(label);
	//	Thread thread=new Thread(new Fire());
	//	thread.start();
	}
}