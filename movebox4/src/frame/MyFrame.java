package frame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import util.Globe;
import element.MyCase;
import element.Sheep;
import element.Tree;
import element.Wolf;

public class MyFrame extends JFrame implements KeyListener{
	private Wolf wolf;
	private Sheep sheep;
	private Tree tree;
	private MyCase mycase;
	Icon icon_end=new ImageIcon("gameover.jpg");
	JLabel label_end=new JLabel(icon_end);
	
	
	public MyFrame(Wolf wolf,Tree tree,Sheep sheep,MyCase mycase){
		this.add(label_end);
		tree.init(this);
		mycase.init(this);
		wolf.init(this);
		sheep.init(this);

		this.wolf=wolf;
		this.sheep=sheep;
		this.tree=tree;
		this.mycase=mycase;
		
		Icon icon=new ImageIcon("floor.png");
		JLabel label=new JLabel(icon);
		label.setBounds(4,5,800,600);
		this.add(label);
		this.setBounds(200,30,Globe.SIZE*Globe.WIDTH+25,Globe.SIZE*Globe.HEIGHT+50);
		this.addKeyListener(this);
		
		
	}
	public void gameStart(){
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int direction=-1;
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			direction=Globe.UP;
			break;
		case KeyEvent.VK_RIGHT:
			direction=Globe.RIGHT;
			break;
		case KeyEvent.VK_DOWN:
			direction=Globe.DOWN;
				break;
		case KeyEvent.VK_LEFT:
			direction=Globe.LEFT;
			break;
			default:;
		}
		wolf.move(direction);
			if(sheep.isCatchable(wolf.pos)){
				sheep.move(direction);
				//如果赢了，则显示图片信息
				if(mycase.isWin(sheep.pos)){
					System.out.println("in judge is win");
					label_end.setBounds(200,100,338,146);
				}
				if(!tree.ismovable(sheep.pos[sheep.act])){
					sheep.move((direction+2)%4);
					wolf.move((direction+2)%4);
				}
			}
			if(!tree.ismovable(wolf.pos)){
				wolf.move((direction+2)%4);
			}
			
			
		}
		

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
