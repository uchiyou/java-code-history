package game.start.panel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

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
public class StartPanel extends javax.swing.JFrame {
	private JMenuBar jMenuBar1;
	private JButton jButton1;
	private JButton jButton3;
	private JButton jButton2;
	private JMenu jMenu4;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JMenu jMenu1;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				StartPanel inst = new StartPanel();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public StartPanel() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			this.setTitle("\u5355\u673a\u7248\u4e94\u5b50\u68cb");
			getContentPane().setLayout(null);
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1, "Center");
				jButton1.setText("\u91cd\u65b0\u5f00\u59cb");
				jButton1.setBounds(0, 304, 93, 26);
				jButton1.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent me){
					/*
					 * the same with the next
					 * restart
					 * 
					 * 
					 * 
					 * 
					 */
				}
				});
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("\u6094\u68cb");
				jButton2.setBounds(305, 305, 71, 24);
				jButton2.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent me){
					/*
					 * the same with another 
					 * »ÚÆå
					 * 
					 * 
					 * 
					 * 
					 */
				}
				});
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("\u9000\u51fa");
				jButton3.setBounds(391, 305, 71, 23);
				jButton3.addMouseListener(new MouseAdapter(){
					public void mousePressed(MouseEvent me){
						/*
						 * the same with another
						 * 
						 * EXIT
						 * 
						 * 
						 * 
						 * 
						 */
					}
				});
			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("\u7cfb\u7edf");
					{
						jMenu2 = new JMenu();
						jMenu1.add(jMenu2);
						jMenu2.setText("\u91cd\u65b0\u5f00\u59cb");
						jMenu2.addMouseListener(new MouseAdapter(){
							public void mousePressed(MouseEvent  me){
								/*
								 * the same with the last 
								 * restart
								 * 
								 * 
								 */
							}
						});
					}
					{
						jMenu3 = new JMenu();
						jMenu1.add(jMenu3);
						jMenu3.setText("\u6094\u68cb");
						jMenu3.addMouseListener(new MouseAdapter(){
						public void mousePressed(MouseEvent me){
							/*
							 * 
							 * the same with another
							 * »ÚÆå
							 * 
							 * 
							 * 
							 * 
							 */
						}
						});
					}
					{
						jMenu4 = new JMenu();
						jMenu1.add(jMenu4);
						jMenu4.setText("\u9000\u51fa");
						jMenu4.addMouseListener(new MouseAdapter(){
						public void mousePressed(MouseEvent me){
							/*
							 * the same code with another
							 * 
							 * EXIT
							 * 
							 * 
							 * 
							 */
						}
						});
					}
				}
			}
			pack();
			this.setSize(483, 400);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
