package gunnuuu.calendar;

public class Calendar {
	
	private static final int[] MAXDAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAPYEAR = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year) {
		if(year%4==0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}
	public int getmaxDays(int year,int month) {
		if(isLeapYear(year)) {
			return LEAPYEAR[month-1];
		}
		else {
			return MAXDAYS[month-1];
		}
	}
	
	public void printCalendar(int year,int month,int weekday) {
		System.out.printf("    <<%4d³â%3d¿ù>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		
		for(int i = 0;i < weekday;i++) {
			System.out.print("   ");
		}
		int maxDay = getmaxDays(year,month);
			
		for(int i = 1;i<= maxDay;i++) {
			System.out.printf("%3d",i);
			if((i+weekday)%7==0) {
				System.out.println();
			}
		}
	}
}
