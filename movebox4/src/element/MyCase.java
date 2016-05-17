package element;

import java.awt.Point;
import java.util.HashSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;

public class MyCase {
	private HashSet<Point> pos=new HashSet<Point>();
	
	public void init(JFrame frame){
		for(int i=0;i<3;i++){
		Icon icon=new ImageIcon("case.png");
		JLabel label=new JLabel(icon);
		if(i==1){
		label.setBounds(14*Globe.SIZE,10*Globe.SIZE,Globe.SIZE,Globe.SIZE);
		pos.add(new Point(14*Globe.SIZE,10*Globe.SIZE));
		}
		else if(i>1){
			label.setBounds(7*Globe.SIZE,10*Globe.SIZE,Globe.SIZE,Globe.SIZE);
			pos.add(new Point(7*Globe.SIZE,10*Globe.SIZE));
		}
		else{
		label.setBounds(Globe.SIZE,4*Globe.SIZE,Globe.SIZE,Globe.SIZE);
		pos.add(new Point(Globe.SIZE,4*Globe.SIZE));
		}
		frame.add(label);
	}}
	
	public boolean isWin(Point [] sheep){
		for(int i=0;i<sheep.length;i++){
			if(!pos.contains(sheep[i])){
				System.out.println(sheep[i]);
				return false;
			}
		}
		return true;
	}
}
