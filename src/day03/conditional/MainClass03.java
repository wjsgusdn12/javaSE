package day03.conditional;

/*
 * switch ~ case 문 (if 문이랑 비슷)
 */

public class MainClass03 {
	public static void main(String[] args) {
		int num = 1; // case 문에 break로 마무리를 안하면 밑의 case문 까지 실행시킴
		switch(num) {
		case 0 :
			System.out.println("0 입니다.");
			break;
		case 1 :
			System.out.println("1 입니다.");
			break;
		case 2 :
			System.out.println("2 입니다,");
			break;
		case 3 : 
			System.out.println("3 입니다.");
			break;
		default : 
			System.out.println("0 ~ 3 이 아닙니다.");
			break;
		}
	}
}
