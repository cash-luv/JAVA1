package day2;

public class 조건문_switch_case {

	public static void main(String[] args) {
		//switch case 는 값에 따라 케이스로 나뉜다
		//조건식을 걸 수 없으므로 많이 쓰이지 않음 (범위지정x)
		//case 마지막에 항상 break; 입력해야함
		int a = 1;
		switch(a) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
			default:
				System.out.println("1~3까지 입력해주세요");
		}

	}

}
