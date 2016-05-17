package test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

import controll.Controller;
import found.controll.GamePanel;
import found_element.Food;
import found_element.Ground;
import found_element.Snake;
import game.util.Globe;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ground ground=new Ground();
		Snake snake=new Snake(ground);
		Food food=new Food(snake);
		
		GamePanel gamePanel=new GamePanel();
		
		
		
		gamePanel.setSize(Globe.WIDTH,Globe.HEIGHT);
		
		final Controller controller=new Controller(
				snake,food,ground,gamePanel);
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,Globe.WIDTH+45,Globe.HEIGHT+90);
		frame.add(gamePanel,BorderLayout.CENTER);
		
		
		/*注册事件监听器
		 * 
		 * Controller是游戏显示面板GamePanel的案件面板的事件处理器，（实现了SnakeListener接口
		 * 
		 * Controller还是Snake的moved()的事件处理器
		 * 
		 */
		
		snake.addSnakeListener(controller);
		
	//	gamePanel.addKeyListener(controller);
		//为什么一定要加了frame.addKeyListener控制蛇的方向键才有效呢？？？？？
		frame.addKeyListener(controller);
		
		controller.newGame();
		/*
		Button restart=new Button("restart");
		restart.setBackground(Color.blue);
		restart.setLocation(0,Globe.HEIGHT);
		frame.add(restart);
		restart.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				controller.newGame();
			}
		});
		*/
		frame.setVisible(true);
		
		
		
		

	}

}
