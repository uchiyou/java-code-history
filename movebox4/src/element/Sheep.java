package element;

import java.awt.Point;
import java.util.HashSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;

public class Sheep {
	public Point[] pos=new Point[3];
	private Icon icon=new ImageIcon("sheep.gif"); 
	public int act=-1;
	JLabel[] label=new JLabel[3];

	public void init(JFrame frame){
		for(int i=0;i<3;i++){
			if(i==1)
			pos[i]=new Point(8*Globe.SIZE,(4-i)*Globe.SIZE);
			else if(i==2)
				pos[i]=new Point(3*Globe.SIZE,(4-i)*Globe.SIZE);
			else
				pos[i]=new Point(6*Globe.SIZE,9*Globe.SIZE);
			label[i]=new JLabel(icon);
		label[i].setBounds(pos[i].x,pos[i].y,Globe.SIZE,Globe.SIZE);
		frame.add(label[i]);
		}
	}
	public void move(int direction){
		int size=Globe.SIZE;
		switch(direction){
		case Globe.UP:
			pos[act].y-=size;
			break;
		case Globe.RIGHT:
			pos[act].x+=size;
			break;
		case Globe.DOWN:
		pos[act].y+=size;
		break;
		case Globe.LEFT:
			pos[act].x-=size;
			break;
			default:;
		}
		label[act].setBounds(pos[act].x,pos[act].y,size,size);
		
	}
	public boolean isCatchable(Point wolf){
		for(int i=0;i<pos.length;i++){
			if(wolf.equals(pos[i])){
				act=i;
				return true;
			}
		}
		
		return false;
	}

}
