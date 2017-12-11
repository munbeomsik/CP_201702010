
public class customer extends person {

	public customer(String name, String address, String call,int customcall, int mileage) {	
	}
	public customer() {
	}

	public int customcall;
	public int mileage;

	public int getcustomcall() {
		return customcall;
	}

	public int getmileage() {
		return mileage;
	}

	public void setcustomcall(int customcall) {
		this.customcall = customcall;
	}

	public void setmileage(int mileage) {
		this.mileage = mileage;
	}
	public customer(int custumcall, int mileage) {
		
	}
}