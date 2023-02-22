package day1;

public class 조건문_if {

	public static void main(String[] args) {
		/* 조건문_if 다른 조건으로 실행시킬 때 쓰는 문법
		   조건이 맞지 않으면 실행하지않음 
		   if 다음 ()중괄호 무조건 삽입 */
		int age = 12;
		
		if(age >= 19) {
			System.out.println("성인입니다");
		}else if(age >= 13) {
			System.out.println("청소년 입니다");
		}else {
			System.out.println("어린이 입니다");
		}
//		if(age >= 19) {
//			System.out.println("성인입니다");
//		}else {
//			System.out.println("성인이 아닙니다");
//		}
		int time = 12;
		if(time >= 13) {
			System.out.println("집에 가고 싶다");
		}else {
			System.out.println("집에 가자");
				
			
		}
	}

}
