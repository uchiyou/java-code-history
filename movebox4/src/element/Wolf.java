package element;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;

public class Wolf {
	private Icon icon;
	private JLabel label;
public   Point pos=new Point(7*Globe.SIZE,5*Globe.SIZE);
	public  void init(JFrame frame){
		System.out.println("wolf init");
		 icon=new ImageIcon("up.png");
		label=new JLabel(icon);
		label.setBounds(pos.x,pos.y,Globe.SIZE,Globe.SIZE);
		frame.add(label);
	}
	public void move(int direction){
		System.out.println("wolf move");
		int size=Globe.SIZE;
		switch(direction){
		case Globe.UP:
			pos.y-=size;
			label.setIcon(new ImageIcon("up.png"));
			break;
		case Globe.RIGHT:
			label.setIcon(new ImageIcon("right.png"));
			pos.x+=size;
			break;
		case Globe.DOWN:
			label.setIcon(new ImageIcon("-down.png"));
			pos.y+=size;
			break;
		case Globe.LEFT:
			label.setIcon(new ImageIcon("left.png"));
			pos.x-=size;
			break;
			default:;
		}
		label.setLocation(pos);
		
	}
	

}
