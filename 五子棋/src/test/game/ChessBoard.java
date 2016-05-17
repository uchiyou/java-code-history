package test.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JEditorPane;

import javax.swing.WindowConstants;
import javax.swing.JFrame;


public class ChessBoard extends javax.swing.JPanel {

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
    private	final int FIRST_DOT=0;
    private final int MARGIN=0;
	private final int SPAN=50;
	private final int COWS=10;
	private final int COLS=10;
	private final int CHESS_COUNT=100;
	public Point [] chesslist=new Point[(COWS+1)*(1+COLS)];

	
	
	public ChessBoard() {
		super();
		initGUI();
		//addMouseMotionListener(this);
		this.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				int X1=(e.getX()-MARGIN+SPAN/2)/SPAN;
				int Y1=(e.getY()-MARGIN+SPAN/2)/SPAN;
				while(X1<0||X1>COWS||Y1<0||Y1>COLS)
					System.out.println("please client in the chess board ");
			}
			
		});
		
		
		
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(290, 232));
			this.setBackground(new java.awt.Color(255,255,128));
			this.setLayout(null);
			
			
			Panel panel=new Panel()
			{
				
				
				
				
				public void paint(Graphics g){
					super.paint(g);
					//g.drawLine(0, 0, 100,300);
					g.setColor(Color.red);
					//draw the grid   
					
					for(int i=0;i<=COWS;i++){
						g.drawLine(FIRST_DOT,FIRST_DOT+i*SPAN,COWS*SPAN,i*SPAN);
					}
					for(int i=0;i<=COLS;i++){
						g.drawLine(FIRST_DOT+i*SPAN,FIRST_DOT,i*SPAN,COLS*SPAN);
					}
					for(int i=0;i<COWS*COLS;i++){
						
					}

					
					
					
					
					
				}
			};
			//getContentPane().add(panel);
			panel.setBounds(0, 0, 500, 500);
			panel.setBackground(new java.awt.Color(192,192,192));
		//	canvas.setVisible(true);
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
