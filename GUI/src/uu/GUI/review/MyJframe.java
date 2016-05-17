package uu.GUI.review;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MyJframe extends javax.swing.JFrame {
	private JButton jButton1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MyJframe inst = new MyJframe();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MyJframe() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			getContentPane().setLayout(null);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Mybutton");
				jButton1.setBounds(198, 22, 107, 28);
				jButton1.setForeground(new java.awt.Color(255,255,0));
				jButton1.setBackground(new java.awt.Color(0,64,128));
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.out.println("jButton1.actionPerformed, event="+evt);
						//TODO add your code for jButton1.actionPerformed
						System.exit(0);
					}
				});
			}
			pack();
			this.setSize(500, 248);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	public JButton getJButton1() {
		return jButton1;
	}

}
