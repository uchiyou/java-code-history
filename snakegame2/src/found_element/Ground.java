package found_element;

import game.util.Globe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Ground {
	/*
	 * 用一个二维数组来记录石头的数据，
	 * ０表示没有石头，１，表示有石头
	 * 蛇头的坐标和石头的坐标相等，就算蛇吃到了食物
	 */
	private int[][] stone=new int[Globe.SIZE][Globe.SIZE];
	{
		for(int i=0;i<Globe.SIZE;i++){
			stone[0][i]=1;
			stone[Globe.SIZE-1][i]=1;
			stone[i][0]=1;
			stone[i][Globe.SIZE-1]=1;
		}
	}
	
	public Graphics g;
	public boolean isSnakeEatRocket(Point head){
		System.out.println("ground is Snake eat rock.. ");
		int len=Globe.SIZE;
		int size=Globe.CELL_SIZE;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(stone[i][j]==1){
				if(head.x==i*size&&head.y==j*size)
					return true;
				}
			}
		}
		return false;
	}
	
	public void drawMe(Graphics g){
		this.g=g;
		System.out.println("ground draw me");
		int length=Globe.SIZE;
		int size=Globe.CELL_SIZE;
		g.setColor(new Color(0x330033));
		for(int i=0;i<length;i++){
			for(int j=0;j<length;j++){
				if(stone[i][j]==1)
				g.draw3DRect(i*size, j*size, size, size, true);
			}
		}
	}

}
