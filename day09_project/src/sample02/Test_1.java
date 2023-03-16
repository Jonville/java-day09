package sample02;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		
		// TV tv = new TV();
		// tv.name = "삼성"   	// 이런식으로 사용 ㄴㄴ

		TV samsungTV = new TV("삼성TV" , 24);		// name, size
		
		
		System.out.println(samsungTV.name);
		System.out.println(samsungTV.size);
		
		samsungTV.showTV();
		samsungTV.channelChange(60);
		
		System.out.println("===================================");
		
		TV lgTV = new TV("LGTV" , 32, 10, 10);
		
		System.out.println(lgTV.name);
		System.out.println(lgTV.size);
		
		lgTV.showTV();
		lgTV.channelChange(50);
		
		System.out.println("===================================");
		
		ColorTV tv1 = new ColorTV("LGTV" , 32, 10, 10, 7894);
		
		tv1.channelChange(40);
				
		System.out.println(tv1.getcolor());
		tv1.showColorTV();
		
		System.out.println("\n===================================");

		IPTV tv2 = new IPTV("IPTV" , 75, 11, 15, 489, "100-123-445-055");

		tv2.channelUp();
		tv2.soundChange();
		
		tv2.showIPTV();
		
	}

}
