package maingame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import panel.GamePanel;
import util.Globe;
import controll.Controller;
import elements.Factory;
import elements.Ground;

public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		Ground ground=new Ground();
		GamePanel gamePanel=new GamePanel(ground);
	    Controller controller=new Controller(factory,ground,gamePanel);
	    
	    JFrame frame =new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(gamePanel,BorderLayout.CENTER);
	    frame.setBounds(200,100,Globe.SIZE*Globe.WIDTH+20,Globe.SIZE*Globe.HEIGHT+50);
	   // gamePanel.addKeyListener(controller);
	    frame.addKeyListener(controller);
	    
	    frame.setVisible(true);
	    
	    controller.start();

	}

}
