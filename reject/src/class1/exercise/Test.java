package class1.exercise;

import java.awt.Point;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test {

	/**
	 * @param args
	 */
	private static  Set<Point> point1=new HashSet<Point>();
	private static  Set<Point> point2=new HashSet<Point>();
	private Set<Point> style=null;
	private Random random=new Random();
	static int size=10;
	
	private int style_i;
	private int style_j;
	
	
	static {
		int mid=(int)(10)-1;
		for(int i=mid-1;i<mid+2;i++){
			point1.add(new Point(i*size,-1));
		}
		for(int i=-3;i<0;i++){
			point2.add(new Point(mid,i*size));
		}
		
	}
	private static Set<Point>[][] p;
	//初始化所有形状
	static{
		int mi=(int)(10)-1;
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				p[i][j]=new HashSet<Point>();
				
				if(j<2){
				p[i][j].containsAll(point1);
				if(j==0){
					p[i][j].add(new Point(mi-1+i,-2));
				}else{
					p[i][j].add(new Point(mi-1+i,0));
				}}
				
				else{
					p[i][j].containsAll(point2);
					if(j==3){
						p[i][j].add(new Point(mi+1,-3+i));
					}else{
						p[i][j].add(new Point(mi-1,-3+i));
					}}
			}}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p=new Point(1,1);
		System.out.println(p.x);
		p.x+=1;
		System.out.println(p.x);
	}

}
