package practice;

import java.util.Scanner;

public class p20230119_4 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String str = "";
	
	do {
		System.out.println("문자열을 입력하세요.");
		str = sc.nextLine();
		System.out.println(str);
	} while (!str.equals("exit"));
	
	System.out.println("프로그램을 종료합니다.");
	}
	
}


