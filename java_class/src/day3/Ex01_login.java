package day3;

import java.util.Scanner;

public class Ex01_login {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String Id = "test";
		String Pw = "1234";
		
		boolean run = true;
		while(run) {
			System.out.println("=====로그인=====");
			System.out.print("아이디입력>");
			String loginId = sc.next();
			System.out.print("비밀번호입력>");
			String loginPw = sc.next();
			
			if(loginId.equals(Id) && loginPw.equals(Pw)){
				System.out.println("로그인성공!");
				run = false;
			}else {
				System.out.println("로그인실패");
				System.out.println("다시 시도(y / n)");
				
				String restart = sc.next();
				if(!(restart.equals("Y") || restart.equals("y"))) {
					System.out.println("로그인종료");
					break;
					
				}
			}
		}
		
		
		
	}

}
