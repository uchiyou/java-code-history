package Panel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;
import elements.Block;
import elements.Bullet;
import elements.Tank;
import elements.Wicked;

public class GamePanel extends JFrame{
	private Tank tank;
	private Wicked wick;
	private Block block;
	private Bullet[] bullet;
	
	Icon icon=new ImageIcon("backgrouund2.jpg");
	JLabel label=new JLabel(icon);
	
	public GamePanel(Block block){
		this.block=block;
	}
	public void setTank(Tank tank) {
		this.tank = tank;
	}
	public void setWick(Wicked wick) {
		this.wick = wick;
	}
	public void setBullet(Bullet[] bullet) {
		this.bullet = bullet;
	}
	public GamePanel(Tank tank,Wicked wick,Block block,Bullet[] bullet){
		tank.init(this);
		wick.init();
		block.init(this);
		for(int i=0;i<bullet.length;i++)
		bullet[i].init(this);
		
		this.tank=tank;
		this.wick=wick;
		this.block=block;
		this.bullet=bullet;
		
		label.setBounds(0,0,Globe.SIZE*Globe.WIDTH,Globe.SIZE*Globe.HEIGHT);
		this.setBounds(200,100,Globe.SIZE*Globe.WIDTH+25,Globe.SIZE*Globe.HEIGHT+45);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(label);
	}
	
	}
