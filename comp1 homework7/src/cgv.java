import java.util.Random;
import java.util.Scanner;

public class cgv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		System.out.println("�¼��� �����Ͻðڽ��ϱ�? (1(yes) or 0(no))");
		int a;
		int asd = 1;
		a = input.nextInt();

		if (a == 1) {
			System.out.println("���� ���� ���´� ������ �����ϴ�.");
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
						System.out.println("��� �¼��� �����Ͻðڽ��ϱ�.(1(������)or 0(���¼�)");
						int b = input.nextInt();
						if (sit[b - 1] == 0) {
							System.out.println("����Ǿ����ϴ�.");
							asd = 2;
						} else if (sit[b - 1] == 1) {
							System.out.println("�̹� ����� �¼��Դϴ�.");
						}
					}
				}
			}
		} else if (a == 0) {
			System.out.println("������ �����մϴ�.");
		}
		System.out.println("����ý����� �̿��� �ּż� �����մϴ�.");
	}
}
