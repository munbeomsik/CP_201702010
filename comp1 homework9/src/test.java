import java.util.Scanner;

public class test {
	private static shape array[];

	public static void main(String[] args) {
		
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.print("길이 : ");
		a = input.nextInt();
		System.out.print("높이 : ");
		b = input.nextInt();
		
		
		array = new shape[3];
		array[0] = new triangle(a,b);
		array[1] = new rectangle(a,b);
		array[2] = new circle(a,b);	
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i].area());

		}
}
}