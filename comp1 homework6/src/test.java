public class test {
	public static void main(String[] args) {
		dog mydog1 = new dog("�Ϳ�", 1);
		dog mydog2 = new dog("����","���޶�Ͼ�",2);
	}

}

class dog {

	private String name;
	private static String breed;
	private int age;

	public dog(String name, int age) {
		System.out.println("�̸� :"+name+" ���� : "+age);
	}

	public dog(String name, String breed, int age) {
		System.out.println("�̸� :"+name+" ���� :"+breed+" ���� : "+age);
	}
}