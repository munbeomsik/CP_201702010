public class test {
	public static void main(String[] args) {
		dog mydog1 = new dog("와와", 1);
		dog mydog2 = new dog("포메","포메라니안",2);
	}

}

class dog {

	private String name;
	private static String breed;
	private int age;

	public dog(String name, int age) {
		System.out.println("이름 :"+name+" 나이 : "+age);
	}

	public dog(String name, String breed, int age) {
		System.out.println("이름 :"+name+" 종류 :"+breed+" 나이 : "+age);
	}
}