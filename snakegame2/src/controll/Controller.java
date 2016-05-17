package controll;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import snakelistener.SnakeListener;
import found.controll.GamePanel;
import found_element.Food;
import found_element.Ground;
import found_element.Snake;

public class Controller extends KeyAdapter implements SnakeListener{
	private Snake snake;
	private Food food;
	private Ground ground;
	private GamePanel gamePanel;
	
	private int lastkey;
	//构造方法，给Controller成员初始化
	public Controller(Snake snake,Food food, Ground ground,GamePanel gamePanel){
		this.snake=snake;
		this.food=food;
		this.ground=ground;
		this.gamePanel=gamePanel;
		
	}
	
	Controller(){
		
	}
	
	
	
	
	//创建一个开始新游戏的方法
	public void newGame(){
		snake.start();
	}
	
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("i press the key..........");
		
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			if(lastkey==KeyEvent.VK_DOWN)
				break;
			snake.changeDirection(0);
			lastkey=e.getKeyCode();
			break;
		case KeyEvent.VK_RIGHT:
			if(lastkey==KeyEvent.VK_LEFT)
				break;
			snake.changeDirection(1);
			lastkey=e.getKeyCode();
			break;
		case KeyEvent.VK_DOWN:
			if(lastkey==KeyEvent.VK_UP)
				break;
			snake.changeDirection(2);
			lastkey=e.getKeyCode();
			break;
		case KeyEvent.VK_LEFT:
			if(lastkey==KeyEvent.VK_RIGHT)
				break;
			snake.changeDirection(3);
			lastkey=e.getKeyCode();
			break;
		case KeyEvent.VK_BACK_SPACE :
			snake.changeDirection(' ');
			}
		
		}
		
		
	

	
	
	
	//实现SnakeListener接口中的方法
	public void snakeMoved(Snake snake){
		//通过调用GamePanel方法让面板重新显示
		gamePanel.display(snake, food, ground);
		
	}
	
	
	
	

}
