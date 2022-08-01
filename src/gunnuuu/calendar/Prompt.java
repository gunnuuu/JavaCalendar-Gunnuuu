package gunnuuu.calendar;

import java.util.Scanner;

public class Prompt {
	public final static String PROMPT = "cal>";
	
	public void runPrompt() {		
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		while(true) {
			System.out.println("�⵵�� �Է��Ͻÿ�");
			System.out.print(PROMPT);
			int year = scanner.nextInt();
			System.out.println("���� �Է��Ͻÿ�");
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
