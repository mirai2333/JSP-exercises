package common;

import java.util.Calendar;

public class CurrentDate {
	public int getCurrentDate() {
		int year,month,day,currentDate;
		
		Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH)+1;
		day = c.get(Calendar.DAY_OF_MONTH);
		
		currentDate = year*10000+month*100+day;
		return currentDate;
	}
}
