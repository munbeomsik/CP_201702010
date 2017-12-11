
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
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + call);
		System.out.println("연봉 : " + money);
	}
}
