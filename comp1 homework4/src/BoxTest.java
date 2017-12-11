
public class BoxTest {

	public static void main(String[] args) {
		
		Box mybox = new Box();
		mybox.setheight(10);
		mybox.setlength(20);
		mybox.setwidth(50);
		mybox.getVolume();
		
		mybox.print();
		System.out.println("ºÎÇÇ : " + mybox.getVolume());
	}

}
