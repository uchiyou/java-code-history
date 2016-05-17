package test.game;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

public class NewJFrame extends javax.swing.JFrame {

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
				inst.setSize(500,470);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			{
			Canvas canvas=new Canvas();
			getContentPane().add(canvas);
			canvas.setBounds(0,0,500,399);
			canvas.setVisible(true);
			
			
			
			Graphics g=canvas.getGraphics();
			g.drawLine(0, 0, 100,300);
			g.drawString("is visible here ?",50,70);
			g.drawRect(100,100,100,100);
			
			
			}
			
			
			
			
			pack();
			setSize(500, 400);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
