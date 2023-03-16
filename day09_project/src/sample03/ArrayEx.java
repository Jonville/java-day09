package sample03;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3, 5, 2};
		int a = 10;
		
		Calculator c = new Calculator();
		
		c.refTest(a);
		c.refTest(arr);
		
		System.out.println(a);
		System.out.println(Arrays.toString(arr));		// 레퍼런스를 공유하는 관계에선 값에 영향을 준다~
	}

}
