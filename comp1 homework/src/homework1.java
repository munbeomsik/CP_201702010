import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int fivehundred,onehundred,fifty,ten;
		int money;
		System.out.print("500원짜리 동전의 수를 입력해주세요 : ");
		fivehundred = input.nextInt();
		System.out.print("100원짜리 동전의 수를 입력해주세요 : ");
		onehundred = input.nextInt();
		System.out.print("50원짜리 동전의 수를 입력해주세요 : ");
		fifty = input.nextInt();
		System.out.print("10원짜리 동전의 수를 입력해주세요 : ");
		ten = input.nextInt();
		
		money= (fivehundred *500)+(onehundred *100)+(fifty*50)+(ten*10);
		System.out.println("저금통에는 500원짜리동전 " +fivehundred+"개 100원짜리동전 " +onehundred+"개 50원짜리동전 "+fifty+"개 10원짜리동전"+ten+"개로");
		System.out.println("저금통에 들어있는 액수는 "+money+ "원 입니다.");
	}

}
