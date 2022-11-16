package day03.loop;

/*
 * [[ 반복문 ]]
 * 
 * 특정 부분의 코드가 반복적으로 수행하도록 하는 제어문.
 * 
 * 1. while 문
 * while(조건문){
 * 		반복 수행할 코드
 * }
 */

public class MainClass01 {
	public static void main(String[] args) {
		// while 문을 이용해서 0~9까지 출력
		int count = 0; // 카운트를 세기위한 변수
		while(true) {
			System.out.println(count);
			count ++;
			if(count == 100) break;
		}
		
		count = 0; // 결과값이 다 같다면 이게 효율적
		while(count < 100) {
			System.out.println(count);
			count++;
		}
		
		count = 0; // 제일 많이 쓰임
		boolean isRun = true;
		while(isRun) {
			System.out.println(count);
			count++;
			if(count==100) isRun = false;
		}
	}
}
