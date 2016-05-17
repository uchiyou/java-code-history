package panel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import util.Globe;
import elements.Block;
import elements.Ground;

public class GamePanel extends JPanel{
	
	private Block block;
	private Ground ground;
	public void setBlock(Block block){
		this.block=block;
	}
	public GamePanel(Ground ground){
		this.ground=ground;
	}
	
	public void display(){
		repaint();
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.clearRect(0,0,Globe.WIDTH*Globe.SIZE, Globe.HEIGHT*Globe.SIZE);
		g.setColor(new Color(0xc000ccf));
		ground.drawMe(g);
		block.drawMe(g);
	}
	
	

}
