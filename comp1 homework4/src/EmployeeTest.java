
public class EmployeeTest {

	public static void main(String[] args) {
		Employee myEmployee = new Employee();
		myEmployee.setname("문범식");
		myEmployee.setcall("01049404546");
		myEmployee.setmoney("1000000000");
		
		System.out.println("직원 이름 : "+myEmployee.getname());
		System.out.println("직원 전화번호 : "+myEmployee.getcall());
		System.out.println("직원 월급 : "+myEmployee.getmoney());

	}

}
