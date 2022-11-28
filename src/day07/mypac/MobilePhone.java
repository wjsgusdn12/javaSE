package day07.mypac;

public class MobilePhone extends Phone{

	// 오버라이딩 - 부모 메소드 재정의
	@Override // ctrl+space 로 선택 가능
	public void call() {
		System.out.println("무선으로");
		super.call(); // super는 부모 객체 = Phone
	}
	
	public void sendMsg() {
		System.out.println("문자를 보내요.");
	}
}
