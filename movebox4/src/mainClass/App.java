package mainClass;

import javax.swing.JFrame;

import element.MyCase;
import element.Sheep;
import element.Tree;
import element.Wolf;
import frame.MyFrame;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		MyCase mycase=new MyCase();
		Tree tree=new Tree();
		Wolf wolf=new Wolf();
		Sheep sheep=new Sheep();
		MyFrame frame=new MyFrame(wolf,tree,sheep,mycase);
		//frame.display(tree,wolf,sheep);
	//	frame.start();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
