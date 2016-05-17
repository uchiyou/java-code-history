package uu.GUI.review;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class FrameDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("Demo");
		frame.setVisible(true);
		frame.setBounds(400,300,400,300);
		frame.setBackground(Color.blue);
		Button button=new Button("mybutton");
		button.setBounds(100,20,50,50);
		button.setBackground(Color.green);
		frame.add(button);

	}

}
