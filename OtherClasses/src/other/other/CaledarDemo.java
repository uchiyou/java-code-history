package other.other;

import java.util.Calendar;

public class CaledarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+" year "+month+" month "+day+" day ");

	}

}
