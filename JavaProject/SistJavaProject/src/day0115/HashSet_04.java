package day0115;

import java.net.MulticastSocket;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HastSet : 순서를 유지하지 않는 데이터 집합, 중복 허용 x
//구현클래스, 인덱스 x
//Set 인터페이스를 구현하려면 HashSet 필요
//<E(엘리먼트)> 제네릭스 : 타입을 명시 / 그 외의 타입을 넣으면 오류

public class HashSet_04 {
	public static void main(String[] args) {
		//컬렉션은 가변적이므로 배열의 고정형을 보완
		
		Set<String> set1 = new HashSet<String>() ;
		//set1 안에 스트링만 입력 가능 Set은 인터페이스이므로 HashSet으로 생성
		
		set1.add("사과");	
		set1.add("오렌지");	
		set1.add("배");	
		set1.add("사과"); //포함 x
		set1.add("키위");		
		set1.add("바나나");	
		
		System.out.println("데이터 갯수 : " + set1.size());
		System.out.println();
		
		System.out.println("출력_#1");
		for(String s : set1) System.out.println(s);
		System.out.println();

		System.out.println("출력_#2");
		Iterator<String> iter = set1.iterator();
		
		while(iter.hasNext()) { //데이터가 더 없으면 false
			String s = iter.next();
			System.out.println(s); //다음으로 이동하며 데이터 반환
		}
		System.out.println();

		System.out.println("출력_#3");
		Object[] ob = set1.toArray();
		
		for(int i = 0; i < ob.length; i++) System.out.println(ob[i]);
		System.out.println();
		
		//모든 데이터 삭제
		set1.clear();
		
		//삭제 확인
		if(set1.isEmpty()) System.out.println("Set타입 안에 데이터가 없습니다");
		else System.out.println("Set타입 안에 데이터가 있습니다");
		
	}
}
