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
	//定义一些常量和字段用来控制蛇的运动方向和范围
	private static final int UP=0;
	private static final int RIGHT=1;
	private static final int DOWN=2;
	private static final int LEFT=3;
	
	private int direction;
	//蛇初始的位置,蛇的长度
	private static final int x0= (int) (Globe.CELL_SIZE*(Math.ceil(Globe.SIZE/2)));
	private static final int y0=(int) (Globe.CELL_SIZE*(Math.ceil(Globe.SIZE/2)));
	private static final int blength=3;
	
	private Ground ground;
	/*
	 * 用LinkedList来存储snake的身体
	 * 
	 * LinkedList是队列，有addFirst(),removeLast()等方法刚好满足蛇移动时头部增加一个格，
	 * 尾部擦除一个格
	 * 
	 */
	LinkedList<Point> body=new LinkedList<Point>();
	//蛇的监听器组,既然有了监听器了，就应该提供添加监听器的方法
	Set<SnakeListener> listeners=new HashSet<SnakeListener>();
	
	private boolean flag=true;
	private void setFlag(){
		if(flag)
			flag=false;
		else 
			flag=true;
	}
	/*
	 * 在蛇中初始化蛇的初始坐标，方向，长度
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
		 * 一开始只有２节body是因为用了addLast，第一次移动时向右，而添加的尾部也在右边
		 * 导致头部和身体的一部分重叠
		 */
		
		}
	}
	
	
	public void move(){//用LinkedList来存储，first表示蛇头，last表示蛇尾
	System.out.println("snake move..");
	
	
	
	//获取蛇头原来位置的坐标
	int x=body.getFirst().x;
	int y=body.getFirst().y;
	int size=Globe.CELL_SIZE;
	//用switch语句来确定新增蛇头位置
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
	//创建Point对象，作为蛇的新的头部位置，作为参数传递
	Point newHead=new Point(x,y);
	//　　　１　　增加蛇头
	body.addFirst(newHead);//应以一个坐标为参数在指定位置添加蛇头
	
	
	
	//　　２　　擦除蛇尾
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
	 * 如果蛇头的坐标和身体的任何一节的坐标相同，就算是撞到自己身体
	 * 
	 * 每一次移动时都需要调用此方法
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
		//蛇的头吃到最后一节时，it.hasNext()返回false,故循环外也要判断一次
			
		return false;
	}
	
	public void drawMe(Graphics g){//需要接受Graphics在此画布上画图
		/*
		 * 以填充格子的方式来画蛇的身体
		 * 这需要四个参数　x y width height
		 */
		
		g.setColor(new Color(0xcfcf00));
		/*
		 * 之所以能在这设置颜色，是因为用这设置的颜色画了一小块区域后
		 * 线程睡眠呢100毫秒
		 *再用底色擦掉原来的颜色
		 */
		System.out.println("snake drawMe...");
		//通过遍历蛇的body来获取要画的蛇的身体的每一个格子的坐标
		for(Point point : body){
			g.fill3DRect(point.x,point.y, 
					Globe.CELL_SIZE, Globe.CELL_SIZE, true);
		}
		
	}
	
	private class SnakeDriver implements Runnable{
		/*
		 * (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 * 在游戏没结束前，蛇一直在不断的运动，
		 * 这用一个线程来封装
		 */
		Ground ground;
		public SnakeDriver(){
			
		}
		public SnakeDriver(Ground ground){
			this.ground=ground;
		}
		public void run(){
			while(flag){
				move();//是使蛇不断移动
				//暂时写成，如果撞到自己身体，就退出系统
				if(ground.isSnakeEatRocket(body.getFirst())||isEatBody()){
					flag=false;
					break;
				}
				System.out.println(".................."+listeners.size());
				for(SnakeListener sl : listeners){
					sl.snakeMoved(Snake.this);//Snake.this是什么意思??????????
				}
				
				/*
				 * 蛇每次移动都要触发一次事件，蛇在这里移动的，就在这里触发事件
				 * 
				 * 由Controller来实现这个接口
				 */
				try{
					Thread.sleep(1000);
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		
	}
	
	
	//给蛇提供一个启动线程的方法,让蛇开始在另一个线程中运动
	public void start(){
		setFlag();
		body.clear();
		init();
		setFlag();
		new Thread(new SnakeDriver(ground)).start();
		
	}
	
	
	//给蛇添加监听器的方法１
	public void addSnakeListener(SnakeListener snakeListener){
		if(snakeListener!=null){
			this.listeners.add(snakeListener);
		}
	}
	

}
