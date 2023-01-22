package practice;

public class p20230122_1 {

	public static void main(String[] args) {
		/* 	3의 배수일 때 출력 하는 코드를 작성해보자.
			1부터 하나씩 증가하다가 3의 배수는 출력 30이 되면 중단
		 	while문과 continue, break를 사용하여  해결하시오.  */
		
		int i = 1;
		
		while(true) {
			
			i++;
			
			if(i % 3 == 0) {			
				System.out.println(i);
				continue;
			} if(i > 30) {
				break;
			}
		}
		}
}
	

