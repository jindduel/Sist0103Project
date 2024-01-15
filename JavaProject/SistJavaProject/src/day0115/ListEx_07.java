package day0115;


import java.util.Iterator;
import java.util.Vector;

public class ListEx_07 {
	public static void main(String[] args) {
		/*
		 * 1. 순차적으로 데이터가 들어간다.
		 * 2. 즁복 데이터 허용
		 * 3. 처음 생성 시 일정한 갯수로 생성 그 이상의 데이터를 넣으면 자동으로 공간이 늘어남 (가변)
		 */
		
		Vector<String> list = new Vector<String>();
		// 생성자가 디폴트인 경우 기본 할당 크기 10 / 10 초과시마다 10씩 증가
		
		System.out.println("초기 할당 크기 : " + list.capacity()); 
		System.out.println("초기 데이터 갯수 : " + list.size());
		
		list.add("장미");
		list.add("장미");
		list.add("수국");
		list.add("프리지아");
		list.add("안개");
		list.add("장미");
		list.add("프리지아");
		list.add("안개");
		list.add("장미");
		list.add("프리지아");
		list.add("안개");
		list.add("장미");

		System.out.println("초기 할당 크기 : " + list.capacity());
		System.out.println("초기 데이터 갯수 : " + list.size());
		System.out.println();
		
		System.out.println("출력_#1");
		for(int i = 0 ; i < list.size(); i++) System.out.printf("%2s ", list.get(i));
		System.out.println("\n");
		
		System.out.println("출력_#2");
		for(String s : list) System.out.printf("%2s ", s);
		System.out.println("\n");
		
		System.out.println("출력_#3");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext())  System.out.printf("%2s ", iter.next());
		System.out.println("\n");
		
		System.out.println("출력_#4");
		Object[] ob = list.toArray();
		for(int i = 0 ; i < ob.length; i++) System.out.printf("%2s ", ob[i]);
		System.out.println("\n");

		
	}
}