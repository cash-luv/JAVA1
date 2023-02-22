package day2;

public class 반복문_for_예제 {

	public static void main(String[] args) {
		//\t tap  \n 줄바꿈
		/*for(int i=1; i<=10; i++) { 
			System.out.print(i+"\t");
		}
		System.out.println("\n안\t녕") */
		
		/* int sum =0; //반복을 해서 숫자를 증강시킬려면 누적을 시켜주는 값이필요 
		for(int i=1; i<=100; i++) { 
			sum = sum+i;
		}
		System.out.println(sum); */
		
		/*int sum =0; // 짝수의 합을 출력
		for(int i=2; i<=100; i=i+2) { 
			sum = sum+i;
		}
		System.out.println(sum); */
		
		int dan = 6;
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	}

}
