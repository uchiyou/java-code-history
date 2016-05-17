package snakelistener;

import found_element.Snake;

public interface SnakeListener {
	/*
	 * 蛇每次移动以后需要重新显示
	 * 他不能直接操控GamePanel
	 * 
	 * 通过使用事件监听来处理　　　　蛇每移动一次都触发此事件，然后重新绘图
	 */
	void snakeMoved(Snake snake);//蛇每移动一次，都触发一次此事件

}
