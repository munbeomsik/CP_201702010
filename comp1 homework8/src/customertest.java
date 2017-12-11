
public class customertest {

	public static void main(String[] args) {

		person mycus = new person();
		mycus.setname("문범식");
		mycus.setcall("01049404546");
		mycus.setaddress("충청남도 아산시");
		System.out.print("  이름:" + mycus.getname());
		System.out.print("  전화번호:" + mycus.getcall());
		System.out.println("  주소:" + mycus.getaddress());

		customer mycus2 = new customer();
		mycus2.setname("문범식");
		mycus2.setcall("01049404546");
		mycus2.setaddress("충청남도 아산시");
		mycus2.setcustomcall(100);
		mycus2.setmileage(1000000);
		System.out.print("  이름:" + mycus2.getname());
		System.out.print("  전화번호:" + mycus2.getcall());
		System.out.print("  주소:" + mycus2.getaddress());
		System.out.print("  고객번호:" + mycus2.getcustomcall());
		System.out.println("  마일리지:" + mycus2.getmileage());
	}

}