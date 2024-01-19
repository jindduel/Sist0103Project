package day0115;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * key와 value로 이루어진 데이터의 집합
 * key로 구분
 * 순서 유지 x
 * 키는 중복 x 값은 중복 허용
 */
public class MapEx_11 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "강호동");
		map.put("age", "33");
		map.put("add", "서울시");
		
		//같은 키 값으로 입력시 먼저 입력한 값은 사라짐
		map.put("name", "수지");
		
		System.out.println("개수 : " + map.size());
		System.out.println("키 값을 알면 value 값을 정확히 얻을 수 있다. ");
		
		System.out.println("이름 : " + map.get("name"));
		System.out.println("나이 : " + map.get("age"));
		System.out.println("지역 : " + map.get("add"));
		System.out.println();
		
		System.out.println("키 값을 먼저 한꺼번에 얻은 후 값을 얻는 방법");
		Set<String> keyset = map.keySet();
		System.out.println("** 방법 1 **");
		Iterator<String> keyiter = keyset.iterator();
		
		while(keyiter.hasNext()) {
			String key = keyiter.next();
			System.out.println(key + " = " + map.get(key));
		}
		System.out.println();
		
		System.out.println("** 방법 2 **");
		for(String key : keyset) System.out.println(key + " = " + map.get(key));
		System.out.println();
		
		
		
	}
}
