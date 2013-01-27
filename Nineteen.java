import java.util.*;

//How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)? 
public class Nineteen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(1901,1,1);
		int sundays = 0;
		while(!(cal.get(Calendar.YEAR)==2000 && cal.get(Calendar.MONTH)==Calendar.DECEMBER && cal.get(Calendar.DAY_OF_MONTH)==31)){
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY && cal.get(Calendar.DAY_OF_MONTH) == 1)
				sundays++;
			cal.add(Calendar.DAY_OF_YEAR, 1);
			//System.out.println(cal.toString() + sundays);
		}
		System.out.println(sundays);
	}
}
