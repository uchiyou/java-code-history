package elements;

import java.awt.Point;
import java.util.HashSet;
import java.util.Random;

import listener.DownListener;
import util.Globe;

public class Factory {
	private HashSet<Point>[] shape;
	
	public Block getBlock(DownListener listener){
		this.shape=randomShape();
		Block block=new Block();
		block.addDownListener(listener);
		block.setShape(shape);

		return block;
	}
	public HashSet<Point> [] randomShape(){
		Random rand=new Random();
		int shapenum=rand.nextInt(5);
		switch(shapenum){
		case 0:
			return shapeOne();
		case 1:
			return shapeTwo();
		case 2:
			return shapeThree();
		case 3:
			return shapeFour();
		case 4:
			return shapeFive();
			default:;
		}
		return shapeOne();
	}
	
	public HashSet<Point> [] productLine(){
		HashSet<Point> [] shape=new HashSet[4];
		for(int i=0;i<shape.length;i++){
			shape[i]=new HashSet<Point>();;
		}
		for(int i=0;i<3;i++){
			shape[0].add(new Point((int)(Globe.WIDTH/2)-2+i,-1));
			shape[1].add(new Point((int)(Globe.WIDTH/2)-1,-3+i));
			shape[2].add(new Point((int)(Globe.WIDTH/2)-2+i,-2));
			shape[3].add(new Point((int)(Globe.WIDTH/2)-1,-3+i));
		}
		return shape;
	}
	public HashSet<Point> [] shapeOne(){
		HashSet<Point> [] shape=productLine();
		shape[0].add(new Point((int)(Globe.WIDTH/2)-1,-2));
		shape[1].add(new Point((int)(Globe.WIDTH/2),-2));
		shape[2].add(new Point((int)(Globe.WIDTH/2)-1,-1));
		shape[3].add(new Point((int)(Globe.WIDTH/2)-2,-2));
		return shape;
	}
	public HashSet<Point> [] shapeTwo(){
		HashSet<Point> [] shape=productLine();
		shape[0].add(new Point((int)(Globe.WIDTH/2)-2,-2));
		shape[1].add(new Point((int)(Globe.WIDTH/2),-3));
		shape[2].add(new Point((int)(Globe.WIDTH/2),-1));
		shape[3].add(new Point((int)(Globe.WIDTH/2)-2,-1));
		return shape;
	}
	public HashSet<Point> [] shapeThree(){
		HashSet<Point> [] shape=productLine();
		shape[0].add(new Point((int)(Globe.WIDTH/2),-2));
		shape[1].add(new Point((int)(Globe.WIDTH/2),-1));
		shape[2].add(new Point((int)(Globe.WIDTH/2)-2,-1));
		shape[3].add(new Point((int)(Globe.WIDTH/2)-2,-3));
		return shape;
	}
	public HashSet<Point> [] shapeFour(){
		HashSet<Point> [] shape=productLine();
		shape[0].add(new Point((int)(Globe.WIDTH/2)-3,-1));
		shape[1].add(new Point((int)(Globe.WIDTH/2)-1,-4));
		shape[2].add(new Point((int)(Globe.WIDTH/2)-3,-2));
		shape[3].add(new Point((int)(Globe.WIDTH/2)-1,0));
		return shape;
	}
	public HashSet<Point> [] shapeFive(){
		HashSet<Point> [] shape=new HashSet[4];
		for(int i=0;i<shape.length;i++){
			shape[i]=new HashSet<Point>();
		}
		System.out.println("..........");
		for(int i=0;i<4;i++){
			for(int j=0;j<2;j++){
		    shape[i].add(new Point((int)(Globe.WIDTH/2)-2+j,-2));
			shape[i].add(new Point((int)(Globe.WIDTH/2)-2+j,-1));
			}
		}
		
		return shape;
		
	}

}
