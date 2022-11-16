package day02.basic;
/*
 * [[ 참조형 데이터형(래퍼런스형) ]]
 * 
 * 5. String 형 (문자열)
 *  - 선언하는 방법
 *  	String  변수명;
 *  - 문자열을 지정할수 있다.
 *  
 *  기본형 - boolean(ture, flase 값을 가짐), char(문자), byte(정수), short(정수), int(정수), long(정수), float(실수), double(실수) (명령어는 소문자)
 *  참조형 - 기본형을 제외한 모든 클래스 
 * 
 */

public class Mainclass07 {
	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요.";
		System.out.println("str : " + str);
		
		/*
		 * h e l l o 
		 * 0 1 2 3 4 -> 인덱스 번호
		 */
		
		String hello = "hello";
				
				System.out.println("1번 인덱스 : " + hello.charAt(1));
		
		String addr = "서울 특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		if(isContain) { // true이면 실행
			System.out.println("addr 에는 특별시 라는 문자열이 있어요! ");
		}
	}
}
