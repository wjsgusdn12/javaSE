package day05.oop;

// ctrl + shift + o 누르면 아래 생성 가능 (일괄 import 단축키)(패키지 명 확인 잘하기)
import day05.mypac.MathUtil;

public class MainClass03 {
	public static void main(String[] args) {
		// 반지름
		int r = 5;
		
		MathUtil mu = new MathUtil();
		
		double area = mu.getArea(r);
		
		System.out.println("원의 넓이는 : " + area);
		
		
		int result = mu.sum(6, 4);
		System.out.println("6 + 4 = " + result);
		
		System.out.println("5 + 9 + 1 = " + mu.sum(5, 9, 1));
	}
}
