package sample02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IPTV extends ColorTV {

	private String ip;

	IPTV(String name, int size, int channel, int sound, int color, String ip) {
		super(name, size, channel, sound, color);

		this.ip = ip;
	}

	void ott() {
		System.out.println("다시보기 실행");
	}

	@Override
	void channelUp() {
		Scanner sc = new Scanner(System.in);

		System.out.println("채널을 얼마나 올리시겠습니까? ");
		int c = sc.nextInt();
		int channel = getChannel(); // 부모 getChannel 안에 channel 을 IPTV 에 channel 로 가져온다.
		channel += c;
		setChannel(channel); // 합의 결과를 다시 넣어준다.
		System.out.println("채널을 " + c + " 증가했습니다.");

	}

	@Override
	void soundChange() {
		Scanner sc = new Scanner(System.in);

		System.out.println("사운드를 얼마나 올리시겠습니까? ");
		int v = sc.nextInt();
		int sound = getSound();
		sound += v;
		setChannel(sound);
		System.out.println("사운드가 " + v + " 증가했습니다.");
		super.soundChange();

	}

	void showIPTV() {
		super.showColorTV();
		System.out.println(" , " + ip);
		ott();
	}

}
