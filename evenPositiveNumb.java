import java.util.Scanner;

public class evenPositiveNumb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите целое число от -9 до 9:");
		int a = in.nextInt();
		if (a%2 == 0) {
			if (a>0) {
				System.out.println("¬ведЄнное число чЄтное положительное");
			}
			else {
				System.out.println("¬ведЄнное число чЄтное отрицательное");
			}
		}
		else {
			if (a>0) {
				System.out.println("¬ведЄнное число нечЄтное положительное");
			}
			else {
				System.out.println("¬ведЄнное число нечЄтное отрицательное");
			}
			
		}
	}
}
