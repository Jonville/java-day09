package sample01_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx {

	public static void main(String[] args) {

		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);

		System.out.println("HashMap 요소의 개수" + javaScore.size());

		Set<String> keys = javaScore.keySet();		// 키 값을 받아야 해서 Set 의 keySet() 을 이용.
		System.out.println(keys);

		Iterator<String> iter = keys.iterator();

		while (iter.hasNext()) { // hasNext() = 검색할 요소가 다음에 있냐 ... 없으면 false로 탈출
			String name = iter.next(); // next() = 실제 요소를 가져온다
			int score = javaScore.get(name);
			System.out.println(name + " , " + score);
		}
		
		System.out.println();
		System.out.println("for문을 이용한 key, value 출력");
		
		for(String name : keys) {
			int score = javaScore.get(name);
			System.out.println(name + " , " + score);
		}

	}

}
