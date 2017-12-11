import java.util.Random;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random input = new Random();
		System.out.println("<로또 생성 프로그램>");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:
				a = input.nextInt(45);
				break;
			case 1:
				b = input.nextInt(45);
				break;
			case 2:
				c = input.nextInt(45);
				break;
			case 3:
				d = input.nextInt(45);
				break;
			case 4:
				e = input.nextInt(45);
				break;
			case 5:
				f = input.nextInt(45);
				break;
			}
		}
		while (a == b) {
			b = input.nextInt(6);
		}
		while (b == c || a == c) {
			c = input.nextInt(6);
		}
		while (a == d || b == d || c == d) {
			d = input.nextInt(6);
		}
		while (a == e || b == e || c == e || d == e) {
			e = input.nextInt(6);
		}
		while (a == f || b == f || c == f || d == f || e == f) {
			f = input.nextInt(6);
		}

		System.out.print((a + 1) + " ");
		System.out.print((b + 1) + " ");
		System.out.print((c + 1) + " ");
		System.out.print((d + 1) + " ");
		System.out.print((e + 1) + " ");
		System.out.print((f + 1) + " ");

	}

}
