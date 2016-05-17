package controll;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import listener.DownListener;

import panel.GamePanel;
import util.Globe;
import elements.Block;
import elements.Factory;
import elements.Ground;

public class Controller extends KeyAdapter implements DownListener{
	Factory factory;
	Ground ground;
	GamePanel gamePanel;
	Block block;
	
	public Controller(Factory factory,Ground ground,GamePanel gamePanel){
		this.factory=factory;
		this.ground=ground;
		this.gamePanel=gamePanel;
		this.block=factory.getBlock(this);
		gamePanel.setBlock(this.block);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int direction=-1;
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			block.rotate();
			direction=Globe.UP;
			break;
		case KeyEvent.VK_RIGHT:
			block.right();
			direction=Globe.RIGHT;
			break;
		case KeyEvent.VK_DOWN:
			block.down();
			direction=Globe.DOWN;
			break;
		case KeyEvent.VK_LEFT:
			block.left();
			direction=Globe.LEFT;
			break;
			default:;
		}
		if(!ground.isMovable(block,direction)){
			System.out.println("auto back");
		}
		if(ground.isAccept(block)){
			block.back(direction);
		ground.accept(block.getPos());
	    while(ground.isLine()){//用while而不是if因为可能同时消去两行
	    	ground.removeLine();
	    }
		block.stop();
		this.block=factory.getBlock(this);
		gamePanel.setBlock(this.block);
		this.block.start();
		}
		gamePanel.display();
		
	}
	
	public void start(){
		block.start();
	}
	
	@Override
	public void downEvent() {
		// TODO Auto-generated method stub
		if(ground.isAccept(block)){
			block.back(Globe.DOWN);
		ground.accept(block.getPos());
		if(ground.isLine()){
		    	ground.removeLine();
		    }
		block.stop();
		this.block=factory.getBlock(this);
		gamePanel.setBlock(this.block);
		this.block.start();
		}
	gamePanel.display();
		
	}
	
	

}
