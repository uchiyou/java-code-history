package uu.review1;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.ListModel;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
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
public class First extends javax.swing.JFrame {
	private JSeparator jSeparator1;
	private JButton jButton1;
	private JMenuBar jMenuBar1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	private JButton jButton5;
	private JDesktopPane jDesktopPane1;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JFileChooser jFileChooser1;
	private JToolBar jToolBar1;
	private JMenu jMenu4;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JMenu jMenu1;
	private JSeparator jSeparator4;
	private JTextArea jTextArea2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				First inst = new First();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public First() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setSize(640, 518);
			}
			{
				this.setSize(612, 358);
			}
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				jMenuBar1.setBackground(new java.awt.Color(233,231,254));
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("    file   ");
					{
						jMenu2 = new JMenu();
						jMenu1.add(jMenu2);
						jMenu2.setText("open");
					}
					{
						jMenu3 = new JMenu();
						jMenu1.add(jMenu3);
						jMenu3.setText("save");
					}
					{
						jMenu4 = new JMenu();
						jMenu1.add(jMenu4);
						jMenu4.setText("Close");
					}
				}
			}
			{
				jSeparator1 = new JSeparator();
				getContentPane().add(jSeparator1);
				jSeparator1.setBounds(0, 424, 661, 10);
				jSeparator1.setForeground(new java.awt.Color(128,0,255));
				jSeparator1.setBackground(new java.awt.Color(128,0,255));
			}
			{
				jTextArea2 = new JTextArea();
				getContentPane().add(jTextArea2);
				jTextArea2.setBounds(-2, 454, 490, 92);
				jTextArea2.setForeground(new java.awt.Color(192,20,201));
				jTextArea2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
				jTextArea2.setSelectedTextColor(new java.awt.Color(128,0,128));
				jTextArea2.addKeyListener(new KeyListener(){

					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						if(e.getKeyCode()==KeyEvent.VK_ENTER){
						String area2_str=jTextArea2.getText();
						jTextArea1.append(area2_str);
					    jTextArea2.setText("");
						}
						
					}

					@Override
					public void keyReleased(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("send");
				jButton1.setBounds(594, 547, 67, 24);
			}
			{
				jSeparator4 = new JSeparator();
				getContentPane().add(jSeparator4);
				jSeparator4.setBounds(500, 172, 166, 10);
				jSeparator4.setForeground(new java.awt.Color(128,0,255));
				jSeparator4.setBackground(new java.awt.Color(128,0,255));
			}
			{
				jToolBar1 = new JToolBar();
				getContentPane().add(jToolBar1);
				jToolBar1.setBounds(-3, 427, 490, 24);
				{
					jButton2 = new JButton();
					jToolBar1.add(jButton2);
					jButton2.setText("select");
					jButton2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				}
				{
					jButton5 = new JButton();
					jToolBar1.add(jButton5);
					jButton5.setBounds(513, 527, 99, 20);
					jButton5.setPreferredSize(new java.awt.Dimension(47, 12));
					jButton5.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				}
			}
			{
				jFileChooser1 = new JFileChooser();
				getContentPane().add(jFileChooser1);
				jFileChooser1.setBounds(496, 178, 165, 247);
			}
			{
				jButton4 = new JButton();
				getContentPane().add(jButton4);
				jButton4.setText("send");
				jButton4.setBounds(588, 524, 73, 27);
				jButton4.addMouseListener(new MouseAdapter(){
					public void mousePressed(MouseEvent e){
						
						
					
			            send("127.0.0.1",9000);
						jTextArea1.append("\n");
						jTextArea2.setText("");
						
						/*
						 * send the message 
						 * and display on the top text area
						 * 
						 * still need another thread to send message to 
						 * internet
						 * 
						 * 
						 * 
						 * 
						 */
					}
				});
			}
			{
				jDesktopPane1 = new JDesktopPane();
				getContentPane().add(jDesktopPane1);
				jDesktopPane1.setBounds(495, -3, 164, 169);
				jDesktopPane1.setDoubleBuffered(true);
				jDesktopPane1.setToolTipText("what this");
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("history");
				jButton3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
				jButton3.setBounds(495, 434, 39, 17);
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(0, 1, 489, 410);
			}
			{
				jTextArea1 = new JTextArea();
				getContentPane().add(jTextArea1);
				jTextArea1.setBounds(0, -1, 486, 407);
				jTextArea1.setSelectedTextColor(new java.awt.Color(21,5,216));
				ThreadInUDPReceive task=new ThreadInUDPReceive(9000,jTextArea1);
				Thread thread=new Thread(task);
				thread.setDaemon(true);
				thread.start();
			}
			pack();
			this.setSize(682, 614);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	
	
	private  void  send(String ip,int port){
		 DatagramSocket ds=null;
		 DatagramPacket dp=null;
		 
		String line=null;
		byte [] b=new byte[1024];
		
		
			try {
				ds=new DatagramSocket();
				
				dp=new DatagramPacket(b,b.length,InetAddress.getByName(ip),port);
				
//				BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
				
				if((line=jTextArea2.getText())!=null){
					b=line.getBytes();
					ds.send(dp);
					
				}
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
	
	
	
	

}
