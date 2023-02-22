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
		
		/* Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>");
		int a = sc.nextInt();
		
		while(a >= 1 || a <= -1) {
			System.out.print("숫자입력>");
			a = sc.nextInt();	
		}
			System.out.print("끝"); */
		
		/* Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("숫자입력>");
			int num = sc.nextInt();
			if(num == 0) {
				System.out.println("끝");
				check = false; 
		
			}*/
		
		// 문제)) 숫자를 계속 입력받으면서 3의배수 , 5의배수 , 3과5의배수를 출력하는데
		// 		0이 입력되면 반목문을 빠져나온다
		
		//while 로 적용
		/*Scanner sc = new Scanner(System.in);
		System.out.println("====3의 배수 5의 배수만 출력  ====");
		System.out.print("숫자를 입력하세요>>");
		int a = sc.nextInt();
		while(a >= 1 || a <= -1) {
				if (a % 3 == 0 && a% 5 ==0) {
					System.out.println("3의 배수 , 5의 배수입니다");
					}else if (a % 3 == 0 ) {
				    System.out.println("3의 배수입니다");
					}else if (a % 5 == 0) {
					 System.out.println("5의 배수입니다");
					}else {
					 System.out.println("3의 배수나 5의 배수가 아닙니다");
					}
					System.out.print("숫자입력>");
					a = sc.nextInt();	
		}System.out.print("끝");	  */
			
		// boolean으로 적용
		Scanner sc = new Scanner(System.in);
		System.out.println("====3의 배수 5의 배수만 출력  ====");
		boolean check = true;
		while (check) {
			System.out.print("숫자를 입력하세요>>");
			int num = sc.nextInt();
			if (num == 0) {// !=
				System.out.println("끝");
				check = false;
			}else if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("3의 배수 , 5의 배수입니다");
			}else if (num % 3 == 0) {
				System.out.println("3의 배수입니다");
			}else if (num % 5 == 0) {
				System.out.println("5의 배수입니다");
			}else {
				System.out.println("3의 배수나 5의 배수가 아닙니다");
			}
		}

	}
}
			
