package sample04_trycatch;

import java.util.Scanner;

public class DevideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		while (true) {
			System.out.print("나눔수를 입력하시오 >> ");
			int a = sc.nextInt();
			System.out.print("나눗수를 입력하시오 >> ");
			int b = sc.nextInt();

			try {
				System.out.println("값은 : " + a / b);
				arr[3] = 10;
				break;
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("0으로 나눌수없습니다. 다시 입력하세요.");
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("배열 크기 오류");
			}
		}
	}
}
