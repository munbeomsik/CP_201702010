import java.util.Random;
import java.util.Scanner;

public class cgv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("좌석을 예약하시겠습니까? (1(yes) or 0(no))");
		int a;
		int asd = 1;
		a = input.nextInt();

		if (a == 1) {
			System.out.println("현제 예약 상태는 다음과 같습니다.");
			System.out.println("-----------------------------------");
			int[] sit = new int[10];
			for (int i = 0; i < 10; i++) {
				sit[i] = i + 1;
				System.out.print(sit[i] + "  ");
			}
			System.out.println();
			System.out.println("-----------------------------------");
			for (int j = 0; j < 10; j++) {
				sit[j] = random.nextInt(2);
				System.out.print(sit[j] + "  ");
				if (sit[9] == 0 || sit[9] == 1) {
					System.out.println();
					while (asd == 1) {
						System.out.println("어느 좌석을 예약하시겠습니까.(1(예약중)or 0(빈좌석)");
						int b = input.nextInt();
						if (sit[b - 1] == 0) {
							System.out.println("예약되었습니다.");
							asd = 2;
						} else if (sit[b - 1] == 1) {
							System.out.println("이미 예약된 좌석입니다.");
						}
					}
				}
			}
		} else if (a == 0) {
			System.out.println("예약을 종료합니다.");
		}
		System.out.println("예약시스템을 이용해 주셔서 감사합니다.");
	}
}
