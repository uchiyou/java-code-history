package controll;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import util.Globe;
import Panel.GamePanel;
import elements.Block;
import elements.Bullet;
import elements.Tank;

public class Controller extends KeyAdapter {
	int direction=-1;
	int present=0;
	Tank tank;
	GamePanel gamePanel;
	Bullet[] bullet;
	Block block;
	
	public void setBullet(Bullet[] bullet2){
		this.bullet=bullet2;
	}
	public Controller(Tank tank,GamePanel gamePanel,Block block){
		this.tank=tank;
		this.gamePanel=gamePanel;
		this.block=block;
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			direction=Globe.UP;
			tank.move(direction);
			break;
		case KeyEvent.VK_RIGHT:
			direction=Globe.RIGHT;
			tank.move(direction);
			break;
		case KeyEvent.VK_DOWN:
			direction=Globe.DOWN;
			tank.move(direction);
			break;
		case KeyEvent.VK_LEFT:
			direction=Globe.LEFT;
			tank.move(direction);
			break;
		case KeyEvent.VK_ENTER:
		//	tank.fire(direction);     why can't use the fire method
			bullet[present++].restart(tank.getPos(), direction);
			present=present%40;
			System.out.println("fire");
			break;
			default:;
		}
		if(!block.isMovable(tank.getPos())){
			tank.back(direction);
		}
		
		System.out.println("test");
		
	}

}
