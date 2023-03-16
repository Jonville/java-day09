package sample04_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("숫자 입력 : ");
				int a = sc.nextInt();
				System.out.println("문자 입력 : ");
				String b = sc.next();
				break;
			} catch (InputMismatchException e) {
				System.out.println("제대로 입력하셈");
				sc.next(); // 무한 루프에 빠져 나가려고 써줌
			}
		}

	}

}
