package runtime.demo;

import java.io.IOException;

public class Demo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime rt=Runtime.getRuntime();
		Process p=rt.exec("notepad.exe  E:\\javatest\\Ima.java");
		//rt.exec("sublime.exe");
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.destroy();
		rt.exit(0);
		System.exit(0);

	}

}
