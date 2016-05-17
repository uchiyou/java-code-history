package elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashSet;

import util.Globe;
import controll.Controller;

public class Ground {
	Point [] forIndex=new Point[(Globe.HEIGHT-2)*(Globe.WIDTH-2)];
	private int count=0;
	private HashSet<Point> cell=new HashSet<Point>();{
		for(int i=0;i<Globe.HEIGHT;i++){
			cell.add(new Point(0,i));
			cell.add(new Point(Globe.WIDTH-1,i));
		}
		for(int i=0;i<Globe.WIDTH;i++){
			cell.add(new Point(i,Globe.HEIGHT-1));
		}
	}
	private int line=-1;
//	public  HashSet<Point> gro=new HashSet<Point>();
	public void accept(HashSet<Point> pos){
	//	gro.addAll(pos);
		for(Point p:pos){
			forIndex[count++]=p;
		}
	}
	public void drawMe(Graphics g){
		int size=Globe.SIZE;
		g.setColor(new Color(0x0000ff));
		if(forIndex[0]!=null){
		for(int i=0;i<count;i++){
			g.fill3DRect(forIndex[i].x*size, size*forIndex[i].y, size, size, true);
		}}
		g.setColor(new Color(0xcf0000));
		for(Point p:cell){
			g.draw3DRect(p.x*size, size*p.y, size, size, true);
		}
	}
	public boolean isMovable(Block block,int direction){
		HashSet<Point> pos=block.getPos();
		for(Point p:pos){
			if(p.x<=0||p.x>=Globe.WIDTH-1){
				block.back(direction);
				return false;
			}
			if(p.y>=Globe.HEIGHT-1)
				return false;
		}
		return true;
	}
	public synchronized boolean isAccept(Block block){
		HashSet<Point> pos=block.getPos();
		for(Point p:pos){
			if(p.y>=Globe.HEIGHT-1){
				return true;
			}
			for(Point pp:forIndex){
				if(p.equals(pp))
					return true;
			}}
		return false;
	}
	public void removeLine(){
		for(int i=0;i<count;i++){
			if(forIndex[i].y==line){
				myRemove(forIndex,i);
				i--;
				continue;
			}
			if(forIndex[i].y<line)
				forIndex[i].y++;
		}}
	public boolean  isLine(){
		for(int i=Globe.HEIGHT-2;i>=0;i--){
			int lineCount=0;
			for(int j=0;j<count;j++){
				if(i==forIndex[j].y)
					lineCount++;
				//在此设置结束结束游戏
				if(forIndex[j].y==0){
					System.exit(0);
				}
			}
			if(lineCount==Globe.WIDTH-2){
				line=i;
				return true;
			}
		}
			return false;
	}
	public void restart(Controller controll){
		controll.start();
		System.exit(0);
	}
	public void myRemove(Point [] pos,int i){
		for(int j=i;j<count-1;j++){
			pos[j].setLocation(pos[j+1]);
		}
		pos[count-1]=null;
		count--;
	}

}
