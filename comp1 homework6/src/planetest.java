public class planetest {
	public static void main(String[] args) {
		plane myplane1 = new plane();
		plane myplane2 = new plane("아시아나",300);
		plane myplane3 = new plane("군대","전투기");
		plane myplane4 = new plane("대한항공","비행기",500);
		System.out.println("지금까지 생성된 비행기 수 : "+plane.getplanes());
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
		name = "기본";
		model = "기본";
		person = 0;
		System.out.println("이름 :" + name + "   종류 :" + model + "   인원 :" + person);
		id = ++planes;
	}

	public plane(String name, int person) {
		System.out.println("이름 :" + name + "   종류 :" + model + "   인원 :" + person);
		id = ++planes;
	}

	public plane(String name, String model) {
		System.out.println("이름 :" + name + "   종류 :" + model + "   인원 :" + person);
		id = ++planes;
	}

	public plane(String name, String model, int person) {
		System.out.println("이름 :" + name + "   종류 :" + model + "   인원 :" + person);
		id = ++planes;
	}

	public static int getplanes() {
		return planes;
	}
}