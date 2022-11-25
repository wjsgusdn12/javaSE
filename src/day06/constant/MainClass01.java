package day06.constant;

/*
 * [[ 상수 ]]
 * 		처음 할당된 값이 변경되지 않는다.
 * 		final 키워드 사용.
 * 		상수는 대문자로 선언한다.
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		final double PI = 3.14159;	// 원주율, final 사용시 처음 설정된 값 고정

		//원의 반지름
		int r = 10;
		//원의 넓이
		double area = PI*r*r;
		
		String str = new String();
		
		System.out.println("원의 넓이 : " + area);
		
		System.out.println("원주율 : " + Math.PI);
		
		area = 0;
		
		area = Math.PI * Math.pow(r, 2); // r을 2제곱 하겠다는 문법
		
		System.out.println("원의 넓이 : " + area);
	}
}
