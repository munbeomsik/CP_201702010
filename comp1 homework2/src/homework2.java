import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println(" Ű�� �Է��� �ּ��� : ");
		a = scan.nextDouble();
		b = (a - 100) * 0.9;
		System.out.println("Ű " + a + "cm�� ǥ�� ü���� " + b + "kg �Դϴ�");
		System.out.print("�����Ը� �Է��� �ּ��� : ");
		c = scan.nextDouble();

		if (c < b - (b * 0.1)) {
			System.out.println("��ü���Դϴ�.");
		} else if (c > b + (b * 0.1)) {
			System.out.println("��ü���Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
	}
	
}