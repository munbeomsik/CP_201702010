import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fivehundred,onehundred,fifty,ten;
		int money;
		System.out.print("500��¥�� ������ ���� �Է����ּ��� : ");
		fivehundred = input.nextInt();
		System.out.print("100��¥�� ������ ���� �Է����ּ��� : ");
		onehundred = input.nextInt();
		System.out.print("50��¥�� ������ ���� �Է����ּ��� : ");
		fifty = input.nextInt();
		System.out.print("10��¥�� ������ ���� �Է����ּ��� : ");
		ten = input.nextInt();
		
		money= (fivehundred *500)+(onehundred *100)+(fifty*50)+(ten*10);
		System.out.println("�����뿡�� 500��¥������ " +fivehundred+"�� 100��¥������ " +onehundred+"�� 50��¥������ "+fifty+"�� 10��¥������"+ten+"����");
		System.out.println("�����뿡 ����ִ� �׼��� "+money+ "�� �Դϴ�.");
	}

}
