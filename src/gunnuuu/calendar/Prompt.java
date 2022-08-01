package gunnuuu.calendar;

import java.util.Scanner;

public class Prompt {
	public final static String PROMPT = "cal>";
	
	public void runPrompt() {		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) {
			System.out.println("년도를 입력하시오");
			System.out.print(PROMPT);
			int year = scanner.nextInt();
			System.out.println("월을 입력하시오");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if(month==-1 || year ==-1) {
				break;
			}
			if(month>12) {
				continue;
			}
			cal.printCalendar(year, month);
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
