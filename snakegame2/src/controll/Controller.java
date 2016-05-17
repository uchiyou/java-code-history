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
	//���췽������Controller��Ա��ʼ��
	public Controller(Snake snake,Food food, Ground ground,GamePanel gamePanel){
		this.snake=snake;
		this.food=food;
		this.ground=ground;
		this.gamePanel=gamePanel;
		
	}
	
	Controller(){
		
	}
	
	
	
	
	//����һ����ʼ����Ϸ�ķ���
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
		
		
	

	
	
	
	//ʵ��SnakeListener�ӿ��еķ���
	public void snakeMoved(Snake snake){
		//ͨ������GamePanel���������������ʾ
		gamePanel.display(snake, food, ground);
		
	}
	
	
	
	

}
