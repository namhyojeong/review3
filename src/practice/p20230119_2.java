package practice;

import java.util.Scanner;

public class p20230119_2 {

	public static void main(String[] args) {

		/* 구구단 구하는 공식을 if와  for문을 이용하여 구해보자 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.");
		int dan = sc.nextInt();
		
		if (dan >= 2 && dan <= 9) {
				for(int su = 1; su <= 9; su++) {
					System.out.println(dan + "*" + su + "=" + dan * su);
			}
		}
	}

}
