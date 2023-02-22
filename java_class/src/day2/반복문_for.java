package day2;

public class 반복문_for {

	public static void main(String[] args) {
		// 1번 변수 선언 2번 조건확인 3번 반복문 실행 4번 증강 5번 반복실행 6번 조건확인 후 거짓일 때 빠져나옴 
		// 1~10까지 출력
		for(int i=1; i<=10; i++) { // i =i+1 = i++
			System.out.println("안녕");
		}
		
		// 1~10 까지 홀수출력
		for(int i=1; i<=10; i=i+2) { 
			System.out.println("안녕");
		}
		// 1~10 까지 짝수출력
		for(int i=2; i<=10; i=i+2) { 
			System.out.println("안녕");
		}
	}

}
