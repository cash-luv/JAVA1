package day1;

public class Ex01 {

	public static void main(String[] args) {
		// class 제목은 영어로 대문자 입력(필수)
		char ban1 = 'A';
		String name1 = "홍길동";
		int kor1 = 100, eng1 = 49, mat1 = 89;
		double avg1 = (kor1+eng1+mat1)/(double)3;
		
		// 소수점 까지 표현하기 위해서  . or f  , (double)(float) 사용
		System.out.println(ban1+":"+name1+":"+kor1+":"+eng1+":"+mat1+":"+avg1);
		
		

	}

}
