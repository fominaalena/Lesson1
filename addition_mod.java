import java.util.Scanner;

public class addition_mod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ ����� �����:");
		int a = in.nextInt();
		System.out.println("������� ������ ����� �����:");
		int b = in.nextInt();
		System.out.println("������� ���� ��������:");
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
