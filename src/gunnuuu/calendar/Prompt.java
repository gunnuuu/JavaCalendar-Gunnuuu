package gunnuuu.calendar;

import java.util.Scanner;

public class Prompt {
	
	public void runPrompt() {		
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		int year = 0;
		int month = 0;
		
		while(true) {
			System.out.println("�⵵�� �Է��Ͻÿ�(exit: -1)");
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
			
			if(month>12 || month<1) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			cal.printCalendar(year, month);
			System.out.println();
		}
		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
