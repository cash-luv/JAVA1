package day1;

import java.util.Scanner;

public class 조건문_예제 {

	public static void main(String[] args) {
		// 문제) 변수 a 가 음수이면 '음수입니다' , 양수이면 '양수입니다', 0이면 '0입니다'를  출력
		/* int a = 1;
		if(a >= 1) {
			System.out.println("양수입니다");
		}else if(a <= -1) {
			System.out.println("음수입니다");
		}else if(a == 0) {
			System.out.println("0입니다");
		} */
		
		// 문제) 변수 score가 90이상이면 'A' 80이상이면 'B' 70이상이면 'C' 60이상이면 'D'
		// 60 이하면 'F'를 출력
		// 이클립스 문장 자동완성 컨트롤 + 스페이스바
	    /*intscore = 90;
		if(score >= 90) {
			System.out.println("A");
		}else if(score >=80) {
			System.out.println("B");
		}else if(score >=70) {
			System.out.println("C");
		}else if(score >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		} */
		//문제) 변수 num이 짝수이면 '짝수' 홀수이면 '홀수' 출력
		/*
		int num = 8;
		
		if(num%2 == 0) {
			System.out.println("0입니다");
		}else if(num%2 == 0) {
			System.out.println("짝수");
		}else if(num%2 == 1) {
			System.out.println("0입니다");
		} */
		/* Scanner sc = new Scanner(System.in);
		System.out.println("====계산기====");
		System.out.print("첫번째 숫자입력> ");
		int num1 = sc.nextInt();
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지 ");
		System.out.println("메뉴선택> ");
		int menu = sc.nextInt();
		System.out.print("두번째 숫자입력> ");
		int num2 = sc.nextInt();
		
		
		
		if(menu == 1) {
			System.out.println(num1+"+"+num2 +"="+(num1 + num2));
		}else if(menu == 2){
			System.out.println(num1+"-"+num2 +"="+(num1 - num2));
		}else if(menu == 3) {
			System.out.println(num1+"*"+num2 +"="+(num1 * num2));
		}else if(menu == 4) {
			System.out.println(num1+"/"+num2 +"="+(num1 / num2));
		}else if(menu == 5) {
			System.out.println(num1+"%"+num2 +"="+(num1 % num2));
		}else {
			System.out.println("1~5까지 입력 가능합니다");
		} */
		/* Scanner sc = new Scanner(System.in);
		String id = "test";
		String pw = "1234"; //id.equals(pw)
		// String 비교 할 떄에는 .equals() 로 비교해준다
		
		System.out.println("=====로그인=====");
		System.out.print("ID를 입력해해주세요> ");
		String id1 = sc.next();
		System.out.print("PW를 입력해주세요> ");
		String pw1 = sc.next();
		if(id.equals(id1) && pw.equals(pw1)){
			System.out.print("로그인이 성공하였습니다");
		}else if(!pw.equals(pw1) &&! id.equals(id1)) {
			System.out.println("ID와 PW를 확인해주세요");
		}else if(id.equals(id1) ||! pw.equals(pw1)){
			System.out.print("PW가 틀렸습니다");
		}else if(pw.equals(pw1) ||! id.equals(id1)){
			System.out.print("ID가 틀렸습니다");
		} */
		
		//문제) 변수 a가 3의 배수이면 3의 배수 , 5의 배수이면 5의 배수 . 3,5 둘다의 배수이면 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====3의 배수 5의 배수만 출력  ====");
		System.out.print("숫자를 입력하세요>>");
		int a = sc.nextInt(); //문자 입력 받았을 때 sc.next(),sc nextLine()
		
		if (a == 0 ) {
			System.out.println("이건 0 이에요");
		}else if (a % 3 == 0 && a% 5 ==0) {
			System.out.println("3의 배수 , 5의 배수입니다");
		}else if (a % 3 == 0 ) {
		    System.out.println("3의 배수입니다");
		}else if (a % 5 == 0) {
			 System.out.println("5의 배수입니다");
		}else {
			 System.out.println("3의 배수나 5의 배수가 아닙니다");
		
		}
	}

}
