import java.util.Scanner;

public class evenNumb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число от 0 до 9:");
		int a = in.nextInt();
		if (a%2 == 0) {
			System.out.println("Число чётное");
		}
		else
		{
			System.out.println("Число нечетное");
		}
	}
}
