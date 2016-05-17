package mymain.snakegame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import cn.itcast.snake.controller.Controller;
import cn.itcast.snake.entities.Food;
import cn.itcast.snake.entities.Ground;
import cn.itcast.snake.entities.Snake;
import cn.itcast.snake.view.GamePanel;

public class MyGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake snake=new Snake();
		Food food=new Food();
		Ground ground=new Ground();
		GamePanel gamePanel=new GamePanel();
		
		Controller controller=new Controller(
				snake,food,ground,gamePanel);
		
		JFrame frame=new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(gamePanel.getSize().width+17,gamePanel.getSize().height+40);
		
		frame.add(gamePanel,BorderLayout.CENTER);
		gamePanel.addKeyListener(controller);
		
		frame.setVisible(true);
		controller.newGame();
		

	}

}
