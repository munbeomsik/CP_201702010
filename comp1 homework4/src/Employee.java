
public class Employee {

	private String name;
	private String call;
	private String money;

	public String getname(){
		return name;
	}
	public String getcall(){
		return call;
	}
	public String getmoney(){
		return money;
	}
	public void setname(String a){
		name = a;
	}
	public void setcall(String b){
		call = b;
	}
	public void setmoney(String c){
		money = c;
	}
	public void print(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + call);
		System.out.println("���� : " + money);
	}
}
