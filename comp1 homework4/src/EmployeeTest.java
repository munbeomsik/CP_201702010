
public class EmployeeTest {

	public static void main(String[] args) {
		Employee myEmployee = new Employee();
		myEmployee.setname("������");
		myEmployee.setcall("01049404546");
		myEmployee.setmoney("1000000000");
		
		System.out.println("���� �̸� : "+myEmployee.getname());
		System.out.println("���� ��ȭ��ȣ : "+myEmployee.getcall());
		System.out.println("���� ���� : "+myEmployee.getmoney());

	}

}
