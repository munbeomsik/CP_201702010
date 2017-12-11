import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int c;
		int b;
		int a;
		System.out.print("정수를 입력해 주세요 : ");
		c = scan.nextInt();
		System.out.print("정수를 입력해 주세요 : ");
		b = scan.nextInt();
		System.out.print("정수를 입력해 주세요 : ");
		a = scan.nextInt();
		if (a >= b) {
			if (b >= c) {
				System.out.print("정렬된 숫자 : " + c + " " + b + " " + a);
			} else if (c >= b) {
				if (a >= c) {
					System.out.print("정렬된 숫자 : " + b + " " + c + " " + a);
				} else {
					System.out.print("정렬된 숫자 : " + b + " " + a + " " + c);
				}
			}
		} else if (b >= a) {
			if (a >= c) {
				System.out.print("정렬된 숫자 : " + c + " " + a + " " + b);
			} else if (c >= a) {
				if (b >= c) {
					System.out.print("정렬된 숫자 : " + a + " " + c + " " + b);
				} else {
					System.out.print("정렬된 숫자 : " + a + " " + b + " " + c);
				}
			}
		}
	}
}
