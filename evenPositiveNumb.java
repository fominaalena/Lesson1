import java.util.Scanner;

public class evenPositiveNumb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� �� -9 �� 9:");
		int a = in.nextInt();
		if (a%2 == 0) {
			if (a>0) {
				System.out.println("�������� ����� ������ �������������");
			}
			else {
				System.out.println("�������� ����� ������ �������������");
			}
		}
		else {
			if (a>0) {
				System.out.println("�������� ����� �������� �������������");
			}
			else {
				System.out.println("�������� ����� �������� �������������");
			}
			
		}
	}
}
