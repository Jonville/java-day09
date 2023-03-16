package sample02;

import java.util.Scanner;

public class TV {

	String name;
	int size;
	private int channel;
	private int sound;
	
	TV(){}			// 기본 생성자를 만들어줘야 ColorTV extends TV 의 빨간줄이 사라짐

	TV(String name, int size) {
		this(name, size, 1, 1);
	}

	TV(String name, int size, int channel, int sound) {
		this.name = name;
		this.size = size;
		this.channel = channel;
		this.sound = sound;
	}

	void showTV() {
		System.out.print(name + " , " + size + " , " + channel + " , " + sound);
	}

	void channelUp() {
		channel++;
		System.out.println("채널을 올렸습니다." + channel);
	}

	void channelDown() {
		channel--;
		System.out.println("채널을 내렸습니다." + channel);
	}

	void channelChange(int channel) {			// setChannel()  메소드로 써주는게 좋음
		this.channel = channel;
		System.out.println(this.channel + " 번 채널로 변경되었습니다");

	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	void soundChange() {
		System.out.println("사운드 변경되었습니다. ");

	}

	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}
	
}
