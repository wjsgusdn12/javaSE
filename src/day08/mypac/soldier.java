package day08.mypac;

public class soldier {
	public Weapon w;
	
	//생성자 객체 생성직전 실행 - 초기화용으로 사용
	public soldier(Weapon w) {
		this.w = w;
		w.attack();
		
		System.out.println(System.identityHashCode(w));
	}
}
