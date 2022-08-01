package gunnuuu.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String weekday) {
		if(weekday.equals("SU")) return 0;
		else if(weekday.equals("MO")) return 1;
		else if(weekday.equals("TU")) return 2;
		else if(weekday.equals("WE")) return 3;
		else if(weekday.equals("TH")) return 4;
		else if(weekday.equals("FR")) return 5;
		else if(weekday.equals("SA")) return 6;
		else 
			return 0;
	}
	
	public void runPrompt() {		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		int year = 0;
		int month = 0;
		int weekday = 0;
		
		while(true) {
			System.out.println("년도를 입력하시오(exit: -1");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year==-1) {
				break;
			}
			System.out.println("달을 입력하시오");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if(month==-1) {
				break;
			}
			System.out.println("첫째 날의 요일을 입력하시오(SU,MO,WE,TH,FR,SA)");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			
			if(month>12 || month<1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			cal.printCalendar(year, month, weekday);
			System.out.println();
		}
		System.out.println("Bye~");
		scanner.close();
	}
	
	public static void main(String[]args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
