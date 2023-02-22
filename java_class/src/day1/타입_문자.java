package day1;

public class 타입_문자 {

	public static void main(String[] args) {
		
		char a = 'ㄱ';
		char b = 'ㄴ';
		//문자는 각 유니코드 값을 가짐
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		int i = a;
		int j = b;
		System.out.println(i);
		System.out.println(j);
		//EX)반대로 유니코드값을 입력하면 문자출력
		char c = 12593;
		System.out.println(c);
		
	}

}
