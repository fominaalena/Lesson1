import java.util.Scanner;

public class addition_mod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите первое целое число:");
		int a = in.nextInt();
		System.out.println("¬ведите второе целое число:");
		int b = in.nextInt();
		System.out.println("¬ведите знак операции:");
		String s = in.next();
		int c = 0;
		if (s.equals("+")) {
			c = a+b;
		}
		if (s.equals("-")) {
			c = a-b;
		}
		if (s.equals("*")) {
			c = a*b;
		}
		if (s.equals("/")) {
			c = a/b;
		}
		System.out.println(c);
	}

}
