package regex;

public class Exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail="1373918920@qq.com.cn";
	//	String mail="1373918920@qq.com";
		String regex="[a-zA-Z\\d_]{6,}@[a-zA-Z\\d-]+(\\.[a-zA-Z]{1,4}){1,3}";
		//String regex="\\w+@\\w+(\\.\\w+){1-3}  
		//[a-zA-Z\\d_]=\\w
		System.out.println(mail.matches(regex));

	}

}
