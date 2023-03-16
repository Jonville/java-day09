package sample05_test;

import java.util.Scanner;
import java.util.Vector;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Vector<Integer> v = new Vector<Integer>();

		while (true) {

			int num = sc.nextInt();
			if (num == -1) {
				break;
			}

			v.add(num);	
			
		}
		
		int index = 0;
		for(int i = 0 ; i < v.size(); i++) {
			
			System.out.println(v.get(i));
			
//			index = Math.max(index, v.get(i));
			if(index < v.get(i))
			{
				index = i;
			}
				
			
		}
		
//		System.out.println("최대값은 " + index);
		System.out.println("최대값은 " + v.get(index));


	}

}
