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
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		int year = 0;
		int month = 0;
		int weekday = 0;
		
		while(true) {
			System.out.println("�⵵�� �Է��Ͻÿ�(exit: -1");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if(year==-1) {
				break;
			}
			System.out.println("���� �Է��Ͻÿ�");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if(month==-1) {
				break;
			}
			System.out.println("ù° ���� ������ �Է��Ͻÿ�(SU,MO,WE,TH,FR,SA)");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			
			if(month>12 || month<1) {
				System.out.println("�߸��� �Է��Դϴ�.");
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
