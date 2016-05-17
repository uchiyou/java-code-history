package other.other;

public class HideMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in public class");
		Subclass.main(args);

	}

}
class Subclass extends HideMain
{
	public static void main(String [] args){
		System.out.println("in subclass");
	}
}
