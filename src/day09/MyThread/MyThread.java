package day09.MyThread;

// Thread 객체를 만들려면
// Thread 객체 상속
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThread 만의 작업을 해요!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("MyThread 가 종료됩니다.");
		
	}
	
}
