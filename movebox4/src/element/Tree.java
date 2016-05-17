package element;

import java.awt.Point;
import java.util.HashSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;

public class Tree {
	private HashSet<Point> trees=new HashSet<Point>();
	public void init(JFrame frame){
		Icon icon=new ImageIcon("tree.png");
		for(int i=0;i<Globe.WIDTH;i++){
		JLabel label=new JLabel(icon);
		label.setBounds(i*Globe.SIZE,0,Globe.SIZE,Globe.SIZE);
		trees.add(new Point(i*Globe.SIZE,0));
		frame.add(label);
		
		JLabel label2=new JLabel(icon);
		label2.setBounds(i*Globe.SIZE,(Globe.HEIGHT-1)*Globe.SIZE,Globe.SIZE,Globe.SIZE);
		trees.add(new Point(i*Globe.SIZE,(Globe.HEIGHT-1)*Globe.SIZE));
		frame.add(label2);
		}
		for(int i=0;i<Globe.HEIGHT;i++){
			JLabel label=new JLabel(icon);
			label.setBounds(0,i*Globe.SIZE,Globe.SIZE,Globe.SIZE);
			trees.add(new Point(0,i*Globe.SIZE));
			frame.add(label);
			
			JLabel label2=new JLabel(icon);
			label2.setBounds((Globe.WIDTH-1)*Globe.SIZE,i*Globe.SIZE,Globe.SIZE,Globe.SIZE);
			trees.add(new Point((Globe.WIDTH-1)*Globe.SIZE,i*Globe.SIZE));
			frame.add(label2);
		}
		for(int i=0;i<5;i++){
			JLabel label=new JLabel(icon);
			label.setBounds(Globe.SIZE*3,Globe.SIZE*(i+3),Globe.SIZE,Globe.SIZE);
			trees.add(new Point(Globe.SIZE*3,Globe.SIZE*(i+3)));
			frame.add(label);
			
			JLabel label2=new JLabel(icon);
			label2.setBounds(Globe.SIZE*(4+i),Globe.SIZE*7,Globe.SIZE,Globe.SIZE);
			trees.add(new Point(Globe.SIZE*(4+i),Globe.SIZE*7));
			frame.add(label2);
			
			JLabel label3=new JLabel(icon);
			JLabel label4=new JLabel(icon);
			label3.setBounds((i+4)*Globe.SIZE,(i+1)*Globe.SIZE,Globe.SIZE,Globe.SIZE);
			label4.setBounds(Globe.SIZE*(i+9),Globe.SIZE*3,Globe.SIZE,Globe.SIZE);
			trees.add(new Point((i+4)*Globe.SIZE,(i+1)*Globe.SIZE));
			trees.add(new Point(Globe.SIZE*(i+9),Globe.SIZE*3));
			frame.add(label3);
			frame.add(label4);
		}
		for(int i=0;i<7;i++){
			JLabel label=new JLabel(icon);
			label.setBounds(Globe.SIZE*11,Globe.SIZE*(i+4),Globe.SIZE,Globe.SIZE);
			trees.add(new Point(Globe.SIZE*11,Globe.SIZE*(i+4)));
			frame.add(label);
		}
	}
	public boolean ismovable(Point point){
		for(Point p:trees){
			if(point.equals(p))
				return false;
		}
		return true;
	}

}
