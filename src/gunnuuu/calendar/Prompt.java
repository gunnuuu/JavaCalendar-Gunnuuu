package gunnuuu.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
	
	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. ���� ���");           
		System.out.println("| 2. ���� �˻�");         
		System.out.println("| 3. �޷� ����");
		System.out.println("| h. ���� q. ����");
		System.out.println("+----------------------+");
	}
	
	public void runPrompt() throws ParseException {	
		printMenu();
		//���ڸ� �Է¹޾� �ش��ϴ� ���� �ִ� �ϼ��� ����ϴ� ���α׷�
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();		
	
		while(true) {
			System.out.println("��� (1, 2, 3, h, q)");
			String cmd = scanner.next();
			if(cmd.equals("1")) 
				cmdRegister(scanner,cal);
			else if(cmd.equals("2")) 
				cmdSearch(scanner,cal);
			else if(cmd.equals("3")) 
				cmdCal(scanner,cal);
			else if(cmd.equals("h")) 
				printMenu();
			else if(cmd.equals("q")) 
				break;
		}
			
		System.out.println("Thank you. Bye~");
		scanner.close();
	}

	private void cmdCal(Scanner s, Calendar c) {
		int year = 0;
		int month = 0;
		System.out.print("YEAR> ");
		year = s.nextInt();
		
		System.out.println("���� �Է��Ͻÿ�");
		System.out.print("MONTH> ");
		month = s.nextInt();
		
		if(month>12 || month<1) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		c.printCalendar(year, month);
		System.out.println();		
	}

	private void cmdSearch(Scanner s,Calendar c) {
		System.out.println("[�����˻�]");
		System.out.println("��¥�� �Է��ϼ���(yyyy-mm-dd)");
		String date = s.next();
		String plan="";
		try {
			plan = c.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("���� �˻� �� ������ �߻��߽��ϴ�.");
		}
		System.out.println(plan);
	}

	private void cmdRegister(Scanner s,Calendar c) throws ParseException {
		System.out.println("[�� �������]");
		System.out.println("��¥�� �Է��ϼ���(yyyy-mm-dd)");
		String date = s.next();
		String text = "";
	    s.nextLine(); //ignore one newline
	    System.out.println("������ �Է��� �ּ���.");
	    text = s.nextLine();
	    c.registerPlan(date, text);
	}

	public static void main(String[] args) throws ParseException {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
