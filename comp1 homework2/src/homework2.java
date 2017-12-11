import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		System.out.println(" 키를 입력해 주세요 : ");
		a = scan.nextDouble();
		b = (a - 100) * 0.9;
		System.out.println("키 " + a + "cm의 표준 체중은 " + b + "kg 입니다");
		System.out.print("몸무게를 입력해 주세요 : ");
		c = scan.nextDouble();

		if (c < b - (b * 0.1)) {
			System.out.println("저체중입니다.");
		} else if (c > b + (b * 0.1)) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("정상입니다.");
		}
	}
	
}