package game;

import java.awt.Point;

import util.Globe;
import Panel.GamePanel;
import controll.Controller;
import elements.Block;
import elements.Bullet;
import elements.Tank;
import elements.Wicked;

public class Game {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank=new Tank();
		Wicked wick=new Wicked();
		Block block=new Block();
		Bullet[] bullet=new Bullet[40];
	      for(int i=0;i<bullet.length;i++)
				bullet[i]=new Bullet(new Point(0,0),Globe.DOWN);
	
		GamePanel gamePanel=new GamePanel(tank,wick,block,bullet);
		gamePanel.setVisible(true);
		
		Controller controller=new Controller(tank,gamePanel,block);
		controller.setBullet(bullet);
		gamePanel.addKeyListener(controller);
		

	}

}
