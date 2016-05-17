package introspector;


public class BeanUtilDemo {
	
	public void test(){
		BeanDemo bean=new BeanDemo();
		//BeanUtils.setProperty(bean,"job","pp");
		System.out.println(bean.getJob());
	}

}
