//Spackage string.first;

public class StringBufferTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer strbuf=new StringBuffer("hellow");
		strbuf.append(" zhouyou");
		System.out.println(strbuf.toString());
		strbuf.append(34);
		System.out.println(strbuf.indexOf("zhou"));
		strbuf.insert(1,'u' );
		System.out.println(strbuf.toString());
		
		

	}

}
