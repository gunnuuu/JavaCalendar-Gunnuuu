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
	/**
	 * -���� �Է��ϸ� �� ���� �޷��� ���
	 * -����� �״��
	 * --1�Է� ������ �ݺ��Է�
	 * -������Ʈ ���
	 */
	
	public void printCalendar(int year,int month) {
		System.out.printf("    <<%4d��%3d��>>\n",year,month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		
		int maxDay = getmaxDays(year,month);
		
		for(int i=1;i<= maxDay;i++) {
			System.out.printf("%3d",i);
			if(i%7==0) {
				System.out.println();
			}
		}
	}
}
