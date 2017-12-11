
public class homework3 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int i;
				int j;
				for (i = 0; i < 5; i++) {
					for (j = 6 - i - 1; j > 0; j--) {
						System.out.print(" ");
					}
					for (j = 0; j < 2 * i + 1; j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
				for (i = 4; i > 0; i--) {
					for (j = 6 - i; j > 0; j--) {
						System.out.print(" ");
					}
					for (j = 0; j < 2 * i - 1; j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
			}
		}
