package uu.GUI.review;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyEvent {
	private static Frame frame;
	private static TextField tf;
	 MouseAndKeyEvent(){
		init();
	}
	 static Button button;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program start....");
		init();
		mouseevent();
		
	

	}
	private static void init(){
		frame=new Frame();
		frame.setBounds(400,200,500,300);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		tf=new TextField(20);
		frame.add(tf);
		tf.setBounds(30,30,50,50);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
	
		//键盘监听事件
		tf.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
		//		System.out.println("key had press..."+e.getKeyChar()+".."+e.getKeyCode());
			//	System.out.println("......"+KeyEvent.getKeyText(e.getKeyCode()));
				//tf.setText("..."+e.getKeyCode());
				//e.consume();
				if(e.getKeyCode()==KeyEvent.VK_K&&e.getKeyCode()==KeyEvent.VK_L){
					System.out.println("you had press RNTER");
				}
			}
		});
		
		
	}
	private static void mouseevent(){
		button=new Button("test");
		frame.add(button);
		
		//鼠标进入事件
		button.addMouseListener(new MouseAdapter(){
			private int count=0;
			public void mouseEntered(MouseEvent e){
				//System.out.println("mouse in....");
				tf.setText("mouse entered..."+count++);
			}
			
			
			//鼠标点击事件
			public void mouseClicked(MouseEvent e){
				//鼠标双击事件
				if(e.getClickCount()==2)
				System.out.println("mouse double clicked...");
			}
		
		});
		
		
		//活动监听事件
	/*	button.addActionListener(new ActionListener(){//活动事件反应慢于鼠标点击事件

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//	tf.setText("actionPerformer mothod ...");
				System.out.println("actionPerformed  ...");
				
			}
		
		});
		*/
		
		
	}
	

}
