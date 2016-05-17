package elements;

import java.awt.Point;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;

public class Block {
	Point[] pos=new Point[Globe.HEIGHT*Globe.WIDTH*4];
	int count=0;
	public boolean isMovable(Point point){
		if(point.x<0||point.y<0||point.x>=Globe.WIDTH*Globe.SIZE||point.y>=Globe.HEIGHT*Globe.SIZE)
			return false;
		for(int i=0;i<count;i++)
			if(point.equals(pos[i]))
				return false;
		
		return true;
	}
	public boolean isFired(Point point){
		for(int i=0;i<count;i++)
			if(point.equals(pos[i])){
				
				return true;
			}
		return false;
	}
	public void remove(int j){
		
		for(int i=j;i<count;i++)
			pos[i].setLocation(pos[i+1]);
		pos[count-1]=null;
	}
	public void init(JFrame frame){
		for(int i=0;i<30;i++){
			Icon icon=new ImageIcon("obstacle.jpg");
			JLabel label=new JLabel(icon);
			label.setBounds(3*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label);
			pos[i]=new Point(3*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE);
			
			Icon icon2=new ImageIcon("obstacle.jpg");
			JLabel label2=new JLabel(icon2);
			label2.setBounds(3*Globe.SIZE+Globe.SIZE*i/2,3*Globe.SIZE/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label2);
			pos[i+30]=new Point(3*Globe.SIZE+Globe.SIZE*i/2,3*Globe.SIZE/2);
			count+=2;
		}
		for(int i=0;i<28;i++){
			Icon icon=new ImageIcon("obstacle.jpg");
			JLabel label=new JLabel(icon);
			label.setBounds(4*Globe.SIZE+Globe.SIZE*i/2,6*Globe.SIZE,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label);
			pos[i+60]=new Point(4*Globe.SIZE+Globe.SIZE*i/2,6*Globe.SIZE);
			
			Icon icon2=new ImageIcon("obstacle.jpg");
			JLabel label2=new JLabel(icon2);
			label2.setBounds(4*Globe.SIZE+Globe.SIZE*i/2,13*Globe.SIZE/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label2);
			pos[i+88]=new Point(4*Globe.SIZE+Globe.SIZE*i/2,13*Globe.SIZE/2);
			
			
			
			Icon icon3=new ImageIcon("obstacle.jpg");
			JLabel label3=new JLabel(icon3);
			label3.setBounds(4*Globe.SIZE+Globe.SIZE*i/2,8*Globe.SIZE,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label3);
			pos[i+116]=new Point(4*Globe.SIZE+Globe.SIZE*i/2,8*Globe.SIZE);
			
			Icon icon4=new ImageIcon("obstacle.jpg");
			JLabel label4=new JLabel(icon2);
			label4.setBounds(4*Globe.SIZE+Globe.SIZE*i/2,17*Globe.SIZE/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label4);
			pos[i+144]=new Point(4*Globe.SIZE+Globe.SIZE*i/2,17*Globe.SIZE/2);
			count+=4;
		}
		
		for(int i=0;i<24;i++){
			Icon icon=new ImageIcon("obstacle.jpg");
			JLabel label=new JLabel(icon);
			label.setBounds(Globe.SIZE,2*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label);
			pos[i+172]=new Point(Globe.SIZE,2*Globe.SIZE+Globe.SIZE*i/2);
			
			Icon icon2=new ImageIcon("obstacle.jpg");
			JLabel label2=new JLabel(icon2);
			label2.setBounds(3*Globe.SIZE/2,2*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label2);
			pos[i+196]=new Point(Globe.SIZE,2*Globe.SIZE+Globe.SIZE*i/2);
			
			
			Icon icon3=new ImageIcon("obstacle.jpg");
			JLabel label3=new JLabel(icon);
			label3.setBounds(3*Globe.SIZE,2*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label3);
			pos[i+220]=new Point(3*Globe.SIZE,2*Globe.SIZE+Globe.SIZE*i/2);
			
			Icon icon4=new ImageIcon("obstacle.jpg");
			JLabel label4=new JLabel(icon4);
			label4.setBounds(7*Globe.SIZE/2,2*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label4);
			pos[i+244]=new Point(7*Globe.SIZE/2,2*Globe.SIZE+Globe.SIZE*i/2);
			
			Icon icon5=new ImageIcon("obstacle.jpg");
			JLabel label5=new JLabel(icon);
			label5.setBounds((Globe.WIDTH-2)*Globe.SIZE,1*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label5);
			pos[i+268]=new Point((Globe.WIDTH-2)*Globe.SIZE,1*Globe.SIZE+Globe.SIZE*i/2);
			
			Icon icon6=new ImageIcon("obstacle.jpg");
			JLabel label6=new JLabel(icon6);
			label6.setBounds((Globe.WIDTH*2+1-4)*Globe.SIZE/2,1*Globe.SIZE+Globe.SIZE*i/2,Globe.SIZE/2,Globe.SIZE/2);
			frame.add(label6);
			pos[i+292]=new Point((Globe.WIDTH*2+1-4)*Globe.SIZE/2,1*Globe.SIZE+Globe.SIZE*i/2);
			count+=6;
		}
		
		
	}

}
