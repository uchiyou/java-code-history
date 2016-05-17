package uu.GUI.review;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowsClose {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("CLose Demo");
		frame.setVisible(true);
		frame.setBounds(200,200,500,300);
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		Button button=new Button("event");
		frame.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				System.out.println("in button");
				System.exit(0);
			}

			
		});
		System.out.println("thread main ...over..");

	}

}
