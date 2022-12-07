package day10.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[ HashMap Class ]]
 * - Map 인터페이스를 구현한 클래스
 * - Key 값, Value 값을 쌍으로 저장한다. (사전 형태)
 * - Key 값은 중복 불가.
 * 
 * 
 */

public class MainClass05 {
	public static void main(String[] args) {
		// HashMap 객체 생성
		HashMap<String, String> map1 = new HashMap<>();
		
		// 데이터 저장하기
		map1.put("HELLO", "안녕하세요");
		map1.put("CAR", "자동차");
		map1.put("TIGER", "호랑이");
		
		// 데이터 열어오기
		String value = map1.get("HELLO"); // 키값으로 값 가져오기
		
		System.out.println("Value : " + value);
		
		// Map에 있는 키값 불러오기 (Set으로 반환)
		Set<String> set = map1.keySet();
		
		// set -> 반복자 객체
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String keyValue = it.next(); // 키값 하나씩 읽어온다
			
			//해당 키값에 할당되어 있는 value 값을 읽어온다
			String value2 = map1.get(keyValue);
			
			//value값 출력해보기
			System.out.println(value2);
		}
	}
}
