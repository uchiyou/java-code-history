package found.controll;


import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import found_element.Food;
import found_element.Ground;
import found_element.Snake;
import game.util.Globe;

public class GamePanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Snake snake;
    private Food food;
    private Ground ground;
   
   
    
    
	public void display(Snake snake,Food food,Ground ground){
		System.out.println("gamePanel display..");
		this.snake=snake;
		this.food=food;
		this.ground=ground;
		
		this.repaint();//repaint  ,   the method will use paintComponent(Graphics g);method
		
	}
	
	public void paintComponent(Graphics g){
		/*
		 * the function is to display again 
		 * 
		 * 通过Graphics的fill3DRect(x,y,width,height,boolean)来填充（画）蛇的body
		 * 
		 * 
		 */
	//	g.setColor("0xcfcfcf");
		
		g.setColor(new Color(0x00cfcf));
		g.fillRect(0, 0, Globe.WIDTH, Globe.HEIGHT);//清除屏幕内容
		
		
		/*
		 * 此处可能出现对象还未创建时就调用此方法，
		 * 从而引发异常
		 */
		if(snake!=null&&food!=null&&ground!=null){
		snake.drawMe(g);
	    food.drawMe(g);
		ground.drawMe(g);
		}
	}
	
}
