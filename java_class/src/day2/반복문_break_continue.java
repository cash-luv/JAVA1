package day2;

public class 반복문_break_continue {

	public static void main(String[] args) {
		//switch case , 반복문 에서만 사용
		/* for(int i=1; i<=10; i++) {
			System.out.println(i);
			if(i ==5) {
				break;
			}
		}
		System.out.println("끝"); */
		
		/* for (int j = 1; j < 10; j++) {

			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\t", i, j, (j * i));
				if(i==5) {
					break;
				}

			}
			System.out.printf("\n");
		}*/
		
		
		/* for (int j = 1; j < 10; j++) {
			System.out.println(j+"단");
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", j, i, (j * i));
			}
			System.out.println();
			if(j == 5) {
				break;
			}
		} */
		
		/*for (int i=1; i<=10; i++) {
			if(i == 5) {
				continue;
			}System.out.println(i);
		} */
		
		for (int j = 2; j < 10; j++) {
			if (j < 4) {
				continue;
			}
			System.out.println(j + "단");
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d\n", j, i, (j * i));
			}
			if (j == 7) {
				break;
			}
			System.out.println();

		}

	}
}
