package found_element;

import game.util.Globe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import snakelistener.SnakeListener;

public class Snake {
	//����һЩ�������ֶ����������ߵ��˶�����ͷ�Χ
	private static final int UP=0;
	private static final int RIGHT=1;
	private static final int DOWN=2;
	private static final int LEFT=3;
	
	private int direction;
	//�߳�ʼ��λ��,�ߵĳ���
	private static final int x0= (int) (Globe.CELL_SIZE*(Math.ceil(Globe.SIZE/2)));
	private static final int y0=(int) (Globe.CELL_SIZE*(Math.ceil(Globe.SIZE/2)));
	private static final int blength=3;
	
	private Ground ground;
	/*
	 * ��LinkedList���洢snake������
	 * 
	 * LinkedList�Ƕ��У���addFirst(),removeLast()�ȷ����պ��������ƶ�ʱͷ������һ����
	 * β������һ����
	 * 
	 */
	LinkedList<Point> body=new LinkedList<Point>();
	//�ߵļ�������,��Ȼ���˼������ˣ���Ӧ���ṩ��Ӽ������ķ���
	Set<SnakeListener> listeners=new HashSet<SnakeListener>();
	
	private boolean flag=true;
	private void setFlag(){
		if(flag)
			flag=false;
		else 
			flag=true;
	}
	/*
	 * �����г�ʼ���ߵĳ�ʼ���꣬���򣬳���
	 */
	public Snake(Ground ground){
		this.ground=ground;
		init();
	}
	private void init(){
		direction=1;
		for(int i=0;i<blength;i++){
		body.addFirst(new Point(x0+i*Globe.CELL_SIZE,y0));
		/*
		 * һ��ʼֻ�У���body����Ϊ����addLast����һ���ƶ�ʱ���ң�����ӵ�β��Ҳ���ұ�
		 * ����ͷ���������һ�����ص�
		 */
		
		}
	}
	
	
	public void move(){//��LinkedList���洢��first��ʾ��ͷ��last��ʾ��β
	System.out.println("snake move..");
	
	
	
	//��ȡ��ͷԭ��λ�õ�����
	int x=body.getFirst().x;
	int y=body.getFirst().y;
	int size=Globe.CELL_SIZE;
	//��switch�����ȷ��������ͷλ��
	switch(direction){
	case UP:
		y-=size;
		if(y<0)
			y=Globe.HEIGHT-size;
		
		break;
	case RIGHT:
		x+=size;
		if(x>=Globe.WIDTH)
			x=0;
		break;
	case DOWN:
		y+=size;
		if(y>=Globe.HEIGHT)
			y=0;
		break;
	case LEFT:
		x-=size;
		if(x<0)
			x=Globe.WIDTH-size;
		break;
	case ' ':
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
		default: ;
	
	}
	//����Point������Ϊ�ߵ��µ�ͷ��λ�ã���Ϊ��������
	Point newHead=new Point(x,y);
	//������������������ͷ
	body.addFirst(newHead);//Ӧ��һ������Ϊ������ָ��λ�������ͷ
	
	
	
	//����������������β
	body.removeLast();
	}
	
	public void changeDirection(int direction){
		System.out.println("snake changeDirection..");
		this.direction =direction;
	
	}
	
	public void eatFood(){
		System.out.println("snake eatFood..");
	}
	/*
	 * �����ͷ�������������κ�һ�ڵ�������ͬ��������ײ���Լ�����
	 * 
	 * ÿһ���ƶ�ʱ����Ҫ���ô˷���
	 */
	public boolean isEatBody(){
		System.out.println("snake isEatBody..");
		Iterator<Point> it=body.iterator();
		Point head=it.next();
		Point p=it.next();
		for(;it.hasNext();p=it.next()){
			if(head.x==p.x&&head.y==p.y)
				return true;
		}
		if(head.x==p.x&&head.y==p.y)
			return true;
		//�ߵ�ͷ�Ե����һ��ʱ��it.hasNext()����false,��ѭ����ҲҪ�ж�һ��
			
		return false;
	}
	
	public void drawMe(Graphics g){//��Ҫ����Graphics�ڴ˻����ϻ�ͼ
		/*
		 * �������ӵķ�ʽ�����ߵ�����
		 * ����Ҫ�ĸ�������x y width height
		 */
		
		g.setColor(new Color(0xcfcf00));
		/*
		 * ֮����������������ɫ������Ϊ�������õ���ɫ����һС�������
		 * �߳�˯����100����
		 *���õ�ɫ����ԭ������ɫ
		 */
		System.out.println("snake drawMe...");
		//ͨ�������ߵ�body����ȡҪ�����ߵ������ÿһ�����ӵ�����
		for(Point point : body){
			g.fill3DRect(point.x,point.y, 
					Globe.CELL_SIZE, Globe.CELL_SIZE, true);
		}
		
	}
	
	private class SnakeDriver implements Runnable{
		/*
		 * (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 * ����Ϸû����ǰ����һֱ�ڲ��ϵ��˶���
		 * ����һ���߳�����װ
		 */
		Ground ground;
		public SnakeDriver(){
			
		}
		public SnakeDriver(Ground ground){
			this.ground=ground;
		}
		public void run(){
			while(flag){
				move();//��ʹ�߲����ƶ�
				//��ʱд�ɣ����ײ���Լ����壬���˳�ϵͳ
				if(ground.isSnakeEatRocket(body.getFirst())||isEatBody()){
					flag=false;
					break;
				}
				System.out.println(".................."+listeners.size());
				for(SnakeListener sl : listeners){
					sl.snakeMoved(Snake.this);//Snake.this��ʲô��˼??????????
				}
				
				/*
				 * ��ÿ���ƶ���Ҫ����һ���¼������������ƶ��ģ��������ﴥ���¼�
				 * 
				 * ��Controller��ʵ������ӿ�
				 */
				try{
					Thread.sleep(1000);
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	//�����ṩһ�������̵߳ķ���,���߿�ʼ����һ���߳����˶�
	public void start(){
		setFlag();
		body.clear();
		init();
		setFlag();
		new Thread(new SnakeDriver(ground)).start();
		
	}
	
	
	//������Ӽ������ķ�����
	public void addSnakeListener(SnakeListener snakeListener){
		if(snakeListener!=null){
			this.listeners.add(snakeListener);
		}
	}
	

}
