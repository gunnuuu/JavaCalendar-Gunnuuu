package gunnuuu.calendar;

import java.util.Scanner;
public class Sum {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("두 수를 입력하세요.");
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b,a+b);
		scanner.close();
	}

}
