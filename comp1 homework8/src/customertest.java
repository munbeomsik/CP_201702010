
public class customertest {

	public static void main(String[] args) {

		person mycus = new person();
		mycus.setname("������");
		mycus.setcall("01049404546");
		mycus.setaddress("��û���� �ƻ��");
		System.out.print("  �̸�:" + mycus.getname());
		System.out.print("  ��ȭ��ȣ:" + mycus.getcall());
		System.out.println("  �ּ�:" + mycus.getaddress());

		customer mycus2 = new customer();
		mycus2.setname("������");
		mycus2.setcall("01049404546");
		mycus2.setaddress("��û���� �ƻ��");
		mycus2.setcustomcall(100);
		mycus2.setmileage(1000000);
		System.out.print("  �̸�:" + mycus2.getname());
		System.out.print("  ��ȭ��ȣ:" + mycus2.getcall());
		System.out.print("  �ּ�:" + mycus2.getaddress());
		System.out.print("  ����ȣ:" + mycus2.getcustomcall());
		System.out.println("  ���ϸ���:" + mycus2.getmileage());
	}

}