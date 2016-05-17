package found_element;

import game.util.Globe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Food {
	 private int x=myRandom();
	    private int y=myRandom();
	private Snake snake;
	
	    public Food(Snake snake){
	    	this.snake=snake;
	    }
	   
	public boolean isSnakeEatFood(Snake snake){
		System.out.println("food is snake eat food..");
		/*
		 * 若果蛇头的位置等于食物的位置，就算蛇吃了食物
		 */
		Point spoint=snake.body.getFirst();
		if(spoint.x==x&&spoint.y==y){
			return true;
		}
		else{
		return false;
		}
	}
	/*
	 * 如果蛇吃到食物，就在COntroller中把随机数传给drawMe方法
	 */
	public void drawMe(Graphics g){
		System.out.println("food drawMe..");
		
		g.setColor(new Color(0x00cf00));
		//每次重绘前判断一次蛇是否吃了食物，若吃了，则在另一个位置显示食物
		if(isSnakeEatFood(snake)){
			x=myRandom();
			y=myRandom();
			snake.body.addLast(snake.body.getLast());
		}
		g.fill3DRect(x, y, Globe.CELL_SIZE,Globe.CELL_SIZE, true);
		
	}
	private static int myRandom(){
		
		return ((int)( Math.floor((Math.random())*(Globe.SIZE-2)))+1)*Globe.CELL_SIZE;
	}

	
}
