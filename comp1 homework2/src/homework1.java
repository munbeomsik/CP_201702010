import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int c;
		int b;
		int a;
		System.out.print("������ �Է��� �ּ��� : ");
		c = scan.nextInt();
		System.out.print("������ �Է��� �ּ��� : ");
		b = scan.nextInt();
		System.out.print("������ �Է��� �ּ��� : ");
		a = scan.nextInt();
		if (a >= b) {
			if (b >= c) {
				System.out.print("���ĵ� ���� : " + c + " " + b + " " + a);
			} else if (c >= b) {
				if (a >= c) {
					System.out.print("���ĵ� ���� : " + b + " " + c + " " + a);
				} else {
					System.out.print("���ĵ� ���� : " + b + " " + a + " " + c);
				}
			}
		} else if (b >= a) {
			if (a >= c) {
				System.out.print("���ĵ� ���� : " + c + " " + a + " " + b);
			} else if (c >= a) {
				if (b >= c) {
					System.out.print("���ĵ� ���� : " + a + " " + c + " " + b);
				} else {
					System.out.print("���ĵ� ���� : " + a + " " + b + " " + c);
				}
			}
		}
	}
}
