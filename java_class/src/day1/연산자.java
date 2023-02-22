package day1;

public class 연산자 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		// 비교 연산자
		System.out.println(a > b); //true 
		System.out.println(a >= b); //true
		System.out.println(a < b); //false
		System.out.println(a <= b); //false
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		
		int c = 3;
		// || = or(또는) , && = and(그리고) 
		System.out.println( a > b && a > c);
		System.out.println( a < b && a < c);
		System.out.println( a < b && a ==c);
		System.out.println( a > b || a > c);
		System.out.println( a > b || b > c);
		// System.out.println( a > b ||!( b > c));// ! 부정할 때 쓰는 기호
		
		
		

	}

}
