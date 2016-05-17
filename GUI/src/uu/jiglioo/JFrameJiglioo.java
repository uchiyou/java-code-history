package uu.jiglioo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
public class JFrameJiglioo extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jTextField1;
	private JButton jButton1;
	private JTextArea jTextArea1;
	private final String LINE_SEPARATOR=System.getProperty("line.separator");

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrameJiglioo inst = new JFrameJiglioo();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public JFrameJiglioo() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(6, 28, 359, 39);
				jTextField1.addKeyListener(new KeyAdapter() {
					public void keyPressed(KeyEvent e){
						if(e.getKeyCode()==KeyEvent.VK_ENTER)
							show();
					}
				});
			}
			
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("see");
				jButton1.setBounds(377, 12, 86, 37);
				jButton1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent evt) {
						
						//TODO add your code for jButton1.actionPerformed
						show();
				}});

				jTextArea1 = new JTextArea();
				getContentPane().add(jTextArea1);
				jTextArea1.setBounds(6, 93, 466, 290);
			pack();
			this.setSize(500, 421);
		}
			catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();}
		}
		public void show()
		{
			jTextArea1.setText("");
			String dir_str=jTextField1.getText();
			File file=new File(dir_str);
			if(file.exists()&&file.isDirectory()){
				String[] names=file.list();
				for(String name : names){
					jTextArea1.append(name+LINE_SEPARATOR);
		}
	}
		}
}
