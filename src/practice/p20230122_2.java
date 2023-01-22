package practice;

public class p20230122_2 {

	public static void main(String[] args) {
		/* 10, 20, 30, 40, 50 값을 배열에 선언 및 할당 한 후 
		모든 값을 더한 값을 for문을 이용하여 구하시오 */
		
		int [] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
