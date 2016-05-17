package introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class IntrospectorDemo {
	
	@Test
	public void test() throws Exception{//get all of the property of bean
		//get bean info 
           BeanInfo beanInfo=Introspector.getBeanInfo(BeanDemo.class);
           //get the property of bean
           PropertyDescriptor pro[]=beanInfo.getPropertyDescriptors();
           //oversee the property of bean
           for(PropertyDescriptor p:pro){
        	   System.out.println(p.getName());
           }
	}
	//change and read the property
	@Test
	public void test2() throws IntrospectionException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{//get the specify property of bean
		PropertyDescriptor pro=new PropertyDescriptor("job",BeanDemo.class);
		System.out.println(pro.getName()+"\n"+pro.getShortDescription());
		//get the write method 
		Method write=pro.getWriteMethod();
		BeanDemo bean=new BeanDemo();
		write.invoke(bean, "career");
		/*System.out.println(bean.getJob());*/
		
		
		Method read=pro.getReadMethod();
		System.out.println(read.invoke(bean, null));
	}
	//get the type of the property
	@Test
	public void test4() throws Exception{
		PropertyDescriptor pro=new PropertyDescriptor("age",BeanDemo.class);
		
/*		PropertyDescriptor pro=new PropertyDescriptor("age",BeanDemo.class);
 * why the sentence is been saw a error????????????????????????
*/		
		
		Class<?> type=pro.getPropertyType();
		System.out.println(type);
	}

}
