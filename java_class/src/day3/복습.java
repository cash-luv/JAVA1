package day3;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// 문제) for문으로 1~100까지 짝수의 합
		// 블럭 단위 스코프 {}<< 블럭
		// java 의 스코프 단위는 블럭
		/*int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				// 변수가 블럭안에서 선언 된 경우 블럭 안에서만 적용
			}
		}
		if (true) {
			System.out.println(sum);
		}
		System.out.println(sum); */
		
		
		/* int sum;  // 이렇게 선언해도 사용 가능 
		  for(int i=0; i<10; i++){
		 sum = 10;
		 } */
		
		/*int sum=0; //값을 지정해줘야 함 값이 없으면 실행X
		for(int i=0; i<10; i++) {
			
			sum = 10; // 안에서 변수를 생성한 경우 안에서만 사용
		}System.out.println(sum); */
		
		
		// 1부터 100까지 홀수의 합
		/* int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i; // sum = sum+i;	
			}i++;
		}System.out.println(sum); */
		
		
		//문제) 숫자를 계속 입력 받다가 0 이 입력되면 '끝' 출력
		/*Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("숫자입력>");
			int num = sc.nextInt();
		
			if(num == 0) {
				System.out.println("끝");
				check = false; 
			}
		}	*/
		
		//문제) 숫자를 계속 입력 받다가 0 이 입력되면 '끝' 출력
		//boolean 변수 지정 후 사용 예시
				/*Scanner sc = new Scanner(System.in);
				boolean check = true;
				while(check) {
					System.out.println("숫자입력>");
					int num = sc.nextInt();
				
					if(num == 0) {
						System.out.println("끝");
						check = false; 
					}
				}	*/
		
		
		//문제 깔끔하게 한 코딩 (break를 이용한 반복문 탈출)
		/* Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자입력>");
			int num = sc.nextInt();
			if (num == 0)
				break;
		}
		System.out.println("끝"); */
		
		//스캐너 , boolean or break 를 이용해 while 반복문과 
		//if조건문으로 간단한 자판기 콘솔출력을 해보았다
		 /* Scanner sc = new Scanner(System.in);
		System.out.println("==== 자판기 ====");
		boolean check = true;
		while (check) {
			System.out.print("메뉴:\t");
			System.out.println("1.콜라 2.사이다 3.우유 0.종료");
			System.out.print("메뉴 입력>>\n");
			
			int num = sc.nextInt();
			if (num == 0) {// !=
				System.out.println("종료");
				check = false;
			}else if (num == 1) {
				System.out.println("콜라입니다");
			}else if (num == 2) {
				System.out.println("사이다입니다");
			}else if (num == 3 ) {
				System.out.println("우유입니다");
			}else {
				System.out.println("0~3까지 번호를 똑바로 입력하세요");
		
			}
		} */
		
		// 깔끔하게 while , 스캐너를 이용해서 자판기출력
		Scanner sc = new Scanner(System.in);
		System.out.print("돈 > ");
		long money = sc.nextInt();
		while(true) {
			System.out.println("==== 복합기 =====\t현재잔액: "+money+"원");
			System.out.println("1.인쇄기 2.스캐너 3.팩스 0.종료");
			System.out.print("메뉴선택>");
			int p = sc.nextInt();
			int sum = 0;
			if(p == 1) {
				System.out.println("1.흑백(1000원), 2.칼라(1500원)");
				 p = sc.nextInt();
				if(p == 1) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1000;
					System.out.println("가격은"+sum+"입니다.");
				}else if(p ==2) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1500;
					System.out.println("가격은"+sum+"입니다.");
				}else{
					
					System.out.println("다시 선택해주세요");
				
				}
				
				money = money - sum;
				System.out.print("메뉴선택>");
				p = sc.nextInt();
			}else if (p == 2) {
				System.out.println("1.흑백(1000원), 2.칼라(1500원)");
				p = sc.nextInt();
				if(p == 1) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1000;
					System.out.println("가격은"+sum+"입니다.");
				}else if(p ==2) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1500;
					System.out.println("가격은"+sum+"입니다.");
				}
				money = money - sum;
				System.out.print("메뉴선택>");
				p = sc.nextInt();
			}else if (p == 3) {
				System.out.println("1.흑백(1000원), 2.칼라(1500원)");
				p = sc.nextInt();
				if(p == 1) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1000;
					System.out.println("가격은"+sum+"입니다.");
				}else if(p ==2) {
					System.out.println("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 1500;
					System.out.println("가격은"+sum+"입니다.");
				}
				money = money - sum;
				System.out.print("메뉴선택>");
				p = sc.nextInt();
			}else if (p == 0) {
				money = money - 1500;
				System.out.println("우유 구입성공!");
//			}else if (1~3) {
//			
//					System.out.println("종료");
//					break;
//			}else {
//				System.out.println("0~3까지 번호를 똑바로 입력하세요");
//			
//			}
		}
	}
}
}
	

