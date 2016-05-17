package elements;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;

public class Tank {
	private Point pos=new Point(4*Globe.SIZE,4*Globe.SIZE);
	JFrame frame=null;
	
	Bullet bullet;
	
	private Icon icon=new ImageIcon("up.jpg");
	private JLabel label=new JLabel(icon);
	
	public Point getPos(){
		return pos;
	}
	public void setBullet(Bullet bullet,Point pos,int direction){
		this.bullet=bullet;
	}
	public void move(int direction){
		switch(direction){
		case Globe.UP:
			pos.y-=Globe.SIZE;
			icon=new ImageIcon("up.jpg");
			break;
		case Globe.RIGHT:
			pos.x+=Globe.SIZE;
			icon=new ImageIcon("right.jpg");
			break;
		case Globe.DOWN:
			pos.y+=Globe.SIZE;
			icon=new ImageIcon("down.jpg");
			break;
		case Globe.LEFT:
			pos.x-=Globe.SIZE;
			icon=new ImageIcon("left.jpg");
			break;
			default:
		}
		label.setIcon(icon);
		label.setLocation(pos.x,pos.y);
		
	}
	/*public void fire(int direction){
		System.out.println("direction.."+direction+"----pos.."+pos);
	bullet.restart(pos, direction);
	//bullet.init(frame);
		
	}
	why this is a bug????????????????????????????????????
	*/
	public boolean isDeath(){
		
		return false;
	}
	public void init(JFrame frame) {
		// TODO Auto-generated method stub
		label.setBounds(pos.x,pos.y,Globe.SIZE,Globe.SIZE);
		frame.add(label);
	}
	public void back(int direction){
		move((direction+2)%4);
		
	}

}
