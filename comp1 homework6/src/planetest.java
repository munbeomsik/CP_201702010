public class planetest {
	public static void main(String[] args) {
		plane myplane1 = new plane();
		plane myplane2 = new plane("�ƽþƳ�",300);
		plane myplane3 = new plane("����","������");
		plane myplane4 = new plane("�����װ�","�����",500);
		System.out.println("���ݱ��� ������ ����� �� : "+plane.getplanes());
	}
}

class plane {
	
	private String name;
	private static String model;
	private int person;
	private int id;
	private static int planes = 0;

	public String getname() {
		return name ;
	}

	public String getmodel() {
		return model ;
	}

	public int getperson() {
		return person;
	}

	public void setdata() {
		this.name = name;
		this.model = model;
		this.person = person;

	}

	public plane() {
		name = "�⺻";
		model = "�⺻";
		person = 0;
		System.out.println("�̸� :" + name + "   ���� :" + model + "   �ο� :" + person);
		id = ++planes;
	}

	public plane(String name, int person) {
		System.out.println("�̸� :" + name + "   ���� :" + model + "   �ο� :" + person);
		id = ++planes;
	}

	public plane(String name, String model) {
		System.out.println("�̸� :" + name + "   ���� :" + model + "   �ο� :" + person);
		id = ++planes;
	}

	public plane(String name, String model, int person) {
		System.out.println("�̸� :" + name + "   ���� :" + model + "   �ο� :" + person);
		id = ++planes;
	}

	public static int getplanes() {
		return planes;
	}
}