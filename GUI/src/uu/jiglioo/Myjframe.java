package uu.jiglioo;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;


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
public class Myjframe extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.jgoodies.looks.plastic.Plastic3DLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JTextField jTextField1;
	private JTextArea jTextArea1;
	private JButton jButton1;
	private JScrollPane jScrollPane2;
	private JMenu jMenu3;
	private JMenu jMenu2;
	private JScrollPane jScrollPane1;
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;
	private JFileChooser chooser;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Myjframe inst = new Myjframe();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Myjframe() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("file");
					{
						jMenu2 = new JMenu();
						jMenu1.add(jMenu2);
						jMenu2.setText("open");
						jMenu2.addMouseListener(new MouseAdapter() {
							public void mousePressed(MouseEvent evt) {
								//System.out.println("jMenu2.mousePressed, event="+evt);
								//TODO add your code for jMenu2.mousePressed
								chooser=new JFileChooser();
								
								//显示对话框
								/*  文件过滤器
								FileNameExtensionFilter filter = new FileNameExtensionFilter(
								        "JPG & GIF Images", "jpg", "gif");
								    chooser.setFileFilter(filter);
								    */
								    int returnVal = chooser.showOpenDialog(chooser);//打开对话框
								    if(returnVal == JFileChooser.APPROVE_OPTION) {
								       System.out.println("You chose to open this file: " +
								            chooser.getSelectedFile().getName());
								    }
								    else{
								    	System.out.println("you not choose a file ");
								    	System.exit(0);
								    }
								    //将文件内容显示出来
								    File file=chooser.getSelectedFile();
								    try {
										BufferedReader buf=new BufferedReader(new FileReader(file));
										 String str=null;
										   
												while((str=buf.readLine())!=null)
													jTextArea1.append(str+System.getProperty("line.separator"));
												
										   buf.close();
									} catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									} catch (IOException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								   
								 
								
							}
						});
					}
					{
						jMenu3 = new JMenu();
						jMenu1.add(jMenu3);
						jMenu3.setText("save");
						jMenu3.addMouseListener(new MouseAdapter(){
							public void mousePressed(MouseEvent e) {
								// TODO Auto-generated method stub
								JFileChooser chooser=new JFileChooser();
								 int returnVal = chooser.showSaveDialog(chooser);//打开对话框
								    if(returnVal == JFileChooser.APPROVE_OPTION) {
								       System.out.println("You chose to open this file: " +
								            chooser.getSelectedFile().getName());
								       
								       
								    }
								    else{
								    	System.out.println("you not choose a file ");
								    	System.exit(0);
								    }
								    
								    //文件保存部分
								    
								    File f1=chooser.getSelectedFile();
								       String str1=jTextArea1.getText();
								       try {
										BufferedWriter buf1=new BufferedWriter(new FileWriter(f1));
										buf1.write(str1);
										buf1.close();
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								       
								
							}
							
						});
					}
				}
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1, "Center");
				jTextField1.setBounds(0, 36, 383, 35);
				jTextField1.addKeyListener(new KeyAdapter(){
					public void keyPressed(KeyEvent ke){
						if(ke.getKeyCode()==KeyEvent.VK_ENTER){
							jTextArea1.setText("");
							String dir_str=jTextField1.getText();
							File list=new File(dir_str);
							if(list.exists()&&list.isDirectory()){
								for(String name : list.list()){
									jTextArea1.append(name+System.getProperty("line.separator"));
								}
							}
						}
					}
				});
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("jButton");
				jButton1.setBounds(402, 37, 82, 34);
				jButton1.addActionListener(new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						jTextArea1.setText("");
						String dir_str=jTextField1.getText();
						File list=new File(dir_str);
						if(list.exists()&&list.isDirectory()){
							for(String name : list.list()){
								jTextArea1.append(name+System.getProperty("line.separator"));
							}
						}
						
					}
					
				});
			}
			{
				jScrollPane2 = new JScrollPane();
				getContentPane().add(jScrollPane2);
 			jScrollPane2.setBounds(1, 110, 484, 246);
				{
					jTextArea1 = new JTextArea();
					jScrollPane2.setViewportView(jTextArea1);
					jTextArea1.setBounds(1, 83, 484, 246);
				}
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
				jScrollPane1.setBounds(115, 174, 10, 10);
			}
			pack();
			this.setSize(500, 433);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
       }
  }

 }
