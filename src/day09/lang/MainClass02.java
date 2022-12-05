package day09.lang;

/*
 * [[ 래퍼 클래스 (Wrapper Class) ]]
 * 
 * 8개의 기본 타입에 해당하는 데이터를 객체로 표현.
 * boolean, byte, short, int, long, float, double, char
 * 
 * 
 */

public class MainClass02 {
	public static void main(String[] args) {
		//기본형 변수
		boolean b = true;
		Boolean wb1 = Boolean.valueOf(true);		
		Boolean wb2 = Boolean.valueOf(false);
		
		Boolean wb3 = Boolean.valueOf(true);
		
		Integer number1 = Integer.valueOf(10);
		Integer number2 = Integer.valueOf(10);
		int number3 = 10;
		
		System.out.println(number1);
		System.out.println(number2);
		
		System.out.println("number1 == number3 : " + (number1 == number3));
		System.out.println("number1 == number2 : " + (number1 == number2));
	
		int number4 = number1;
		int number5 = number2;
		System.out.println("number4 == number5 : " + (number4 == number5));
		
		int iNum1 = Integer.parseInt("100");
		int iNum2 = Integer.parseInt("100");
		
		System.out.println(iNum1 + iNum2);
		System.out.println(iNum2);
	}
}
