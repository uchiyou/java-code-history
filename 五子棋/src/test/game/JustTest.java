package test.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class JustTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();
		f.setBounds(300,300,500,470);
	//	f.setVisible(true);
        Canvas canvas=new Canvas(){
        	public void paint(Graphics g){
        		
        	
        	super.paint(g);
        	 g.drawLine(300, 300, 200,100);
        	}
        	
        };
        f.add(canvas);
        canvas.setBounds(0,0,500,470);
       // canvas.setVisible(true);
        f.setVisible(true);
        Graphics g=canvas.getGraphics();
        g.setPaintMode();
        g.setColor(Color.black);
        g.drawLine(300, 300, 200,100);
        g.setColor(Color.blue);

	}

}
