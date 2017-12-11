public class shape {
	public int width;
	public int height;

	public shape(int width, int height) {
		this.width=width;
		this.height=height;
	}

	public double area() {
		return 0;
	}

}

class triangle extends shape {

	public triangle(int width, int height) {
		super(width, height);
		
	}

	public double area() {
		System.out.print("삼각형 : ");
		return (width * height * 0.5);
	}

}

class rectangle extends shape {

	public rectangle(int width, int height) {
		super(width, height);
	}

	public double area() {
		System.out.print("사각형 : ");
		return width * height;
	}


}

class circle extends shape {

	public circle(int width, int height) {
		super(width, height);
	}

	public double area() {
		System.out.print("원 : ");
		return width * width * 3.14;
	}

	
}