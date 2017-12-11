
public class Box {
	private int width;
	private int length;
	private int height;

	public int getwidth() {
		return width;
	}

	public int getlength() {
		return length;
	}

	public int getheight() {
		return height;
	}

	public void setwidth(int a) {
		width = a;
	}

	public void setlength(int b) {
		length = b;
	}

	public void setheight(int c) {
		height = c;
	}

	private int Volume;

	public int getVolume() {
		return Volume = width * length * height;
	}
	 public void print() {
		 System.out.println("세로 : " + width);
		 System.out.println("가로 : " + length);
		 System.out.println("높이 : " + height);
	 }
}