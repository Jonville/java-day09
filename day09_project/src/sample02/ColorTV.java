package sample02;

public class ColorTV extends TV{

	private int color;	
	
	ColorTV(){}
	
	ColorTV(String name, int size, int channel, int sound , int color){
		super(name, size, channel, sound);		// 해당 메소드의 첫번째에 위치해야한다.
		this.color = color;
	}
	
	int getcolor() {
		return color;
	}
	
	void showColorTV() {
		
		super.showTV();
		System.out.print(" , " + color);
	}
	
}
