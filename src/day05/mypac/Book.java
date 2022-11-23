package day05.mypac;

public class Book {
	public String subject = "JAVA Programing"; // 전역 변수 (어떤 메소드에서든 사용 가능)
	public String writter = "전현우";

	public void read() {
		int page = 10; // 지역 변수 ( read() 지역 안에서만 사용 가능)
		System.out.println(subject + " " + page + "페이지 읽어요!");
	}
	
	public  void pillow() {
		System.out.println("베개로 사용해요!");
	}
	
}
