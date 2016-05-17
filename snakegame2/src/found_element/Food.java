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
		 * ������ͷ��λ�õ���ʳ���λ�ã������߳���ʳ��
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
	 * ����߳Ե�ʳ�����COntroller�а����������drawMe����
	 */
	public void drawMe(Graphics g){
		System.out.println("food drawMe..");
		
		g.setColor(new Color(0x00cf00));
		//ÿ���ػ�ǰ�ж�һ�����Ƿ����ʳ������ˣ�������һ��λ����ʾʳ��
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
