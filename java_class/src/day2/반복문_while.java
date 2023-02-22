package day2;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		
		/* int a = 1;
		int sum = 0;
		// if 조건문이랑 똑같은 조건
		//증강식을 while 수식 마지막에 기입
		while(a <= 10000) {
			
			sum = a + sum;
			a++;
			
		}
		System.out.println(sum); */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>");
		int a = sc.nextInt();
		
		while(a >= 1 || a <= -1) {
			System.out.print("숫자입력>");
			a = sc.nextInt();	
		}
			System.out.print("끝");
		
	}
	
}
