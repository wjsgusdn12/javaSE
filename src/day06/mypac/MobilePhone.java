package day06.mypac;

public class MobilePhone extends Phone{ //폰의 내용을 모바일폰이 사용 가능 (private 제외)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		super.name = name; // this = MobilePhone (같은 클래스 안의 자기 이름), super.name = Phone
		System.out.println(this.getName());
	}	
	
}