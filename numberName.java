import java.util.Scanner;

public class numberName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� ����� �� 0 �� 9:");
		int a = in.nextInt();
		switch (a) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("���");
			break;
		case 3:
			System.out.println("���");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("����");
			break;
		case 6:
			System.out.println("�����");
			break;
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("������");
			break;
		case 9:
			System.out.println("������");
			break;
		}
	}
}
