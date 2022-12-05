package day09.mypac;

public class HandPhone {
	public String model;	//초기화 안할시 입력값 : null 
	
	
	static{	//static은 자바가 실행될때 메모리에 올라감(최우선)
		System.out.println("static 초기화 블럭");
	}
	
	{
		System.out.println("초기화 블럭");
	}
	
	//생성자 - 클래스명과 동일하다.
	public HandPhone() {
		this.model = "갤럭시";
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	
	// 오버로딩 생성자
	public HandPhone(String model) {
		this.model = model;
		System.out.println("생성자로 " + model + "이 전달되었습니다.");
	}
	
}
