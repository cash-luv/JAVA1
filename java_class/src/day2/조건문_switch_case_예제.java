package day2;

import java.util.Scanner;

public class 조건문_switch_case_예제 {

	public static void main(String[] args) {
		// 문제) 변수 a에 숫자를 입력 받고 , 1~12까지 각각 영어로 달을 띄워라
		// January , February , March , April , May , June , July
		//August , September , October , November , December
		/* Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세여>>");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
		case 12:
			System.out.println("December");
			break;
			default:
				System.out.println("1~12까지 입력해주세요");
		} */
		
		 Scanner sc = new Scanner(System.in);
			System.out.println("====계산기====");
			System.out.print("첫번째 숫자입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자입력> ");
			int num2 = sc.nextInt();
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지 ");
			System.out.println("메뉴선택> ");
			
			int menu = sc.nextInt();		
			
			switch(menu) {
			case 1:
				System.out.println(num1+"+"+num2 +"="+(num1 + num2));
				// printf 퍼센트에 뒤에 있는 값이 지정되서 들어감  /n = 줄바꿈(이스케이프 문자)
				System.out.printf("%d + %d = %d\n", num1, num2 ,(num1+num2)); 
				break;
			case 2:
				System.out.println(num1+"-"+num2 +"="+(num1 - num2));
				break;
			case 3:
				System.out.println(num1+"*"+num2 +"="+(num1 * num2));
				break;
			case 4:
				System.out.println(num1+"/"+num2 +"="+(num1 / num2));
				break;
			case 5: 
				System.out.println(num1+"%"+num2 +"="+(num1 % num2));
				break;
				default:
				System.out.println("1~5까지 입력 가능합니다");
				
				
			}
	}

}
