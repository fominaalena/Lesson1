import java.util.Scanner;

public class evenNumb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� �� 0 �� 9:");
		int a = in.nextInt();
		if (a%2 == 0) {
			System.out.println("����� ������");
		}
		else
		{
			System.out.println("����� ��������");
		}
	}
}
