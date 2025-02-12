package chapter20;

import java.util.Calendar;

public class CalendarPractice {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020,0,1);
		
		for(int i=0; i<12; i++) {
			int weekday = cal.get(Calendar.DAY_OF_WEEK);
			int secondSunday = (weekday==1) ? 8:16 -weekday;
			
		cal.set(Calendar.DAY_OF_MONTH, secondSunday);
		
//		Date d = cal.getTime(); // Calendar Date . 를 로 변환한다
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd은 번째 요일입니
//		다").format(d));"
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.DAY_OF_MONTH,1);

		}
		
	}
}

