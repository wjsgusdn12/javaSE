package day06.abstractEx.pac;

public class Man extends Human{

	@Override // 방법 : Man에 마우스 갖다대고 첫번째 클릭
	public void useFire() {
		System.out.println("장작을 파요!");
	}
		
		public void say() {
			System.out.println("굵은 목소리로 말해요!");
	}

}
