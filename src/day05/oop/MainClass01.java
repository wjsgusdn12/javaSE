package day05.oop;

/*
  [[ 객체란 ]]
  		물리적으로 존재하거나 추상적으로 생각할 수 있는것 중에서 
  		정의 가능하고 식별 가능한것!
  		
  		예) 실재 존재하는 - 자동차, 휴대폰, 컴퓨터, 학생, 회원
  			추상적인 것 - 주문, 배송, 생산 등
  
  		모두 객체가 될수 있다
  
  		최소한의 프로그램 단위
  
  		객체를 만들기 위해서 주형(붕어빵, 틀 또는 설계도 => Class
  
  		Class의 작성된 코드를 읽어 객체화 한다 = 메모리에 올린다!
  
  클래스 구조
  class 클래스 명 {
  	생성자
  	변수 
  	메소드
  }
  
  객체화
  클래스명 변수명 = new 클래스명();
  
  객체 구성 요소
  	생성자 => 초기화를 담당
  	변수(멤버변수, 멤버필드) => 속성값
  	메소드(멤버필드) => 기능
 */

// 실행 하는 메인 클래스 , Car car1과 Car car2는 구조만 같고 다른 것
public class MainClass01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1 모델명 : " + car1.model);
		System.out.println("car1 색상 : " + car1.color);
		
		car1.drive();
		car1.autopilot();
		
		//모델은 그대로 하고 색상만 변경 원할때
		Car car2 = new Car();
		car2.model = "테슬라Y";
		car2.color = "yellow";
		System.out.println("car2 모델명 : " + car2.model);
		System.out.println("car2 색상 : " + car2.color);
		
		car2.drive();
		car2.autopilot();
	}
}

// Car 클래스 
class Car {
	String model = "페라리";
	String color = "red";
	
	// 드라이브 함수
	public void drive() {
		System.out.println(model + "드라이브를 합니다.");
	}
	
	//자율주행
	public void autopilot() {
		System.out.println(model + "자율주행을 합니다.");
	}
}

