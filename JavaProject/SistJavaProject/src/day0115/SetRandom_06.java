package day0115;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetRandom_06 {
	public static void main(String[] args) {
		// Set, random 이용 1~45 서로 다른 난수
		Random rand = new Random();
		
		Set<Integer> set = new HashSet<Integer>();
		
		while (true) {
			int n = rand.nextInt(45) + 1;
			set.add(n);
			
			if(set.size() >= 6) break;
		}
		
		//출력
		System.out.println("출력_#1");
		for(int i : set) System.out.printf("%5d", i);
		System.out.println("\n");

		System.out.println("출력_#2");
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) System.out.printf("%5d", iter.next());
		System.out.println("\n");

		System.out.println("출력_#3");
		Object[] ob = set.toArray();
		Arrays.sort(ob);
		for(int i = 0; i < ob.length; i++) System.out.printf("%5d", ob[i]);
		System.out.println("\n");
		
	}
}