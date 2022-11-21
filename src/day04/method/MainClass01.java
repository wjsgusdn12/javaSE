package day04.method;

/*
 * [[ 메소드(method) ]]
 * 어떤 특정 작업을 수행하기 위한 명령문의 집합
 * 
 * 접근대여자 (정적) 반환타입 메소드이름 (매개변수타입 매개변수수행) {// 선언부
 * 		명렁문 // 구현부
 * 
 * 		return 반환값;
 * }
 * 
 * 오버로딩
 * 		메소드 명이 같아도, 객
 * 
 */

public class MainClass01 {
	public static String name;  // 전역변수 name 선언
	
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		
		//hello 메소드 호출하기
		hello();
		
		//printName 메소드 추출하기
		printName("전현우");
		
		setName("피카츄");
		
		String strName = getName();
		
		System.out.println("전역변수 name : " + strName);
		
		String eMon = getEvolution("꼬부기");
		
		System.out.println(eMon);
	}
	
	// 인자x 리턴x -> 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, world!");
	}
	
	//인자(매개변수)O 리턴X
	public static void printName(String name) {
		System.out.println("이름 : " + name);
	}
	
	//오버로딩 메소드 인자(매개변수)O 리턴X
	public static void printName(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	// 인자O 리턴X -> 매개변수를 전역변수 name에 대입
	public static void setName(String name) {
		MainClass01.name = name;
	}
	
	// 인자X 리턴O -> 전역변수 name을 반환.
	public static String getName() {
		return name;		// MainClass.name과 같음
	}
	
	public static String getEvolution(String mon) {
		String eMon = "";
		if(mon.equals("꼬부기")) {
			eMon = "어니부기";
		}else if(mon.equals("어니부기")) {
			eMon = "거북왕";
		}
		
		return eMon;
	}
}
